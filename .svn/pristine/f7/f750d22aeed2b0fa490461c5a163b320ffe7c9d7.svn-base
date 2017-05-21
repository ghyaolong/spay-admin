package com.syhbuy.spay.admin.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.HttpRequester;
import com.syhbuy.spay.admin.base.util.HttpResponse;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entity.BalanceRecord;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;
import com.syhbuy.spay.admin.service.BalanceRecordService;
import com.syhbuy.spay.admin.service.BalanceService;
import com.syhbuy.spay.admin.service.PayLargeRechargeRecordService;

/**
 * 大额充值审核 TopuPauditVo对象
 * <p>
 * Copyright: Copyright (c) 2016年9月21日 下午1:29:33
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@EnableTransactionManagement
@RequestMapping(value = "/topuPaudit/")
@Controller
public class TopuPauditController extends BaseController {

	private final Logger log = Logger.getLogger(TopuPauditController.class);

	@Autowired
	private PayLargeRechargeRecordService payLargeRechargeRecordService;

	@Autowired
	private BalanceService balanceService;

	@Autowired
	private BalanceRecordService balanceRecordService;

	/**
	 * 大额充值审核列表页
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list")
	public String listBtns(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/topuPaudit/list";
	}

	@ResponseBody
	@RequestMapping("page")
	public PageInfo<TopuPauditVo> page(TopuPauditVo topuPauditVo, int pageNum, int pageSize) {
		if (topuPauditVo != null && topuPauditVo.getSearchStartTime() != null && topuPauditVo.getSearchEndTime() != null && !"".equals(topuPauditVo.getSearchStartTime()) && !"".equals(topuPauditVo.getSearchEndTime())) {
			topuPauditVo.setStartTime(DateUtils.convertDataToLong("".equals(topuPauditVo.getSearchStartTime()) ? "" : topuPauditVo.getSearchStartTime()));
			topuPauditVo.setEndTime(DateUtils.convertDataToLong("".equals(topuPauditVo.getSearchEndTime()) ? "" : topuPauditVo.getSearchEndTime()));
		}

		PageHelper.startPage(pageNum, pageSize);

		List<TopuPauditVo> topuPauditVoList = payLargeRechargeRecordService.queryAllRecord(topuPauditVo);
		for (TopuPauditVo topuPauditVo2 : topuPauditVoList) {

			topuPauditVo2.setBankFlow(topuPauditVo2.getBankFlow() == null ? "" : topuPauditVo2.getBankFlow());
			topuPauditVo2.setRemark(topuPauditVo2.getRemark() == null ? "" : topuPauditVo2.getRemark());
			topuPauditVo2.setStateDesc(topuPauditVo2.getStateDesc() == null ? "" : topuPauditVo2.getStateDesc());
			topuPauditVo2.setAuDate(topuPauditVo2.getAuditDate() != null ? DateUtils.getDateTime(topuPauditVo2.getAuditDate()) : "");
			topuPauditVo2.setPhone(topuPauditVo2.getPhone() == null ? "" : topuPauditVo2.getPhone());
			if (topuPauditVo2.getRechargeDate() != null) {
				topuPauditVo2.setRechargeDateShow(DateUtils.getDateTime(topuPauditVo2.getRechargeDate()));
			} else {
				topuPauditVo2.setRechargeDateShow("");
			}
		}
		// 用PageInfo对结果进行包装
		PageInfo<TopuPauditVo> page = new PageInfo<TopuPauditVo>(topuPauditVoList);

		return page;
	}

	/**
	 * 跳转详情页面 1.拿到选中记录的ID 2.根据ID在数据库中找到对应的充值记录 3.将充值记录放在model中共享至界面
	 * 4.在JSP页面上通过EL表达式拿到model中的数据进行展示
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("topuPauditsh")
	public String topuPauditsh(String id, Model mode) {
		// 根据Id查询
		TopuPauditVo topuPauditVo = payLargeRechargeRecordService.topuPauditById(id);
		topuPauditVo.setRechargeDateShow(DateUtils.getDateTime(topuPauditVo.getRechargeDate()));
		topuPauditVo.setAuDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		mode.addAttribute("topuPauditVo", topuPauditVo);

		return "/topuPaudit/topuPauditxq";
	}

	/**
	 * 大额审核提交
	 * 
	 * @param topuPauditVo
	 * @return
	 */
	@Transactional
	@RequestMapping("topuPauditUpdate")
	@ResponseBody
	@SuppressWarnings("unused")
	public String topuPauditUpdate(MemberRecordVo memberRecordVo) {
		memberRecordVo.setAuditDate(DateUtils.getCurrTime());
		String state = memberRecordVo.getState();
		if ("3".equals(state)) {
			// 审核
			payLargeRechargeRecordService.topuPauditUpdate(memberRecordVo);
			// 查询userID
			memberRecordVo.setUserId(memberRecordVo.getUserId());
			// 充值金额
			BigDecimal payAccount = memberRecordVo.getPayAccount();
			memberRecordVo.setPayAccount(payAccount);

			// 添加一条会员余额账户流水
			BalanceRecord balanceRecord = new BalanceRecord();
			// 交易金额
			balanceRecord.setAmount(memberRecordVo.getPayAccount());

			balanceRecord.setUserId(memberRecordVo.getUserId());
			balanceRecord.setTransactionState("1");
			balanceRecord.setCondition("0");
			balanceRecord.setTranId(IDGeneratorUtils.getOrderID());
			balanceRecord.setCreateDate(DateUtils.getCurrTime());
			Balance balance = balanceService.findByUserId(memberRecordVo.getUserId());
			BigDecimal yue = balance.getAccountBalance() == null ? new BigDecimal(0) : balance.getAccountBalance();
			// 当前账户余额
			balanceRecord.setBeforeChangBlance(yue);
			// 充值前余额
			BigDecimal s = yue;
			// 充值后余额
			BigDecimal t = memberRecordVo.getPayAccount().add(s);
			balanceRecord.setAfterChangeBlance(t);
			balanceRecordService.save(balanceRecord);
			// 修改会员余额账户数据
			balanceService.update(memberRecordVo);
		} else {
			memberRecordVo.setState("4");
			// 添加一条会员余额账户流水
			BalanceRecord balanceRecord = new BalanceRecord();
			// 交易金额
			balanceRecord.setAmount(memberRecordVo.getPayAccount());
			Balance balance = balanceService.findByUserId(memberRecordVo.getUserId());
			BigDecimal yue = balance.getAccountBalance() == null ? new BigDecimal(0) : balance.getAccountBalance();
			// 当前账户余额
			balanceRecord.setBeforeChangBlance(yue);
			balanceRecord.setAfterChangeBlance(yue);
			balanceRecord.setUserId(memberRecordVo.getUserId());
			balanceRecord.setTransactionState("0");
			balanceRecord.setCondition("0");
			balanceRecord.setTranId(IDGeneratorUtils.getOrderID());
			balanceRecord.setCreateDate(DateUtils.getCurrTime());
			balanceRecordService.save(balanceRecord);
			payLargeRechargeRecordService.topuPauditUpdate(memberRecordVo);
		}
		// 调ＰＨＰ接口
		String url = "http://api.syhbuy.cn/api/index.php";
		// 参数 ： reskey 订单号（reskey） ，state 审核状态（3 审核通过 4 审核驳回）
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "q1w2e3r4t5");
		map.put("module", "examine");
		map.put("method", "index");
		map.put("reskey", memberRecordVo.getReskey());
		map.put("state", memberRecordVo.getState());
		try {
			HttpResponse response = HttpRequester.sendPost(url, map);
			String ss = response.getContent();

			JSONObject obj = JSONObject.parseObject(ss);

		}
		catch (IOException e) {

			log.error("调ＰＨＰ接口异常", e);
		}

		return "success";

	}
}