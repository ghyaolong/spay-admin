package com.syhbuy.spay.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.syhbuy.spay.admin.entity.Reward;

public interface RewardMapper {
   
	/**
	 * 奖励列表Dao
	 * @return
	 */
	public List<Reward> QueryAll(Reward reward);

	/**
	 * 新增奖励Dao
	 * @param reward
	 */
	public void save(Reward reward);

	/**
	 * 删除奖励Dao
	 * @param id
	 */
	public void deleteReward(String id);

	/**
	 * 根据ID查询奖励Dao
	 */
	public Reward FindById(String id);

	/**
	 * 修改奖励Dao
	 * @param id
	 */
	public void update(Reward reward);

	
	public void saveReward(List<Reward> rewardList);
}