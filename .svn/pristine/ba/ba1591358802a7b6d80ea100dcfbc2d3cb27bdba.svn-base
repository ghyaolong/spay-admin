package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entity.PayApply;
import com.syhbuy.spay.admin.service.BalanceService;
import com.syhbuy.spay.admin.service.PayApplyService;

/**
 * 后台调账控制层<br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:17:48
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@EnableTransactionManagement
@Controller
@RequestMapping("/Balance/")
public class PayBalanceController extends BaseController {

	@Autowired
	private BalanceService balanceservice;

	@Autowired
	private PayApplyService payApplyService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/Balance/list";
	}

	/**
	 * 调账列表显示
	 * 
	 * @param balance
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<Balance> page(Balance balance, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);
		List<Balance> balanceList = balanceservice.listAll(balance);
		for (Balance balance2 : balanceList) {
			balance2.setPhone(balance2.getPhone() == null ? "" : balance2.getPhone());
		}
		// 用PageInfo对结果进行包装
		PageInfo<Balance> page = new PageInfo<Balance>(balanceList);
		return page;
	}

	/**
	 * 跳转增加页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add(String id, Model model) {

		Balance balance = balanceservice.findById(id);

		model.addAttribute("balance", balance);

		return "/Balance/add";
	}

	/**
	 * | 跳转减少页面
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("reduce")
	public String addReduce(String id, Model model) {

		Balance b = balanceservice.ById(id);

		model.addAttribute("b", b);

		return "/Balance/reduce";
	}

	/**
	 * 添加金额
	 * 
	 * @param activeRelation
	 * @return
	 */
	@RequestMapping(value = "addPayApply")
	@ResponseBody
	public String update(PayApply payApply) {

		Balance balance = new Balance();
		payApply.setUserid(payApply.getUserId());
		payApply.setBeforebalance(balance.getAccountBalance() + "");
		payApply.setState("1"); // 1.未审核 2.审核
		payApply.setBalancedate(DateUtils.getCurrTime());
		payApply.setAdvice(payApply.getAdvice());
		payApply.setApplytype("0");
		payApply.setApplydate(DateUtils.getCurrTime());
		payApplyService.insert(payApply);

		return "success";
	}

	/**
	 * 减少金额
	 * 
	 * @param activeRelation
	 * @return
	 */
	@RequestMapping(value = "addReduce")
	@ResponseBody
	public String addReduce(PayApply payApply) {
		Balance balance = new Balance();
		payApply.setUserid(payApply.getUserId());
		payApply.setBeforebalance(balance.getAccountBalance() + "");
		payApply.setState("1"); // 1.未 审核 2.审核
		payApply.setBalancedate(DateUtils.getCurrTime());
		payApply.setAdvice(payApply.getAdvice()); // 意见
		payApply.setApplytype("1");
		payApply.setApplydate(DateUtils.getCurrTime());
		payApplyService.insert(payApply);

		return "success";
	}

}