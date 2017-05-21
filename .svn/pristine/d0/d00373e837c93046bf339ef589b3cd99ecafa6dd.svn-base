package com.syhbuy.spay.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.Common;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.entity.AdminUser;
import com.syhbuy.spay.admin.service.AdminUserService;

/**
 * 后台会员管理 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午4:52:25
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@EnableTransactionManagement
@Controller
@RequestMapping("/adminUser/")
public class AdminUserController extends BaseController {

	@Autowired
	private AdminUserService adminUserService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/adminUser/list";
	}

	@ResponseBody
	@RequestMapping("page")
	public PageInfo<AdminUser> page(AdminUser adminUser, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<AdminUser> adminUserList = adminUserService.findPage(adminUser);
		for (AdminUser adminUser2 : adminUserList) {
			if (adminUser2.getCreateTime() != null) {
				String times = DateUtils.getDateTime(adminUser2.getCreateTime());
				adminUser2.setSysTime(times);
			}
		}

		// 用PageInfo对结果进行包装
		PageInfo<AdminUser> page = new PageInfo<AdminUser>(adminUserList);

		return page;

	}

	/**
	 * 跳转添加页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String add(Model model) {
		adminUserService.initAdd(model);
		return "/adminUser/add";
	}

	/**
	 * 跳转修改页面
	 * 
	 * @param model
	 * @param userId
	 * @return
	 */
	@RequestMapping("update")
	public String update(Model model, String userId) {
		adminUserService.initUpdate(model, userId);
		return "/adminUser/update";
	}

	/**
	 * 后台会员添加方法
	 * 
	 * @param adminUser
	 * @param roleIds
	 * @return
	 */
	@Transactional
	@ResponseBody
	@RequestMapping("save")
	public String save(AdminUser adminUser, String[] roleIds) {

		if (Common.isEmpty(adminUser.getId())) {
			adminUserService.save(adminUser, roleIds);
		} else {
			adminUserService.update(adminUser, roleIds);
		}

		return "success";
	}

	/**
	 * 后台远程验证用户名
	 * 
	 * @param accountName
	 * @return
	 */
	@Transactional
	@ResponseBody
	@RequestMapping("validAccount")
	public Map<String, Boolean> validAccount(String accountName) {

		List<AdminUser> aus = adminUserService.validAccount(accountName);

		Map<String, Boolean> map = new HashMap<String, Boolean>();

		if (null == aus || aus.size() == 0) {
			map.put("valid", true);

		} else {
			map.put("valid", false);
		}

		return map;

	}

}
