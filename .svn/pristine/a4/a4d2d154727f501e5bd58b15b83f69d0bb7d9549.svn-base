package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.dao.PayCouponAccounttransRecMapper;
import com.syhbuy.spay.admin.dao.PayDirectCouponMapper;
import com.syhbuy.spay.admin.entity.PayCouponAccounttransRec;
import com.syhbuy.spay.admin.entity.PayDirectCoupon;
import com.syhbuy.spay.admin.service.DirectCouponService;

@Service
public class DirectCouponServiceImpl implements DirectCouponService {

	@Autowired
	private PayDirectCouponMapper payDirectCouponMapper;

	@Autowired
	private PayCouponAccounttransRecMapper payCouponAccounttransRecMapper;

	@Override
	public List<PayDirectCoupon> findAll(PayDirectCoupon payDirectCoupon) {

		return payDirectCouponMapper.findAll(payDirectCoupon);
	}

	@Override
	public int save(PayDirectCoupon payDirectCoupon) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		PayCouponAccounttransRec payCouponAccounttransRec = new PayCouponAccounttransRec();
		payCouponAccounttransRec.setId(IDGeneratorUtils.getUUID32());
		payCouponAccounttransRec.setTrtanId(IDGeneratorUtils.getOrderID());
		payCouponAccounttransRec.setCouponId(payDirectCoupon.getCashCouponId());
		payCouponAccounttransRec.setUserId(payDirectCoupon.getUserId());
		payCouponAccounttransRec.setTransAmount(payDirectCoupon.getCouponMoney());
		payCouponAccounttransRec.setTranTime(DateUtils.getCurrTime());
		payCouponAccounttransRec.setTranType("1");
		payCouponAccounttransRec.setDescribe(payDirectCoupon.getTitle());
		payCouponAccounttransRec.setCouponType("1");
		payCouponAccounttransRec.setIsDel("0");
		a = payDirectCouponMapper.insert(payDirectCoupon);
		if (a > 0) {
			payCouponAccounttransRec.setTranStatus("0");
		} else {
			payCouponAccounttransRec.setTranStatus("1");
		}
		b = payCouponAccounttransRecMapper.insertSelective(payCouponAccounttransRec);
		if (a > 0 && b > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteDirectCoupon(String id) {
		// TODO Auto-generated method stub
		return payDirectCouponMapper.update(id);
	}

	@Override
	public PayDirectCoupon findDirectCouponById(String id) {
		// TODO Auto-generated method stub
		return payDirectCouponMapper.findDirectCouponById(id);
	}

	@Override
	public int update(PayDirectCoupon payDirectCoupon) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		PayDirectCoupon directCoupon = payDirectCouponMapper.findDirectCouponById(payDirectCoupon.getId());
		PayCouponAccounttransRec payCouponAccounttransRec = new PayCouponAccounttransRec();
		payCouponAccounttransRec.setId(IDGeneratorUtils.getUUID32());
		payCouponAccounttransRec.setTrtanId(IDGeneratorUtils.getOrderID());
		payCouponAccounttransRec.setCouponId(payDirectCoupon.getCashCouponId());
		payCouponAccounttransRec.setUserId(payDirectCoupon.getUserId());
		payCouponAccounttransRec.setTransAmount(payDirectCoupon.getCouponMoney());
		payCouponAccounttransRec.setTranTime(DateUtils.getCurrTime());
		payCouponAccounttransRec.setDescribe(payDirectCoupon.getTitle());
		payCouponAccounttransRec.setCouponType("1");
		payCouponAccounttransRec.setIsDel("0");
		if (directCoupon.getDenomination().equals(payDirectCoupon.getDenomination()) && !"2".equals(payDirectCoupon.getCouponSatus())) {
			a = payDirectCouponMapper.updateByPrimaryKeySelective(payDirectCoupon);
			return 1;
		} else {
			if ("2".equals(payDirectCoupon.getCouponSatus())) {
				payCouponAccounttransRec.setTranType("5");
				payDirectCoupon.setFreezeDate(DateUtils.getCurrTime() + "");
				a = payDirectCouponMapper.updateByPrimaryKeySelective(payDirectCoupon);
				if (a > 0) {
					payCouponAccounttransRec.setTranStatus("0");
				} else {
					payCouponAccounttransRec.setTranStatus("1");
				}
				b = payCouponAccounttransRecMapper.insertSelective(payCouponAccounttransRec);
				if (a > 0 && b > 0) {
					return 1;
				}
			} else {
				payCouponAccounttransRec.setTranType("1");
				a = payDirectCouponMapper.updateByPrimaryKeySelective(payDirectCoupon);
				if (a > 0) {
					payCouponAccounttransRec.setTranStatus("0");
				} else {
					payCouponAccounttransRec.setTranStatus("1");
				}
				b = payCouponAccounttransRecMapper.insertSelective(payCouponAccounttransRec);
				if (a > 0 && b > 0) {
					return 1;
				}
			}
		}
		return 0;
	}

	@Override
	public void updatestate(String Id) {
		// TODO Auto-generated method stub
		payDirectCouponMapper.updatestate(Id);
	}

}
