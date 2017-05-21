package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.DispenseReturnRecord;
import com.syhbuy.spay.admin.entityVo.DispenseReturnRecordVO;
import com.syhbuy.spay.admin.service.DispenseReturnRecordService;

/**
 * 代金券管理 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:00:17
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/dispenseReturnRecord/")
public class DispenseReturnRecordController extends BaseController {

	@Autowired
	private DispenseReturnRecordService service;

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("btns", this.findBtns());
		return "/dispenseReturnRecord/list";
	}

	/**
	 * 代金券列表页
	 * 
	 * @param user对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<DispenseReturnRecord> page(DispenseReturnRecordVO record, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<DispenseReturnRecord> pageList = service.getAllRecord(record);

		PageInfo<DispenseReturnRecord> page = new PageInfo<DispenseReturnRecord>(pageList);

		return page;
	}

}
