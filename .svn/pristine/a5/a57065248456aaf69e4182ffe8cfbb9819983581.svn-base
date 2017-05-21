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
import com.syhbuy.spay.admin.entityVo.PayDispenseBuyRecordVO;
import com.syhbuy.spay.admin.service.PayDispenseBuyRecordService;

/**
 * 代金券购买记录. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:20:17
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/payDispenseRecord/")
public class PayDispenseRecordController extends BaseController {

	@Autowired
	private PayDispenseBuyRecordService payDispenseBuyRecordService;

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("btns", this.findBtns());
		return "/payDispenseRecord/list";
	}

	/**
	 * 代金券购买记录列表数据
	 * 
	 * @param user对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<PayDispenseBuyRecordVO> page(PayDispenseBuyRecordVO record, int pageNum, int pageSize) {
		if (record != null && record.getSearchStartTime() != null && record.getSearchEndTime() != null && !"".equals(record.getSearchStartTime()) && !"".equals(record.getSearchEndTime())) {
			record.setStartTime(DateUtils.convertDataToLong(record.getSearchStartTime()));
			record.setEndTime(DateUtils.convertDataToLong(record.getSearchEndTime()));
		}
		PageHelper.startPage(pageNum, pageSize);
		List<PayDispenseBuyRecordVO> pageList = payDispenseBuyRecordService.getAllDispenseBuyRecord(record);
		for (PayDispenseBuyRecordVO payDispenseBuyRecordVO : pageList) {
			if (payDispenseBuyRecordVO.getBuyTime() != null) {
				payDispenseBuyRecordVO.setSearchStartTime(DateUtils.getDateTime(payDispenseBuyRecordVO.getBuyTime()));
			}
		}
		PageInfo<PayDispenseBuyRecordVO> page = new PageInfo<PayDispenseBuyRecordVO>(pageList);

		return page;
	}

	/**
	 * 根据id查询购买记录
	 * 
	 * @param record
	 * @param model
	 * @return
	 */
	@RequestMapping("findRecordById")
	public String findById(PayDispenseBuyRecordVO record, Model model) {
		PayDispenseBuyRecordVO active = payDispenseBuyRecordService.getDispenseBuyRecordById(record);
		active.setSearchStartTime(DateUtils.getDateTime(active.getBuyTime()));
		model.addAttribute("record", active);
		return "/payDispenseRecord/edit";
	}

}
