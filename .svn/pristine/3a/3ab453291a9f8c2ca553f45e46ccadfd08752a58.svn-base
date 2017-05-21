package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.ActiveRelation;
import com.syhbuy.spay.admin.service.ActiveRelationService;

/**
 * 业务规则列表 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年10月14日 下午6:30:19
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Controller
@RequestMapping("/activeRelation/")
public class ActiveRelationController extends BaseController {

	@Autowired
	private ActiveRelationService activeRelationService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/activeRelation/list";
	}

	@ResponseBody
	@RequestMapping("page")
	public PageInfo<ActiveRelation> page(ActiveRelation activeRelation, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<ActiveRelation> activeRelationList = activeRelationService.findAll(activeRelation);

		// 用PageInfo对结果进行包装
		PageInfo<ActiveRelation> page = new PageInfo<ActiveRelation>(activeRelationList);

		return page;

	}

	/**
	 * 跳转添加规则页面
	 */
	@RequestMapping("add")
	public String add() {

		return "/activeRelation/add";

	}

	/**
	 * 添加规则控制层
	 * 
	 * @param activeRelation
	 * @return
	 */

	@RequestMapping("save")
	@ResponseBody
	public String save(ActiveRelation activeRelation) {

		activeRelationService.save(activeRelation);

		return "success";
	}

	/**
	 * 删除规则业务控制层
	 * 
	 * @return
	 */
	@RequestMapping("deleteActiveRelation")
	@ResponseBody
	public String deleteActiveRelation(String id) {

		activeRelationService.deleteActiveRelation(id);

		return "success";

	}

	/**
	 * 跳转修改规则控制层
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "updateActiveRelation")
	public String updateActiveRelation(String id, Model model) {

		ActiveRelation activeRelation = activeRelationService.activeRelationById(id);

		model.addAttribute("activeRelation", activeRelation);

		return "/activeRelation/update";
	}

	/**
	 * 修改业务规则
	 * 
	 * @param activeRelation
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(ActiveRelation activeRelation) {

		activeRelationService.update(activeRelation);

		return "success";

	}

	/**
	 * 全表查询
	 * 
	 * @param activeRelation
	 * @return
	 */
	@RequestMapping(value = "getActiveRelation")
	@ResponseBody
	public List<ActiveRelation> loadOption(ActiveRelation activeRelation) {
		List<ActiveRelation> activeRelationList = activeRelationService.findAll(activeRelation);
		return activeRelationList;

	}
}