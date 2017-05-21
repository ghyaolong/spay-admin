package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.DispenseRule;
import com.syhbuy.spay.admin.service.DispenseRuleService;

/**
 * 代金券规则 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:01:35
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/dispenseRule/")
public class DispenseRuleController {

	@Autowired
	private DispenseRuleService dispenseRuleService;

	@RequestMapping("list")
	public String getAllDispenseRule(Model model) {
		return "/dispenseRule/list";
	}

	public String updateDispenseRule(DispenseRule dispenseRule) {

		return "";
	}

	public String deleteDispenseRule(DispenseRule dispenseRule) {
		dispenseRuleService.deleteDispenseRule(dispenseRule);
		return "";
	}

	/**
	 * 规则列表
	 * 
	 * @param dispenseRule
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<DispenseRule> page(DispenseRule dispenseRule, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<DispenseRule> pageList = dispenseRuleService.getAllDispenseRule(dispenseRule);

		PageInfo<DispenseRule> page = new PageInfo<DispenseRule>(pageList);

		return page;
	}

}
