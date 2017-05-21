package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.entity.BalanceRecord;
import com.syhbuy.spay.admin.service.BalanceRecordService;

/**
 * 交易流水. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-10-15 下午8:49:32
 * <p>
 * Company: 善友汇科技股份有限公司
 * <p>
 * 
 * @author 邓鹏
 * @version 1.0.0
 */
@Controller
@RequestMapping("/payBalanceRecord/")
public class PayBalanceRecordController extends BaseController {

	@Autowired
	private BalanceRecordService balanceRecordSerivce;

	@RequestMapping("list")
	public String getAllDispenseRule(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/payBalanceRecord/list";
	}

	/**
	 * 交易流水列表页数据显示
	 * 
	 * @param balanceRecord
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<BalanceRecord> page(BalanceRecord balanceRecord, int pageNum, int pageSize) {

		if (balanceRecord != null && balanceRecord.getSearchStartTime() != null && balanceRecord.getSearchEndTime() != null && !"".equals(balanceRecord.getSearchStartTime()) && !"".equals(balanceRecord.getSearchEndTime())) {
			balanceRecord.setStartTime(DateUtils.convertDataToLong(balanceRecord.getSearchStartTime()));
			balanceRecord.setEndTime(DateUtils.convertDataToLong(balanceRecord.getSearchEndTime()));
		}
		PageHelper.startPage(pageNum, pageSize);

		List<BalanceRecord> pageList = balanceRecordSerivce.findAllBalanceRecord(balanceRecord);
		for (BalanceRecord balanceRecord2 : pageList) {
			balanceRecord2.setTranId(balanceRecord2.getTranId() == null ? "" : balanceRecord2.getTranId());
			if (balanceRecord2.getCreateDate() != null) {
				balanceRecord2.setCreateDateShow(DateUtils.getDateTime(balanceRecord2.getCreateDate()));
			} else {
				balanceRecord2.setCreateDateShow("");
			}
			if (balanceRecord2.getUpdateDate() != null) {
				balanceRecord2.setUpdateDateShow(DateUtils.getDateTime(balanceRecord2.getUpdateDate()));
			} else {
				balanceRecord2.setUpdateDateShow("");
			}
			balanceRecord2.setCondition(balanceRecord2.getCondition() == null ? "" : balanceRecord2.getCondition());
			balanceRecord2.setTransactionState(balanceRecord2.getTransactionState() == null ? "" : balanceRecord2.getTransactionState());
			balanceRecord2.setPhone(balanceRecord2.getPhone() == null ? "" : balanceRecord2.getPhone());
		}

		PageInfo<BalanceRecord> page = new PageInfo<BalanceRecord>(pageList);

		return page;
	}
}
