package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.PayDirectCoupon;

public interface DirectCouponService {

	public List<PayDirectCoupon> findAll(PayDirectCoupon payDirectCoupon);

	public int save(PayDirectCoupon payDirectCoupon);

	public int deleteDirectCoupon(String id);

	public PayDirectCoupon findDirectCouponById(String id);

	public int update(PayDirectCoupon payDirectCoupon);

	public void updatestate(String Id);
}
