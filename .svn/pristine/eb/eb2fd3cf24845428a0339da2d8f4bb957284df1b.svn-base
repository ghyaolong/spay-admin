package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.BusinessDef;
import com.syhbuy.spay.admin.service.BusinessDefService;

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
@Controller
@RequestMapping("/businessDef/")
public class BusinessDefController extends BaseController {

	@Autowired
	private BusinessDefService businessDefService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/businessDef/list";
	}

	/**
	 * 业务定义列表查询
	 * 
	 * @param businessDef
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<BusinessDef> page(BusinessDef businessDef, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<BusinessDef> pageList = businessDefService.findAll(businessDef);

		PageInfo<BusinessDef> page = new PageInfo<BusinessDef>(pageList);

		return page;
	}

	/**
	 * 跳转添加业务定义页面
	 */
	@RequestMapping("add")
	public String add() {

		return "/businessDef/add";

	}

	/**
	 * 添加规则控制层
	 * 
	 * @param businessDef
	 * @return
	 */

	@RequestMapping("save")
	@ResponseBody
	public String save(BusinessDef businessDef) {

		businessDefService.save(businessDef);

		return "success";
	}

	/**
	 * 删除业务控制层
	 * 
	 * @return
	 */
	@RequestMapping("deleteBusinessDef")
	@ResponseBody
	public String deleteBusinessDef(String id) {

		businessDefService.deleteBusinessDef(id);

		return "success";

	}

	/**
	 * 跳转修改规则控制层
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "updateBusinessDef")
	public String updateRule(String id, Model model) {

		BusinessDef businessDef = businessDefService.findById(id);

		model.addAttribute("businessDef", businessDef);

		return "/businessDef/update";
	}

	/**
	 * 修改规则
	 * 
	 * @param businessDef
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(BusinessDef businessDef) {

		businessDefService.update(businessDef);

		return "success";

	}

	/**
	 * @param businessDef
	 * @return
	 */
	@RequestMapping("getBusinessDef")
	@ResponseBody
	public List<BusinessDef> loadOption(BusinessDef businessDef) {
		List<BusinessDef> pageList = businessDefService.findAll(businessDef);
		return pageList;
	}
}
