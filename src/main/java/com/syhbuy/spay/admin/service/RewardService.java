package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.Reward;

public interface RewardService {
	
	public List<Reward> QueryAll(Reward reward);

	public void save(Reward reward);

	public void deleteReward(String id);

	public Reward FindById(String id);

	public void update(Reward reward);

	public void saveReward(List<Reward> rewardList);

}
