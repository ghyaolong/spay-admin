package com.syhbuy.spay.admin.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.entity.Business;
import com.syhbuy.spay.admin.entity.Reward;
import com.syhbuy.spay.admin.entity.Rule;
import com.syhbuy.spay.admin.entityVo.RuleVo;
import com.syhbuy.spay.admin.service.BusinessService;
import com.syhbuy.spay.admin.service.RewardService;
import com.syhbuy.spay.admin.service.RuleManageService;
import com.syhbuy.spay.admin.service.RuleService;

/**
 * 规则管理控制层
 * <p>
 * Copyright: Copyright (c) 2016年9月12日 下午2:28:20
 * <p>
 * Company:
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@EnableTransactionManagement
@Controller
@RequestMapping(value = "/ruleManage/")
public class RuleManageController extends BaseController {

	@Autowired
	private RuleManageService ruleManageService;

	@Autowired
	private RewardService rewardService;

	@Autowired
	private BusinessService businessService;

	@Autowired
	private RuleService ruleService;

	@RequestMapping("listRule")
	public String listBtn(Model model) throws Exception {

		model.addAttribute("btns", this.findBtns());
		return "/ruleManage/list";
	}

	/**
	 * 加载页面 获取规则列表品类信息
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("save")
	public String saveRule(Model model) {

		return "/ruleManage/add";
	}

	/**
	 * 新增规则
	 * 
	 * @param data
	 * @return
	 * @throws ParseException
	 */
	@Transactional
	@RequestMapping(value = "saveRuleManage", method = RequestMethod.POST)
	@ResponseBody
	public String saveRuleManage(String data) {
		List<Rule> ruleList = new ArrayList<Rule>();
		List<Reward> rewardList = new ArrayList<Reward>();
		List<Business> businessList = new ArrayList<Business>();

		Rule rule = null;
		Reward reward = null;
		Business business = null;

		JSONObject jsObject = JSONObject.parseObject(data);
		Object d = jsObject.get("data");
		String ruleDesc = (String) jsObject.get("ruleDesc");
		List<RuleVo> r = JSON.parseArray(d.toString(), RuleVo.class);

		rule = new Rule();
		rule.setId(IDGeneratorUtils.getUUID32());
		rule.setRuleDesc(ruleDesc);
		rule.setBusinessId(r.get(0).getBusinessId());
		rule.setCreateTime(System.currentTimeMillis() + "");
		rule.setIsDel("0");
		ruleList.add(rule);
		ruleService.save(rule);
		for (RuleVo ruleVo : r) {
			reward = new Reward();
			reward.setId(IDGeneratorUtils.getUUID32());
			reward.setRuleId(rule.getId());
			reward.setTimeRefType(ruleVo.getTimeRefType());
			reward.setTimeInterval(ruleVo.getTimeInterval());
			reward.setPeriodCount(ruleVo.getPeriodCount());
			reward.setAmount(ruleVo.getAmount());
			reward.setPrice(ruleVo.getPrice());
			reward.setRewardName(ruleVo.getRewardName());
			rewardList.add(reward);

			business = new Business();
			business.setId(IDGeneratorUtils.getUUID32());
			business.setRewardId(reward.getId());
			business.setRewardObjType(ruleVo.getRewardObjType());
			business.setRewardType(ruleVo.getRewardType());
			business.setRewardRef(ruleVo.getRewardRef());
			business.setBonus(ruleVo.getBonus());
			business.setIsFreeze("0");
			business.setRewardRef(ruleVo.getRewardRef());
			business.setDirectObjId1Name(ruleVo.getDirectObjId1Name());
			business.setDirectObjId2Name(ruleVo.getDirectObjId2Name());
			business.setDirectObjId3Name(ruleVo.getDirectObjId3Name());
			business.setRewardType(ruleVo.getRewardType());
			business.setFreezePeriod(ruleVo.getFreezePeriod());
			if ("".equals(ruleVo.getIndate())||ruleVo.getIndate()==null) {
				business.setIsIndate("1");
				business.setIndate(new Long(0));
			} else {
				Long num = ruleVo.getIndate();
					business.setIsIndate("0");
					business.setIndate(ruleVo.getIndate());
			}
			if (ruleVo.getUpLimit() == null) {
				business.setIsLimit((long) 0);
				business.setUpLimit((long) 0);
			} else {
				business.setIsLimit((long) 1);
				business.setUpLimit(ruleVo.getUpLimit());
			}
			// 定向券
			if ("1".equals(ruleVo.getDirectCategory())) {
				business.setDirectCategory("2");
				business.setDirectObjId(ruleVo.getDirectObjId1());
				business.setDirectObjId2(ruleVo.getDirectObjId2());
				business.setDirectObjId3(ruleVo.getDirectObjId3());
				
			} // 通用券
			if ("2".equals(ruleVo.getDirectCategory())) {
				business.setDirectCategory("0");
				business.setDirectObjId("0");
				business.setDirectObjId2("0");
				business.setDirectObjId3("0");
			}
			business.setTitle(ruleVo.getTitle());

			businessList.add(business);
		}
		// 分别把两个list批量存入数据库

		rewardService.saveReward(rewardList);
		businessService.save(businessList);

		return "success";
	}

	/**
	 * 规则管理列表
	 * 
	 * @param ruleManage对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<RuleVo> page(RuleVo ruleManage, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<RuleVo> pageList = ruleManageService.findAllRuleManage(ruleManage);
		for (RuleVo r : pageList) {
			r.setPrice(r.getPrice() == null ? new Long(0) : r.getPrice());
			r.setRewardName(r.getRewardName() == null ? "" : r.getRewardName());
			r.setAmount(r.getAmount() == null ? new Long(0) : r.getAmount());
			r.setRewardObjType(r.getRewardObjType() == null ? "" : r.getRewardObjType());
			r.setBonus(r.getBonus() == null ? (short) 0 : r.getBonus());

			if (r.getCreateTime() != null) {
				r.setCtime(DateUtils.getDateTime(r.getCreateTime()));
			} else {
				r.setCtime("");
			}
		}
		PageInfo<RuleVo> page = new PageInfo<RuleVo>(pageList);

		return page;
	}
}
