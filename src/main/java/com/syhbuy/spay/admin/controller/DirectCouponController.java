package com.syhbuy.spay.admin.controller;

import java.math.BigDecimal;
import java.util.List;

import jxl.common.Logger;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.entity.PayDirectCoupon;
import com.syhbuy.spay.admin.service.DirectCouponService;

/**
 * 定向卷增删改查. <br>
 * 定向卷增删改查.
 * <p>
 * Copyright: Copyright (c) 2016-11-2 上午9:47:12
 * <p>
 * Company: 陕西善友汇网络科技股份有限公司
 * <p>
 * 
 * @author 郭涛
 * @version 1.0.0
 */
@Controller
@RequestMapping("/directCoupon/")
public class DirectCouponController extends BaseController {

	private final Logger log = Logger.getLogger(DirectCouponController.class);

	@Autowired
	private DirectCouponService directCouponService;

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("btns", this.findBtns());
		return "/directCoupon/list";
	}

	/**
	 * @param directCoupon对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<PayDirectCoupon> page(PayDirectCoupon payDirectCoupon, int pageNum, int pageSize) {
		if (payDirectCoupon != null && payDirectCoupon.getSearchStartTime() != null && payDirectCoupon.getSearchEndTime() != null && payDirectCoupon.getTime() != null && !"".equals(payDirectCoupon.getSearchStartTime()) && !"".equals(payDirectCoupon.getTime()) && !"".equals(payDirectCoupon.getSearchEndTime())) {
			payDirectCoupon.setStartTime(DateUtils.convertDataToLong(payDirectCoupon.getSearchStartTime()));
			payDirectCoupon.setEndTime(DateUtils.convertDataToLong(payDirectCoupon.getSearchEndTime()));
			payDirectCoupon.setTime(DateUtils.convertDataToLong(payDirectCoupon.getSearchTime()));
		}
		PageHelper.startPage(pageNum, pageSize);

		List<PayDirectCoupon> pageList = directCouponService.findAll(payDirectCoupon);
		for (PayDirectCoupon PayDirectCoupon2 : pageList) {
			PayDirectCoupon2.setTitle(PayDirectCoupon2.getTitle() == null ? "" : PayDirectCoupon2.getTitle());
			PayDirectCoupon2.setDirectObjId1Name(PayDirectCoupon2.getDirectObjId1Name() == null ? "" : PayDirectCoupon2.getDirectObjId1Name());
			if (PayDirectCoupon2.getGenerateTime() != null && !("null").equals(PayDirectCoupon2.getGenerateTime()) && !("").equals(PayDirectCoupon2.getGenerateTime())) {
				PayDirectCoupon2.setSearchStartTime(DateUtils.getDateTime(PayDirectCoupon2.getGenerateTime()));
			}
			if (PayDirectCoupon2.getEnableTime() != null && !("null").equals(PayDirectCoupon2.getEnableTime()) && !("").equals(PayDirectCoupon2.getEnableTime())) {
				PayDirectCoupon2.setSearchEndTime(DateUtils.getDateTime(PayDirectCoupon2.getEnableTime()));
			}
			if (PayDirectCoupon2.getDisableTime() != null && !("null").equals(PayDirectCoupon2.getDisableTime()) && !("").equals(PayDirectCoupon2.getDisableTime())) {
				PayDirectCoupon2.setSearchTime(DateUtils.getDateTime(PayDirectCoupon2.getDisableTime()));
			}
			if (PayDirectCoupon2.getDisableTime() != null && PayDirectCoupon2.getDisableTime() < System.currentTimeMillis()) {
				PayDirectCoupon2.setCouponSatusShow("过期");
				// 修改券状态
				directCouponService.updatestate(PayDirectCoupon2.getId());

			}
		}
		PageInfo<PayDirectCoupon> page = new PageInfo<PayDirectCoupon>(pageList);

		return page;
	}

	/**
	 * 交易详情
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("findById")
	public String findDirectCouponById(String id, Model model) {
		PayDirectCoupon payDirectCoupon = directCouponService.findDirectCouponById(id);
		if (payDirectCoupon.getGenerateTime() != null && !("null").equals(payDirectCoupon.getGenerateTime()) && !("").equals(payDirectCoupon.getGenerateTime())) {
			payDirectCoupon.setSearchStartTime(DateUtils.getDateTime(payDirectCoupon.getGenerateTime()));
		}
		if (payDirectCoupon.getEnableTime() != null && !("null").equals(payDirectCoupon.getEnableTime()) && !("").equals(payDirectCoupon.getEnableTime())) {
			payDirectCoupon.setSearchEndTime(DateUtils.getDateTime(payDirectCoupon.getEnableTime()));
		}
		if (payDirectCoupon.getDisableTime() != null && !("null").equals(payDirectCoupon.getDisableTime()) && !("").equals(payDirectCoupon.getDisableTime())) {
			payDirectCoupon.setSearchTime(DateUtils.getDateTime(payDirectCoupon.getDisableTime()));
		}
		model.addAttribute("business", payDirectCoupon);
		return "/directCoupon/edit";
	}

	/**
	 * 跳转添加规则页面
	 */
	@RequestMapping("add")
	public String add() {

		return "/directCoupon/add";

	}

	/**
	 * 添加交易信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "saveDirectCoupon", method = RequestMethod.POST)
	@ResponseBody
	public String saveDirectCoupon(PayDirectCoupon payDirectCoupon) {
		String userId = SecurityUtils.getSubject().getSession().getAttribute("userSessionId").toString();
		payDirectCoupon.setOriginId(userId);
		payDirectCoupon.setCashCouponId(IDGeneratorUtils.getOrderID());
		payDirectCoupon.setGenerateTime(DateUtils.getCurrTime());
		payDirectCoupon.setOrigin("0");
		payDirectCoupon.setEnableTime(DateUtils.convertDataToLong(payDirectCoupon.getEnableTimeShow()));
		payDirectCoupon.setDisableTime(DateUtils.convertDataToLong(payDirectCoupon.getDisableTimeShow()));
		payDirectCoupon.setCouponMoney(new BigDecimal(payDirectCoupon.getDenomination()));
		payDirectCoupon.setIsDel("0");
		payDirectCoupon.setCouponSatus("0");
		int count = 0;
		try {
			count = directCouponService.save(payDirectCoupon);
		}
		catch (Exception e) {

			log.error("定向卷添加交易信息异常", e);
			return "fail";
		}
		if (count > 0) {
			return "success";
		}
		return "fail";
	}

	/**
	 * 删除交易信息
	 * 
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public String deleteDirectCoupon(String id) {

		directCouponService.deleteDirectCoupon(id);

		return "success";
	}

	/**
	 * 跳转修改交易信息控制层
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "update")
	public String update(String id, Model model) {

		PayDirectCoupon payDirectCoupon = directCouponService.findDirectCouponById(id);
		if (payDirectCoupon.getGenerateTime() != null && !("null").equals(payDirectCoupon.getGenerateTime()) && !("").equals(payDirectCoupon.getGenerateTime())) {
			payDirectCoupon.setSearchStartTime(DateUtils.getDateTime(payDirectCoupon.getGenerateTime()));
		}
		if (payDirectCoupon.getEnableTime() != null && !("null").equals(payDirectCoupon.getEnableTime()) && !("").equals(payDirectCoupon.getEnableTime())) {
			payDirectCoupon.setSearchEndTime(DateUtils.getDateTime(payDirectCoupon.getEnableTime()));
		}
		if (payDirectCoupon.getDisableTime() != null && !("null").equals(payDirectCoupon.getDisableTime()) && !("").equals(payDirectCoupon.getDisableTime())) {
			payDirectCoupon.setSearchTime(DateUtils.getDateTime(payDirectCoupon.getDisableTime()));
		}

		model.addAttribute("payDirectCoupon", payDirectCoupon);

		return "/directCoupon/update";
	}

	/**
	 * 修改交易信息
	 * 
	 * @return
	 */
	@RequestMapping("updateDirectCoupon")
	@ResponseBody
	public String updateDirectCoupon(PayDirectCoupon payDirectCoupon) {

		int a = 0;
		String userId = SecurityUtils.getSubject().getSession().getAttribute("userSessionId").toString();
		payDirectCoupon.setOriginId(userId);
		payDirectCoupon.setEnableTime(DateUtils.convertDataToLong(payDirectCoupon.getEnableTimeShow()));
		payDirectCoupon.setDisableTime(DateUtils.convertDataToLong(payDirectCoupon.getDisableTimeShow()));

		try {
			a = directCouponService.update(payDirectCoupon);
		}
		catch (Exception e) {

			log.error("定向卷修改交易信息异常", e);
		}
		if (a > 0) {
			return "success";
		}
		return "fail";
	}
}
