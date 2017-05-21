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
import com.syhbuy.spay.admin.entity.PayCouponAccounttransRec;
import com.syhbuy.spay.admin.service.PayCouponAccounttransRecService;

/**
 * 代金券流水. <br>
 * 代金券流水查看
 * <p>
 * Copyright: Copyright (c) 2016-10-15 下午10:32:11
 * <p>
 * Company: 陕西善友汇网络科技股份有限公司
 * <p>
 * 
 * @author houss
 * @version 1.0.0
 */
@Controller
@RequestMapping("/payCouponAccounttransRec/")
public class PayCouponAccounttransRecController extends BaseController {

	@Autowired
	private PayCouponAccounttransRecService payCouponAccounttransRecService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/payCouponAccounttransRec/list";
	}

	/**
	 * 代金券流水列表页数据
	 * 
	 * @param payCouponAccounttransRec
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<PayCouponAccounttransRec> page(PayCouponAccounttransRec payCouponAccounttransRec, int pageNum, int pageSize) {

		if (payCouponAccounttransRec != null && payCouponAccounttransRec.getSearchStartTime() != null && payCouponAccounttransRec.getSearchEndTime() != null && !"".equals(payCouponAccounttransRec.getSearchStartTime()) && !"".equals(payCouponAccounttransRec.getSearchEndTime())) {
			payCouponAccounttransRec.setStartTime(DateUtils.convertDataToLong(payCouponAccounttransRec.getSearchStartTime()));
			payCouponAccounttransRec.setEndTime(DateUtils.convertDataToLong(payCouponAccounttransRec.getSearchEndTime()));
		}
		PageHelper.startPage(pageNum, pageSize);

		List<PayCouponAccounttransRec> payCouponAccounttransRecList = payCouponAccounttransRecService.findAll(payCouponAccounttransRec);
		for (PayCouponAccounttransRec payCouponAccounttransRec2 : payCouponAccounttransRecList) {
			if (payCouponAccounttransRec2.getTranTime() != null) {
				payCouponAccounttransRec2.setTranTimeShow(DateUtils.getDateTime(payCouponAccounttransRec2.getTranTime()));
			}
			payCouponAccounttransRec2.setDescribe(payCouponAccounttransRec2.getDescribe() == null ? "" : payCouponAccounttransRec2.getDescribe());
			payCouponAccounttransRec2.setTrtanId(payCouponAccounttransRec2.getTrtanId() == null ? "" : payCouponAccounttransRec2.getTrtanId());
			payCouponAccounttransRec2.setTranTimeShow(payCouponAccounttransRec2.getTranTimeShow() == null ? "" : payCouponAccounttransRec2.getTranTimeShow());
		}

		// 用PageInfo对结果进行包装
		PageInfo<PayCouponAccounttransRec> page = new PageInfo<PayCouponAccounttransRec>(payCouponAccounttransRecList);

		return page;

	}

}
