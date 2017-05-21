package com.syhbuy.spay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.entity.Reward;
import com.syhbuy.spay.admin.service.RewardService;

/**
 * 充值奖励. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:27:59
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */
@Controller
@RequestMapping("/Reward/")
public class RewardController extends BaseController {

	@Autowired
	private RewardService rewardService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/reward/list";
	}

	/**
	 * 奖励列表页查询
	 * 
	 * @param reward
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<Reward> page(Reward reward, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<Reward> pageList = rewardService.QueryAll(reward);

		PageInfo<Reward> page = new PageInfo<Reward>(pageList);

		return page;
	}

	/**
	 * 跳转添加奖励页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add() {

		return "/reward/add";
	}

	/**
	 * 添加奖励
	 * 
	 * @param reward
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public String save(Reward reward) {
		rewardService.save(reward);

		return "success";
	}

	/**
	 * 删除奖励控制层
	 * 
	 * @return
	 */
	@RequestMapping("deleteReward")
	@ResponseBody
	public String deleteReward(String id) {

		rewardService.deleteReward(id);

		return "success";

	}

	/**
	 * 跳转修改奖励控制层
	 * 
	 * @param rule
	 * @return
	 */
	@RequestMapping(value = "updateReward")
	public String updateRule(String id, Model model) {

		Reward reward = rewardService.FindById(id);

		model.addAttribute("reward", reward);

		return "/reward/updateReward";
	}

	/**
	 * 修改奖励
	 * 
	 * @param reward
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(Reward reward) {

		rewardService.update(reward);

		return "success";

	}

	/**
	 * 奖励全查
	 * 
	 * @param reward
	 * @return
	 */
	@RequestMapping("getReward")
	@ResponseBody
	public List<Reward> loadOption(Reward reward) {
		List<Reward> pageList = rewardService.QueryAll(reward);
		return pageList;
	}
}
