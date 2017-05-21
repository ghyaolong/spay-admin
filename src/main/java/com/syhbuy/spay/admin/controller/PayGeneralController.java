package com.syhbuy.spay.admin.controller;

import java.util.List;

import jxl.common.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.entity.PayGeneral;
import com.syhbuy.spay.admin.service.PayGeneralService;

/**
 * 用户通用代金券 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-2 上午10:46:45
 * <p>
 * Company: 陕西善友汇网络科技股份有限公司
 * <p>
 * 
 * @author houss
 * @version 1.0.0
 */
@Controller
@RequestMapping("/payGeneral/")
public class PayGeneralController extends BaseController {

	private final Logger log = Logger.getLogger(PayGeneralController.class);

	@Autowired
	private PayGeneralService payGeneralService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/payGeneral/list";
	}

	/**
	 * 通用券列表数据
	 * 
	 * @param payGeneral
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<PayGeneral> page(PayGeneral payGeneral, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<PayGeneral> payGeneralList = payGeneralService.findAll(payGeneral);
		for (PayGeneral payGeneral2 : payGeneralList) {
			payGeneral2.setTitle(payGeneral2.getTitle() == null ? "" : payGeneral2.getTitle());
			if (payGeneral2.getGenerateTime() != null) {
				payGeneral2.setGenerateTimeShow(DateUtils.getDateTime(payGeneral2.getGenerateTime()));
			} else {
				payGeneral2.setGenerateTimeShow("");
			}
			if (payGeneral2.getEnableTime() != null) {
				payGeneral2.setEnableTimeShow(DateUtils.getDateTime(payGeneral2.getEnableTime()));
			} else {
				payGeneral2.setEnableTimeShow("");
			}
			if (payGeneral2.getDisableTime() == null) {
				payGeneral2.setDisableTimeShow("");
			} else {
				payGeneral2.setDisableTimeShow(DateUtils.getDateTime(payGeneral2.getDisableTime()));
			}
			payGeneral2.setCouponSatusShow(payGeneral2.getCouponSatus());
			if (payGeneral2.getFreezeAlive() != null) {
				if (String.valueOf(payGeneral2.getFreezeAlive()).equals("0")) {
					payGeneral2.setFreezeAliveShow("未冻结");
				} else {
					payGeneral2.setFreezeAliveShow("冻结");
				}
			} else {
				payGeneral2.setFreezeAliveShow("");
			}
			if (payGeneral2.getDisableTime() != null && !"".equals(payGeneral2.getDisableTime())) {
				if (payGeneral2.getDisableTime() < System.currentTimeMillis()) {
					payGeneral2.setCouponSatusShow("过期");
					// 修改券状态
					payGeneralService.updatestate(payGeneral2.getId());
				}
			}
		}

		// 用PageInfo对结果进行包装
		PageInfo<PayGeneral> page = new PageInfo<PayGeneral>(payGeneralList);

		return page;

	}

	/**
	 * 跳转添加通用券页面
	 */
	@RequestMapping("add")
	public String add() {

		return "/payGeneral/add";

	}

	/**
	 * 添加用户通用券控制层
	 * 
	 * @param activeRelation
	 * @return
	 */

	@RequestMapping("save")
	@ResponseBody
	public String save(PayGeneral payGeneral) {
		// 新增用户通用券流水
		// 代金券ID
		payGeneral.setCashCouponId(IDGeneratorUtils.getOrderID());
		// 来源类别、来源对象ID
		payGeneral.setOrigin("0");
		payGeneral.setOriginId(payGeneral.getUserId());
		payGeneral.setEnableTime(DateUtils.convertDataToLong(payGeneral.getEnableTimeShow()));
		payGeneral.setDisableTime(DateUtils.convertDataToLong(payGeneral.getDisableTimeShow()));
		payGeneral.setGenerateTime(DateUtils.getCurrTime());
		payGeneral.setCouponMoney(payGeneral.getDenomination());
		// 新增券状态

		payGeneral.setCouponSatus("0");
		payGeneral.setFreezeAlive(new Long(0));
		payGeneral.setIsDel("0");
		int count = 0;
		try {
			count = payGeneralService.save(payGeneral);
		}
		catch (Exception e) {

			log.error("添加用户通用券异常", e);

			return "fail";
		}
		if (count > 0) {
			return "success";
		}
		return "fail";
	}

	/**
	 * 删除通用券业务控制层
	 * 
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public String deletePayGeneral(String id) {

		payGeneralService.deletePayGeneral(id);

		return "success";

	}

	/**
	 * 跳转修改通用券业务控制层
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "update")
	public String update(String id, Model model) {

		PayGeneral payGeneral = payGeneralService.payGeneralById(id);
		if (payGeneral.getEnableTime() != null) {
			payGeneral.setEnableTimeShow(DateUtils.getDateTime(payGeneral.getEnableTime()));
		}
		if (payGeneral.getDisableTime() != null) {
			payGeneral.setDisableTimeShow(DateUtils.getDateTime(payGeneral.getDisableTime()));
		}
		if ("0".equals(payGeneral.getCouponSatus())) {
			payGeneral.setCouponSatus("使用中");
		} else if ("1".equals(payGeneral.getCouponSatus())) {
			payGeneral.setCouponSatus("已使用");
		} else if ("2".equals(payGeneral.getCouponSatus())) {
			payGeneral.setCouponSatus("已冻结");
		} else if ("3".equals(payGeneral.getCouponSatus())) {
			payGeneral.setCouponSatus("过期");
		}

		model.addAttribute("payGeneral", payGeneral);

		return "/payGeneral/update";
	}

	/**
	 * 修改通用券业务
	 * 
	 * @param activeRelation
	 * @return
	 */
	@RequestMapping(value = "updatePayGeneral")
	@ResponseBody
	public String updatePayGeneral(PayGeneral payGeneral) {
		if (payGeneral.getEnableTimeShow() != null && !"".equals(payGeneral.getEnableTimeShow())) {
			payGeneral.setEnableTime(DateUtils.convertDataToLong(payGeneral.getEnableTimeShow()));
		}
		if (payGeneral.getDisableTimeShow() != null && !"".equals(payGeneral.getDisableTimeShow())) {
			payGeneral.setDisableTime(DateUtils.convertDataToLong(payGeneral.getDisableTimeShow()));
		}
		if (payGeneral.getCouponSatus().equals("2")) {
			payGeneral.setFreezeDate(DateUtils.getDate());
		}
		// 修改时间做判断
		int account = 0;
		try {
			account = payGeneralService.update(payGeneral);
		}
		catch (Exception e) {

			log.error("修改通用券业务异常", e);
		}
		if (account > 0) {
			return "success";
		}
		return "fail";
	}

	/**
	 * 用户通用券详情
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("findById")
	public String findRecordById(String id, Model model) {
		PayGeneral payGeneral = payGeneralService.payGeneralById(id);

		if (payGeneral.getGenerateTime() != null) {
			payGeneral.setGenerateTimeShow(DateUtils.getDateTime(payGeneral.getGenerateTime()));
		}
		if (payGeneral.getEnableTime() != null) {
			payGeneral.setEnableTimeShow(DateUtils.getDateTime(payGeneral.getEnableTime()));
		}
		if (payGeneral.getDisableTime() != null) {
			payGeneral.setDisableTimeShow(DateUtils.getDateTime(payGeneral.getDisableTime()));
		}
		if (payGeneral.getOverdueDate() != null) {
			payGeneral.setFreezeAliveShow(DateUtils.getDateTime(payGeneral.getFreezeAlive()));
		}
		model.addAttribute("payGeneral", payGeneral);

		return "/payGeneral/edit";
	}
}
