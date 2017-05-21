package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.PayCouponAccounttransRecMapper;
import com.syhbuy.spay.admin.entity.PayCouponAccounttransRec;
import com.syhbuy.spay.admin.service.PayCouponAccounttransRecService;
@Service
public class PayCouponAccounttransRecServiceImpl implements PayCouponAccounttransRecService{
	@Autowired
	private PayCouponAccounttransRecMapper payCouponAccounttransRecMapper;
	/**
     * 查询列表代金券账户流水
     * @param payActivity
     * @return
     */
	public List<PayCouponAccounttransRec> findAll(
			PayCouponAccounttransRec payCouponAccounttransRec) {
		// TODO Auto-generated method stub
		return payCouponAccounttransRecMapper.findAll(payCouponAccounttransRec);
	}

}
