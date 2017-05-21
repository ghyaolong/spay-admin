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
import com.syhbuy.spay.admin.entity.TerraceActive;
import com.syhbuy.spay.admin.service.TerraceActiveService;

/**
 * 平台活动. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:37:39
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */

@Controller
@RequestMapping("/terraceActive/")
public class TerraceActiveController extends BaseController {

	@Autowired
	private TerraceActiveService terraceActiveService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/terraceActive/list";
	}

	/**
	 * 平台活动列表
	 * 
	 * @param terraceActive
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<TerraceActive> page(TerraceActive terraceActive, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<TerraceActive> terraceActiveList = terraceActiveService.findAll(terraceActive);
		for (TerraceActive terraceActive2 : terraceActiveList) {
			terraceActive2.setBeTime(terraceActive2.getBeginTime() != null ? DateUtils.getDateTime(terraceActive2.getBeginTime()) : "");
			terraceActive2.setEnTime(terraceActive2.getEndTime() != null ? DateUtils.getDateTime(terraceActive2.getEndTime()) : "");

		}

		// 用PageInfo对结果进行包装
		PageInfo<TerraceActive> page = new PageInfo<TerraceActive>(terraceActiveList);

		return page;

	}

	/**
	 * 跳转平台活动
	 */
	@RequestMapping("add")
	public String add() {

		return "/terraceActive/add";

	}

	/**
	 * 添加平台活动
	 * 
	 * @param activeRelation
	 * @return
	 */

	@RequestMapping("save")
	@ResponseBody
	public String save(TerraceActive terraceActive) {
		// "2010-10-10"
		terraceActive.setBeginTime(terraceActive.getBeTime() != null ? DateUtils.convertDataToLong(terraceActive.getBeTime()) : null);
		terraceActive.setEndTime(terraceActive.getEnTime() != null ? DateUtils.convertDataToLong(terraceActive.getEnTime()) : null);
		terraceActiveService.save(terraceActive);

		return "success";
	}

	/**
	 * 删除平台活动数据
	 * 
	 * @return
	 */
	@RequestMapping("deleteTerraceActive")
	@ResponseBody
	public String deleteTerraceActive(String id) {

		terraceActiveService.deleteTerraceActive(id);

		return "success";

	}

	/**
	 * 跳转修改规则控制层
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "updateTerraceActive")
	public String updateTerraceActive(String id, Model model) {

		TerraceActive terraceActive = terraceActiveService.terraceActiveById(id);
		terraceActive.setBeTime(terraceActive.getBeginTime() != null ? DateUtils.getDateTime(terraceActive.getBeginTime()) : null);
		terraceActive.setEnTime(terraceActive.getEndTime() != null ? DateUtils.getDateTime(terraceActive.getEndTime()) : null);
		model.addAttribute("terraceActive", terraceActive);
		return "/terraceActive/update";
	}

	/**
	 * 修改平台活动
	 * 
	 * @param terraceActive
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(TerraceActive terraceActive) {
		terraceActive.setBeginTime(terraceActive.getBeTime() != null ? DateUtils.convertDataToLong(terraceActive.getBeTime()) : null);
		terraceActive.setEndTime(terraceActive.getEnTime() != null ? DateUtils.convertDataToLong(terraceActive.getEnTime()) : null);

		terraceActiveService.update(terraceActive);

		return "success";
	}

	/**
	 * 平台活动全查
	 * 
	 * @param terraceActive
	 * @return
	 */
	@RequestMapping("getTerraceActive")
	@ResponseBody
	public List<TerraceActive> loadOption(TerraceActive terraceActive) {
		List<TerraceActive> terraceActiveList = terraceActiveService.findAll(terraceActive);
		return terraceActiveList;
	}

}
