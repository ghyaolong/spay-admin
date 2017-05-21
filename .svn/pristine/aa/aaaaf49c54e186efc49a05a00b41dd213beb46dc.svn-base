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
import com.syhbuy.spay.admin.entity.SucceedOperation;
import com.syhbuy.spay.admin.service.SucceedOperationService;

/**
 * 操作日志. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-25 下午5:58:44
 * <p>
 * Company: 善友汇
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Controller
@RequestMapping(value = "/SucceedOperation/")
public class SucceedOperationController extends BaseController {

	@Autowired
	private SucceedOperationService succeedOperationService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {

		model.addAttribute("btns", this.findBtns());
		return "/SucceedOperation/list";
	}

	/**
	 * 成功日志显示页面
	 * 
	 * @param succeedOperation
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<SucceedOperation> page(SucceedOperation succeedOperation, int pageNum, int pageSize) {

		if (succeedOperation != null && succeedOperation.getSearchStartTime() != null && succeedOperation.getSearchEndTime() != null && !"".equals(succeedOperation.getSearchStartTime()) && !"".equals(succeedOperation.getSearchEndTime())) {
			succeedOperation.setStartTime(DateUtils.convertDataToLong(succeedOperation.getSearchStartTime()));
			succeedOperation.setEndTime(DateUtils.convertDataToLong(succeedOperation.getSearchEndTime()));
		}

		PageHelper.startPage(pageNum, pageSize);

		List<SucceedOperation> succeedOperationList = succeedOperationService.findAll(succeedOperation);
		for (SucceedOperation succeedOperation2 : succeedOperationList) {
			succeedOperation2.setCareateBy(succeedOperation2.getCareateBy() == null ? "" : succeedOperation2.getCareateBy());
			succeedOperation2.setDescripition(succeedOperation2.getDescripition() == null ? "" : succeedOperation2.getDescripition());
			succeedOperation2.setMethod(succeedOperation2.getMethod() == null ? "" : succeedOperation2.getMethod());
			succeedOperation2.setCategory(succeedOperation2.getCategory() == null ? "" : succeedOperation2.getCategory());
			succeedOperation2.setLogType(succeedOperation2.getLogType() == null ? "" : succeedOperation2.getLogType());
			succeedOperation2.setParams(succeedOperation2.getParams() == null ? "" : succeedOperation2.getParams());
			succeedOperation2.setUserName(succeedOperation2.getUserName() == null ? "" : succeedOperation2.getUserName());

			if (succeedOperation2.getCreateDate() != null) {

				succeedOperation2.setCreateda(DateUtils.getDateTime(succeedOperation2.getCreateDate()));

			}

		}

		// 用PageInfo对结果进行包装
		PageInfo<SucceedOperation> page = new PageInfo<SucceedOperation>(succeedOperationList);

		return page;

	}

}
