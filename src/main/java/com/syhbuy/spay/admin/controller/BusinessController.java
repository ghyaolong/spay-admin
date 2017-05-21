package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.Business;
import com.syhbuy.spay.admin.service.BusinessService;

/**
 * 交易管理 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午4:57:42
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/business/")
public class BusinessController extends BaseController {

	@Autowired
	BusinessService businessService;

	/**
	 * 跳转列表页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("btns", this.findBtns());
		return "/business/list";
	}

	/**
	 * 交易列表查询
	 * 
	 * @param business对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<Business> page(Business business, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<Business> pageList = businessService.findAllBussiness(business);

		PageInfo<Business> page = new PageInfo<Business>(pageList);

		return page;
	}

	/**
	 * 交易详情
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("findById")
	public String findRecordById(String id, Model model) {
		Business business = businessService.findById(id);
		model.addAttribute("business", business);
		return "/business/edit";
	}

	/**
	 * 跳转添加交易页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add() {

		return "/business/add";

	}

	/**
	 * 添加交易信息
	 * 
	 * @return
	 */
	@RequestMapping("saveBusiness")
	@ResponseBody
	public String saveBusiness(Business business) {

		businessService.saveBusiness(business);

		return "success";
	}

	/**
	 * 删除交易信息
	 * 
	 * @return
	 */
	@RequestMapping("deleteBusiness")
	@ResponseBody
	public String deleteBusiness(String id) {

		businessService.deleteBusiness(id);

		return "success";
	}

	/**
	 * 跳转修改交易信息控制层
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "updateBusiness")
	public String update(String id, Model model) {

		Business business = businessService.findById(id);

		model.addAttribute("business", business);

		return "/business/update";
	}

	/**
	 * 修改交易信息
	 * 
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public String updateBusiness(Business business) {

		businessService.updateBusiness(business);

		return "success";
	}
}
