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
import com.syhbuy.spay.admin.entity.UserOperationLog;
import com.syhbuy.spay.admin.service.UserOperationLogService;

/**
 * 异常日志. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-24 下午5:26:30
 * <p>
 * Company:
 * <p>
 * 
 * @author @c-platform.com
 * @version 1.0.0
 */
@Controller
@RequestMapping(value = "/UserOperationLog/")
public class UserOperationLogController extends BaseController {

	@Autowired
	private UserOperationLogService userOperationLogService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/UserOperationLog/list";
	}

	/**
	 * 失败日志显示页面
	 * 
	 * @param userOperationLog
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<UserOperationLog> page(UserOperationLog userOperationLog, int pageNum, int pageSize) {

		if (userOperationLog != null && userOperationLog.getSearchStartTime() != null && userOperationLog.getSearchEndTime() != null && !"".equals(userOperationLog.getSearchStartTime()) && !"".equals(userOperationLog.getSearchEndTime())) {
			userOperationLog.setStartTime(DateUtils.convertDataToLong(userOperationLog.getSearchStartTime()));
			userOperationLog.setEndTime(DateUtils.convertDataToLong(userOperationLog.getSearchEndTime()));
		}
		PageHelper.startPage(pageNum, pageSize);
		List<UserOperationLog> userOperationLogList = userOperationLogService.findAll(userOperationLog);

		for (UserOperationLog userOperationLog2 : userOperationLogList) {
			userOperationLog2.setCareateBy(userOperationLog2.getCareateBy() == null ? "" : userOperationLog2.getCareateBy());
			userOperationLog2.setDescripition(userOperationLog2.getDescripition() == null ? "" : userOperationLog2.getDescripition());
			userOperationLog2.setMethod(userOperationLog2.getMethod() == null ? "" : userOperationLog2.getMethod());
			userOperationLog2.setExceptionCode(userOperationLog2.getExceptionCode() == null ? "" : userOperationLog2.getExceptionCode());
			userOperationLog2.setExceptionDetail(userOperationLog2.getExceptionDetail() == null ? "" : userOperationLog2.getExceptionDetail());
			userOperationLog2.setCategory(userOperationLog2.getCategory() == null ? "" : userOperationLog2.getCategory());
			userOperationLog2.setUserName(userOperationLog2.getUserName() == null ? "" : userOperationLog2.getUserName());
			if (userOperationLog2.getCreateDate() != null) {
				String timeString = DateUtils.getDateTime(userOperationLog2.getCreateDate());
				userOperationLog2.setCreateda(timeString);
			}
		}
		// 用PageInfo对结果进行包装
		PageInfo<UserOperationLog> page = new PageInfo<UserOperationLog>(userOperationLogList);
		return page;

	}
}
