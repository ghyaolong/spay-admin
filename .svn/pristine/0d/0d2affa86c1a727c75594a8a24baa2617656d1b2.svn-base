package com.syhbuy.spay.admin.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.dao.BalanceRecordMapper;
import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entity.BalanceRecord;
import com.syhbuy.spay.admin.entity.PayApply;
import com.syhbuy.spay.admin.service.BalanceService;
import com.syhbuy.spay.admin.service.PayApplyService;

/**
 * 后台调账. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:16:19
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@EnableTransactionManagement
@Controller
@RequestMapping("/PayApplyBalance/")
public class PayApplyBalanceController extends BaseController {

	@Autowired
	private PayApplyService payApplyService;

	@Autowired
	private BalanceService balanceservice;

	@Autowired
	private BalanceRecordMapper balanceRecordMapper;

	/**
	 * 跳转列表页面
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/Balance/ApplyBalancelist";
	}

	/**
	 * 调账列表页数据查询
	 * 
	 * @param payApply
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<PayApply> page(PayApply payApply, int pageNum, int pageSize) {

		if (payApply != null && payApply.getSearchStartTime() != null && payApply.getSearchEndTime() != null && !"".equals(payApply.getSearchStartTime()) && !"".equals(payApply.getSearchEndTime())) {
			payApply.setStartTime(DateUtils.convertDataToLong(payApply.getSearchStartTime()));
			payApply.setEndTime(DateUtils.convertDataToLong(payApply.getSearchEndTime()));
		}
		PageHelper.startPage(pageNum, pageSize);
		List<PayApply> payApplyList = payApplyService.findAll(payApply);
		for (PayApply payApply2 : payApplyList) {
			if (payApply2.getBalancedate() != null) {
				payApply2.setSearchStartTime(DateUtils.getDateTime(payApply2.getBalancedate()));
			}
			if (payApply2.getApplydate() != null) {
				payApply2.setSearchEndTime(DateUtils.getDateTime(payApply2.getApplydate()));
			}
		}

		// 用PageInfo对结果进行包装
		PageInfo<PayApply> page = new PageInfo<PayApply>(payApplyList);

		return page;

	}

	/**
	 * 跳转审核页面
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("add")
	public String detailsById(String id, Model mode) {
		// 根据Id查询
		PayApply payApply = payApplyService.ById(id);
		if (payApply.getApplydate() != null) {
			payApply.setSearchEndTime(DateUtils.getDateTime(payApply.getApplydate()));
		}

		if (payApply.getState().equals("审核中")) {
			payApply.setState("1");
		} else if (payApply.getState().equals("审核通过")) {
			payApply.setState("2");
		} else if (payApply.getState().equals("审核驳回")) {
			payApply.setState("3");
		}
		mode.addAttribute("payApply", payApply);

		return "/Balance/shenhe";
	}

	/**
	 * 调账审核控制层
	 * 
	 * @param PayApply
	 * @return
	 */
	@Transactional
	@RequestMapping("addPayApplyBalance")
	@ResponseBody
	public String addPayApplyBalance(PayApply payApply) {
		BigDecimal total = balanceservice.findByUserId(payApply.getUserid()).getAccountBalance();
		BigDecimal account = new BigDecimal(payApply.getBalanceamount());
		BalanceRecord memberRecordVo = new BalanceRecord();
		Map map = new HashMap();
		Balance balance = new Balance();
		balance.setUserId(payApply.getUserid());
		balance.setAccountBalance(new BigDecimal(payApply.getBalanceamount()));
		// 审核通过
		if ("2".equals(payApply.getState())) {
			// 增加
			if ("增加金额".equals(payApply.getApplytype())) {
				memberRecordVo.setUserId(payApply.getUserid()); // userId
				memberRecordVo.setTranId(IDGeneratorUtils.getOrderID()); // 交易号
				memberRecordVo.setAmount(new BigDecimal(payApply.getBalanceamount())); // 金额
				memberRecordVo.setCondition("7"); // 交易类型 后台增款
				memberRecordVo.setBeforeChangBlance(total);// 变动前金额
				memberRecordVo.setAfterChangeBlance(total.add(account)); // 变动后总金额
				memberRecordVo.setTransactionState("1"); // 交易状态
				memberRecordVo.setCreateDate(DateUtils.getCurrTime()); // 创建时间
				memberRecordVo.setUpdateDate(DateUtils.getCurrTime()); // 修改时间
				memberRecordVo.setBusinessFlow(null); // 业务流水
				memberRecordVo.setBalanceId(payApply.getUserid());
				memberRecordVo.setCreateDate((DateUtils.getCurrTime()));
				memberRecordVo.setSearchEndTime(null);
				// 增加会员余额账户
				balanceservice.plusBalance(balance);
				// 添加余额账户流水
				balanceRecordMapper.save(memberRecordVo);
				// 修改申请状态
				payApplyService.changeType(payApply);
				// 减少
				return "success";
			} else if ("减少金额".equals(payApply.getApplytype())) {
				if (account.compareTo(total) == 1) {
					map.put("reCode", "0");
					map.put("msg", "账户余额不足");
					return "账户余额不足";
				} else {
					balanceservice.subtractionBalance(balance);// 减少账户余额
					// 插入余额账户流水
					payApplyService.changeType(payApply);
					memberRecordVo.setUserId(payApply.getUserid()); // userId
					memberRecordVo.setTranId(IDGeneratorUtils.getOrderID()); // 交易号
					memberRecordVo.setAmount(new BigDecimal(payApply.getBalanceamount())); // 金额
					memberRecordVo.setCondition("8"); // 交易类型  后台减款
					memberRecordVo.setBeforeChangBlance(total); // 变动前金额
					memberRecordVo.setAfterChangeBlance(total.subtract(account)); // 变动后总金额
					memberRecordVo.setBusinessFlow(null); // 业务流水
					memberRecordVo.setCreateDate(System.currentTimeMillis()); // 创建时间
					memberRecordVo.setUpdateDate(DateUtils.getCurrTime()); // 修改时间
					memberRecordVo.setTransactionState("1"); // 交易状态
					memberRecordVo.setCreateDate((DateUtils.getCurrTime()));
					memberRecordVo.setBalanceId(payApply.getUserid());
					memberRecordVo.setSearchEndTime("");
					balanceRecordMapper.save(memberRecordVo);
					map.put("reCode", "1");
					map.put("msg", "调账成功！");
				}
			}
			return "success";
			// 驳回申请
		} else if ("3".equals(payApply.getState())) {
			
			if ("增加金额".equals(payApply.getApplytype())) {
				memberRecordVo.setUserId(payApply.getUserid()); // userId
				memberRecordVo.setTranId(IDGeneratorUtils.getOrderID()); // 交易号
				memberRecordVo.setAmount(new BigDecimal(payApply.getBalanceamount())); // 金额
				memberRecordVo.setCondition("7"); // 交易类型 后台增款
				memberRecordVo.setBeforeChangBlance(total);// 变动前金额
				memberRecordVo.setAfterChangeBlance(total); // 变动后总金额
				memberRecordVo.setTransactionState("0"); // 交易状态
				memberRecordVo.setCreateDate(DateUtils.getCurrTime()); // 创建时间
				memberRecordVo.setUpdateDate(DateUtils.getCurrTime()); // 修改时间
				memberRecordVo.setBusinessFlow(null); // 业务流水
				memberRecordVo.setBalanceId(payApply.getUserid());
				memberRecordVo.setCreateDate((DateUtils.getCurrTime()));
				memberRecordVo.setSearchEndTime(null);
				// 添加余额账户流水
				balanceRecordMapper.save(memberRecordVo);
			} else{
				if ("减少金额".equals(payApply.getApplytype())) {
					memberRecordVo.setUserId(payApply.getUserid()); // userId
					memberRecordVo.setTranId(IDGeneratorUtils.getOrderID()); // 交易号
					memberRecordVo.setAmount(new BigDecimal(payApply.getBalanceamount())); // 金额
					memberRecordVo.setCondition("8"); // 交易类型  后台减款
					memberRecordVo.setBeforeChangBlance(total);// 变动前金额
					memberRecordVo.setAfterChangeBlance(total); // 变动后总金额
					memberRecordVo.setTransactionState("0"); // 交易状态
					memberRecordVo.setCreateDate(DateUtils.getCurrTime()); // 创建时间
					memberRecordVo.setUpdateDate(DateUtils.getCurrTime()); // 修改时间
					memberRecordVo.setBusinessFlow(null); // 业务流水
					memberRecordVo.setBalanceId(payApply.getUserid());
					memberRecordVo.setCreateDate((DateUtils.getCurrTime()));
					memberRecordVo.setSearchEndTime(null);
					// 添加余额账户流水
					balanceRecordMapper.save(memberRecordVo); 
			 }
			payApplyService.changeType(payApply);
			map.put("reCode", "-1");
			map.put("msg", "驳回申请");
			return "success";
			}	
		}
		return "success";
	}
}
