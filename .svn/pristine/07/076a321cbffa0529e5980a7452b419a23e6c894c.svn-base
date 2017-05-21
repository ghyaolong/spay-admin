package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.AjaxJSON;
import com.syhbuy.spay.admin.entity.Parameter;
import com.syhbuy.spay.admin.entity.PayBound;
import com.syhbuy.spay.admin.service.ParameterService;
import com.syhbuy.spay.admin.service.PayBoundService;

/**
 * 业务定义 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年10月14日 下午11:20:00
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@EnableTransactionManagement
@Controller
@RequestMapping("/payBound/")
public class PayBoundController extends BaseController {

	@Autowired
	private PayBoundService payBoundService;

	@Autowired
	private ParameterService ParameterService;

	@RequestMapping("rulelist")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/payBound/rulelist";
	}

	/**
	 * 大小额规则列表页
	 * 
	 * @param bound
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<PayBound> page(PayBound payBound, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<PayBound> pageList = payBoundService.findBound(payBound);

		PageInfo<PayBound> page = new PageInfo<PayBound>(pageList);

		return page;
	}

	/**
	 * 充值规则设置
	 * 
	 * @param parameter
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("rule")
	public String listBt(Model model) {

		return "/payBound/guize";

	}

	/**
	 * 充值规则设置
	 * 
	 * @param parameter
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/ruleAdd", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJSON ruleAdd(Parameter parameter) {
		AjaxJSON json = new AjaxJSON();
		try {
			ParameterService.ruleAdd(parameter);
			json.setSuccess(true);
			json.setObject(parameter);
			json.setMsg("操作成功");
		}
		catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("操作失败");
		}
		return json;
	}

}
