package com.syhbuy.spay.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.syhbuy.spay.admin.base.util.Common;
import com.syhbuy.spay.admin.entity.Resources;
import com.syhbuy.spay.admin.service.BaseService;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午4:56:48
 * <p>
 * Company: 善友汇网络
 * <p>
 * 系统controller
 * 
 * @author wange
 * @version 1.0.0
 */
public class BaseController {

	@Autowired
	private BaseService baseService;

	List<Resources> findBtns() {
		// 菜单ID
		String id = this.getPara("id");

		List<Resources> btns = baseService.findBtnByMenu(Common.findUserSessionId(), id);

		for (Resources btn : btns) {
			if (btn != null && !Common.isEmpty(btn.getDescription())) {
				btn.setDescription(Common.stringtohtml(btn.getDescription()));
			}
		}

		return btns;
	}

	public String getPara(String key) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request.getParameter(key);
	}

}
