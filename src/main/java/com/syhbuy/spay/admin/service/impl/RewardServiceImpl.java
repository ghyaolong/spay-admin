package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.RewardMapper;
import com.syhbuy.spay.admin.entity.Reward;
import com.syhbuy.spay.admin.service.RewardService;
@Service
public class RewardServiceImpl implements RewardService{

	@Autowired
	private RewardMapper rewardMapper;
	
	/**
	 * 奖励列表实现层
	 */
	@Override
	public List<Reward> QueryAll(Reward reward) {
		
		return rewardMapper.QueryAll(reward);
	}

	/**
	 * 新增奖励实现层
	 */
	@Override
	public void save(Reward reward) {
		
		rewardMapper.save(reward);
	}

	/**
	 * 删除奖励实现层
	 */
	@Override
	public void deleteReward(String id) {

		rewardMapper.deleteReward(id);
	}

	/**
	 * 根据ID查询奖励实现层
	 */
	@Override
	public Reward FindById(String id) {
		
		return rewardMapper.FindById(id);
	}

	/**
	 * 修改奖励实现层
	 */
	@Override
	public void update(Reward reward) {

		rewardMapper.update(reward);
	}

	@Override
	public void saveReward(List<Reward> rewardList) {
		// TODO Auto-generated method stub
		rewardMapper.saveReward(rewardList);
	}

}
