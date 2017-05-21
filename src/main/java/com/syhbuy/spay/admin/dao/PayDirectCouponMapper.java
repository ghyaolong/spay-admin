package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.PayDirectCoupon;

public interface PayDirectCouponMapper {

	int deleteByPrimaryKey(String id);

	int insert(PayDirectCoupon record);

	int insertSelective(PayDirectCoupon record);

	PayDirectCoupon selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(PayDirectCoupon record);

	int updateByPrimaryKey(PayDirectCoupon record);

	/**
	 * 查找全部返券
	 * 
	 * @param payDirectCoupon
	 * @return
	 */
	public List<PayDirectCoupon> findAll(PayDirectCoupon payDirectCoupon);

	/**
	 * 根据Id查找返券
	 * 
	 * @param id
	 * @return
	 */
	public PayDirectCoupon findDirectCouponById(String id);

	/**
	 * ruanshan
	 * 
	 * @param id
	 * @return
	 */
	public int update(String id);

	public void updatestate(String Id);

}