package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.Parameter;
import com.syhbuy.spay.admin.service.ParameterService;

/**
 * 数据字典 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:12:19
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/Parameter/")
public class ParameterController extends BaseController {

	@Autowired
	private ParameterService ParameterService;

	/**
	 * 跳转参数列表页
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/parameter/list";
	}

	/**
	 * 数据字典列表查询
	 * 
	 * @param parameter
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<Parameter> page(Parameter parameter, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<Parameter> pageList = ParameterService.findAll(parameter);
		for (Parameter parameter2 : pageList) {
			parameter2.setDescription(parameter2.getDescription() == null ? "" : parameter2.getDescription());
			parameter2.setParamType(parameter2.getParamType() == null ? "" : parameter2.getParamType());
		}

		PageInfo<Parameter> page = new PageInfo<Parameter>(pageList);

		return page;
	}

	/**
	 * 删除数据字典控制层
	 * 
	 * @return
	 */
	@RequestMapping("deleteParameter")
	@ResponseBody
	public String deleteParameter(String id) {

		ParameterService.deleteParameter(id);

		return "success";

	}

	/**
	 * 跳转数据字典页面
	 */
	@RequestMapping("add")
	public String add() {

		return "/parameter/add";

	}

	/**
	 * 添加数据字典控制层
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public String save(Parameter parameter) {
		parameter.setIsDel("0");
		ParameterService.save(parameter);

		return "success";
	}

	/**
	 * 跳转数据字典控制层
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping(value = "updateParameter")
	public String updateRule(String id, Model model) {

		Parameter parameter = ParameterService.findById(id);

		model.addAttribute("parameter", parameter);

		return "/parameter/update";
	}

	/**
	 * 修改数据字典
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(Parameter parameter) {

		ParameterService.update(parameter);

		return "success";

	}
}
