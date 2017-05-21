package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.TreeNode;
import com.syhbuy.spay.admin.entity.Role;
import com.syhbuy.spay.admin.service.RoleService;

/**
 * 角色管理. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:29:25
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author wange
 * @version 1.0.0
 */

@Controller
@RequestMapping("/role/")
public class RoleController extends BaseController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/role/list";
	}

	/**
	 * 角色列表
	 * 
	 * @param role
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo page(Role role, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		List<Role> roles = roleService.findPage(role);

		// 用PageInfo对结果进行包装
		PageInfo page = new PageInfo(roles);

		return page;

	}

	/**
	 * 跳转添加角色页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String add(Model model) {

		return "/role/add";
	}

	/**
	 * 获取菜单树结构
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getResTree")
	public List<TreeNode> getResTree(String id) {
		return roleService.getResourceTree("0", id);
	}

	/**
	 * 添加认证
	 * 
	 * @param checkData
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "saveAuthorization", produces = "application/json;charset=UTF-8")
	public String saveAuthorization(@RequestBody List checkData) {
		// 已经拿到前台的json，且封装至checkData
		roleService.updateAuthorization(checkData);
		return "success";
	}

	/**
	 * 添加角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public String save(Role role) {
		roleService.insert(role);
		return "success";
	}

	/**
	 * 修改角色权限
	 * 
	 * @param checkData
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "authorization", produces = "application/json;charset=UTF-8")
	public String saveAuthorization1(@RequestBody List checkData) {
		// 已经拿到前台的json，且封装至checkData
		roleService.updateAuthorization(checkData);
		return "success";
	}
}
