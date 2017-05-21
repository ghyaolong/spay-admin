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
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:04:50
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/orient/")
public class OrientController extends BaseController {

	@Autowired
	BusinessService businessService;

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("btns", this.findBtns());
		return "/orient/list";
	}

	/**
	 * @param user对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<Business> page(Business orient, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<Business> pageList = businessService.findAllBussiness(orient);

		PageInfo<Business> page = new PageInfo<Business>(pageList);

		return page;
	}

	@RequestMapping("addRule")
	public String savePayActive() {
		return "payActive/add";

	}

}
