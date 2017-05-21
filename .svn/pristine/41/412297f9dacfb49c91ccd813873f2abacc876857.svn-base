package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.Rule;
import com.syhbuy.spay.admin.service.RuleService;

/**
 * 规则列表 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年10月12日 下午4:17:29
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Controller
@RequestMapping("/Rule/")
public class RuleController extends BaseController {

	@Autowired
	private RuleService ruleService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/rule/list";
	}

	/**
	 * 规则列表查询
	 * 
	 * @param rule
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<Rule> page(Rule rule, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<Rule> pageList = ruleService.queryAll(rule);

		PageInfo<Rule> page = new PageInfo<Rule>(pageList);

		return page;
	}

	/**
	 * 规则全查
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping("getRule")
	@ResponseBody
	public List<Rule> loadOption(Rule rule) {
		List<Rule> pageList = ruleService.queryAll(rule);
		return pageList;
	}

	/**
	 * 跳转添加规则页面
	 */
	@RequestMapping("add")
	public String add() {

		return "/rule/add";

	}

	/**
	 * 规则控制层
	 * 
	 * @param rule
	 * @return
	 */

	@RequestMapping("save")
	@ResponseBody
	public String save(Rule rule) {
		ruleService.save(rule);

		return "success";
	}

	/**
	 * 删除规则控制层
	 * 
	 * @return
	 */
	@RequestMapping("deleteRule")
	@ResponseBody
	public String deleteNewsPushed(String id) {

		ruleService.deleteRule(id);

		return "success";

	}

	/**
	 * 跳转修改规则控制层
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping(value = "updateRule")
	public String updateRule(String id, Model model) {

		Rule rule = ruleService.FindAll(id);

		model.addAttribute("rule", rule);

		return "/rule/updateRule";
	}

	/**
	 * 修改规则
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(Rule rule) {

		ruleService.update(rule);

		return "success";

	}
}
