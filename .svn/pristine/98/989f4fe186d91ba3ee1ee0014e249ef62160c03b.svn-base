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
import com.syhbuy.spay.admin.entity.LoginInfo;
import com.syhbuy.spay.admin.service.LoginInfoMapperService;

/**
 * 登录日志
 * <p>
 * Copyright: Copyright (c) 2016年9月12日 下午2:28:20
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 */
@Controller
@RequestMapping(value = "/LoginInfo/")
public class LoginInfoController extends BaseController {

	@Autowired
	private LoginInfoMapperService loginInfoService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/LoginInfo/list";
	}

	/**
	 * 登录日志列表
	 * 
	 * @param loginInfo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<LoginInfo> page(LoginInfo loginInfo, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<LoginInfo> pageList = loginInfoService.findAllLoginInfo(loginInfo);
		for (LoginInfo loginInfo2 : pageList) {
			if (loginInfo2.getCreateDate() != null) {
				loginInfo2.setResgTimeString(DateUtils.getDateTime(loginInfo2.getCreateDate()));
			} else {
				loginInfo2.setResgTimeString("");
			}
			if ("微信登录".equals(loginInfo2.getLoginType())) {
				loginInfo2.setPhone("微信：" + loginInfo2.getOpenId());
			} else {
				loginInfo2.setPhone("手机：" + loginInfo2.getPhone());
			}
		}

		PageInfo<LoginInfo> page = new PageInfo<LoginInfo>(pageList);

		return page;
	}

}
