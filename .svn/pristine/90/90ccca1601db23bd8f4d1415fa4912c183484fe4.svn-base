package com.syhbuy.spay.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.entity.PayActive;
import com.syhbuy.spay.admin.service.PayActiveService;

/**
 * 活动规则设置. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:13:20
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/payActive/")
public class PayActiveController extends BaseController {

	@Autowired
	private PayActiveService payActiveService;

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("btns", this.findBtns());
		return "/payActive/list";
	}

	/**
	 * 活动规则列表
	 * 
	 * @param payActive
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */

	@RequestMapping("page")
	@ResponseBody
	public PageInfo<PayActive> page(PayActive payActive, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<PayActive> pageList = payActiveService.getAllPayActive(payActive);
		List<PayActive> list = new ArrayList<PayActive>();
		PayActive act = pageList.get(0);
		act.setCouponScale(act.getCouponScale() + "倍");
		list.add(pageList.get(0));
		PageInfo<PayActive> page = new PageInfo<PayActive>(list);

		return page;
	}

	/**
	 * 跳转添加规则页面
	 * 
	 * @return
	 */
	@RequestMapping("addRule")
	public String savePayActive() {
		return "/payActive/add";

	}

	/**
	 * 添加活动规则
	 * 
	 * @param payActive
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("savePayActive")
	@ResponseBody
	public String save(PayActive payActive) throws IllegalStateException, IOException {
		payActive.setId(IDGeneratorUtils.getUUID32());
		payActive.setCreateTime(System.currentTimeMillis() + "");
		payActive.setReleaseStatus("1");
		payActiveService.insert(payActive);
		return "success";
	}

	/**
	 * 删除规则
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("deleteActiveById")
	@ResponseBody
	public String delete(String id) {
		payActiveService.deleteByPrimaryKey(id);
		return "success";
	}

	/**
	 * 跳转修改规则页面
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("findActiveById")
	public String findById(String id, Model model) {
		PayActive active = payActiveService.selectByPrimaryKey(id);
		active.setCouponScale(active.getCouponScale());
		model.addAttribute("active", active);
		return "/payActive/edit";
	}

	/**
	 * 修改活动规则
	 * 
	 * @param payActive
	 * @return
	 */
	@ResponseBody
	@RequestMapping("update")
	public String updateActive(PayActive payActive) {
		payActiveService.updateByPrimaryKeySelective(payActive);
		return "success";
	}

}
