package com.syhbuy.spay.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syhbuy.spay.admin.entity.Resources;
import com.syhbuy.spay.admin.service.ResourcesService;

/**
 * 系统模块管理 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:23:39
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author wange
 * @version 1.0.0
 */
@Controller
@RequestMapping("/resources/")
public class ResourcesController extends BaseController {

	@Autowired
	private ResourcesService resourcesService;

	/**
	 * 跳转主页
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/resources/list";
	}

	/**
	 * 用户权限查询
	 * 
	 * @param resources
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public List<Resources> page(Resources resources) {
		return resourcesService.findPage(resources);

	}

	/**
	 * 跳转资源添加页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String add(Model model) {

		List<Resources> rs = page(new Resources());
		model.addAttribute("rs", rs);
		return "/resources/add";
	}

	/**
	 * 远程验证唯一KEY
	 * 
	 * @param resKey
	 * @return
	 */
	@ResponseBody
	@RequestMapping("validKey")
	public Map<String, Boolean> validKey(String resKey) {

		List<Resources> rs = resourcesService.validKey(resKey);

		Map<String, Boolean> map = new HashMap<String, Boolean>();

		if (null == rs || rs.size() == 0) {
			map.put("valid", true);

		} else {
			map.put("valid", false);
		}

		return map;

	}

	/**
	 * 添加系统模块
	 * 
	 * @param resources
	 * @return
	 */
	@ResponseBody
	@RequestMapping("save")
	public String save(Resources resources) {
		resourcesService.save(resources);
		return "success";
	}
}
