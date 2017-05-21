package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.PayCouponAccounttransRec;

public interface PayCouponAccounttransRecService {

	/**
     * 查询列表代金券账户流水
     * @param payActivity
     * @return
     */
	public List<PayCouponAccounttransRec> findAll(PayCouponAccounttransRec payCouponAccounttransRec);
}
