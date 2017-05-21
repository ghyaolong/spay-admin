package com.syhbuy.spay.admin.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.HttpRequester;
import com.syhbuy.spay.admin.base.util.HttpResponse;
import com.syhbuy.spay.admin.entity.AuditSettlement;
import com.syhbuy.spay.admin.service.AuditSettlementService;

/**
 * 审核结算. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午4:57:42
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Controller
@RequestMapping("/AuditSettlement/")
public class AuditSettlementController extends BaseController {

	private final Logger log = Logger.getLogger(AuditSettlementController.class);

	@Autowired
	private AuditSettlementService auditSettlementService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {

		model.addAttribute("btns", this.findBtns());

		return "/AuditSettlement/list";
	}

	/**
	 * 审核结算列表页
	 * 
	 * @param auditSettlement
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<AuditSettlement> page(AuditSettlement auditSettlement, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<AuditSettlement> pageList = auditSettlementService.findAll(auditSettlement);
		for (AuditSettlement auditSettlement2 : pageList) {
			auditSettlement2.setApplicationName(auditSettlement2.getApplicationName() == null ? "" : auditSettlement2.getApplicationName());
			auditSettlement2.setApprovalId(auditSettlement2.getApprovalId() == null ? "" : auditSettlement2.getApprovalId());
			auditSettlement2.setAuditName(auditSettlement2.getAuditName() == null ? "" : auditSettlement2.getAuditName());
			auditSettlement2.setAuditOpinion(auditSettlement2.getAuditOpinion() == null ? "" : auditSettlement2.getAuditOpinion());
			auditSettlement2.setAuditResult(auditSettlement2.getAuditResult() == null ? "" : auditSettlement2.getAuditResult());
			if (auditSettlement2.getAuditTime() != null) {
				auditSettlement2.setSearchStartTime(DateUtils.getDate(auditSettlement2.getAuditTime().toString().substring(0, 19)));
			} else {
				auditSettlement2.setSearchStartTime("");

			}
			if (auditSettlement2.getApplicationTime() != null) {
				auditSettlement2.setResgTimeString(DateUtils.getDate(auditSettlement2.getApplicationTime().toString().substring(0, 19)));
			} else {
				auditSettlement2.setResgTimeString("");
			}

		}

		PageInfo<AuditSettlement> page = new PageInfo<AuditSettlement>(pageList);

		// 调ＰＨＰ接口
		String url = "http://api.syhbuy.cn/api/index.php";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("", "");
		map.put("", "");
		map.put("", "");
		try {
			HttpResponse response = HttpRequester.sendPost(url, map);
			String ss = response.getContent();

			JSONObject obj = JSONObject.parseObject(ss);

		}
		catch (IOException e) {

			log.error("调ＰＨＰ审核结算接口异常", e);
		}

		return page;

	}
}
