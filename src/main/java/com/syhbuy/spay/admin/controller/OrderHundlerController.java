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
import com.syhbuy.spay.admin.entity.OrderHundler;
import com.syhbuy.spay.admin.service.OrderHundlerService;

/**
 * 订单管理. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-24 下午3:25:46
 * <p>
 * Company: 善友汇
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@RequestMapping(value = "/OrderHundler/")
@Controller
public class OrderHundlerController extends BaseController {

	@Autowired
	private OrderHundlerService orderHundlerService;

	@RequestMapping("list")
	public String listBtns(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/OrderHundler/list";
	}

	@ResponseBody
	@RequestMapping("page")
	public PageInfo<OrderHundler> page(OrderHundler orderHundler, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<OrderHundler> topuPauditVoList = orderHundlerService.FindAll(orderHundler);
		for (OrderHundler orderHundler2 : topuPauditVoList) {

			if (orderHundler2.getRealName() != null) {
				orderHundler2.setRealName(orderHundler2.getRealName());
			} else {
				orderHundler2.setRealName("");
			}
			if (orderHundler2.getUserId() != null) {
				orderHundler2.setUserId(orderHundler2.getUserId());
			} else {
				orderHundler2.setUserId("");
			}
			if (orderHundler2.getOrderId() != null) {
				orderHundler2.setOrderId(orderHundler2.getOrderId());
			} else {
				orderHundler2.setOrderId("");
			}
			if (orderHundler2.getOrderStatus() != null) {
				orderHundler2.setOrderStatus(orderHundler2.getOrderStatus());
			} else {
				orderHundler2.setOrderStatus("");
			}
			if (orderHundler2.getCreateTime() != null) {
				orderHundler2.setResgTimeString(DateUtils.getDate(orderHundler2.getCreateTime().toString().substring(0, 19)));
			} else {
				orderHundler2.setResgTimeString("");
			}

		}
		// 用PageInfo对结果进行包装
		PageInfo<OrderHundler> page = new PageInfo<OrderHundler>(topuPauditVoList);

		return page;
	}
}
