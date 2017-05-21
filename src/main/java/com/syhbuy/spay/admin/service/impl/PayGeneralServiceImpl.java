package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.dao.PayCouponAccounttransRecMapper;
import com.syhbuy.spay.admin.dao.PayGeneralMapper;
import com.syhbuy.spay.admin.entity.PayCouponAccounttransRec;
import com.syhbuy.spay.admin.entity.PayGeneral;
import com.syhbuy.spay.admin.service.PayGeneralService;

/**
 * 用户通用代金券 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-2 上午10:30:01
 * <p>
 * Company: 陕西善友汇网络科技股份有限公司
 * <p>
 * 
 * @author houss
 * @version 1.0.0
 */
@Service
public class PayGeneralServiceImpl implements PayGeneralService {

	@Autowired
	private PayGeneralMapper payGeneralMapper;

	@Autowired
	private PayCouponAccounttransRecMapper payCouponAccounttransRecMapper;

	@Override
	public List<PayGeneral> findAll(PayGeneral payGeneral) {

		return payGeneralMapper.findAll(payGeneral);
	}

	/**
	 * 新增通用券流水
	 */
	@Override
	public int save(PayGeneral payGeneral) {
		// payGeneral.setCashCouponId();
		PayCouponAccounttransRec payCouponAccounttransRec = new PayCouponAccounttransRec();
		payCouponAccounttransRec.setId(IDGeneratorUtils.getUUID32());
		payCouponAccounttransRec.setTrtanId(IDGeneratorUtils.getOrderID());
		payCouponAccounttransRec.setCouponId(payGeneral.getCashCouponId());
		payCouponAccounttransRec.setUserId(payGeneral.getUserId());
		payCouponAccounttransRec.setTransAmount(payGeneral.getCouponMoney());
		payCouponAccounttransRec.setTranTime(DateUtils.getCurrTime());
		payCouponAccounttransRec.setTranType("1");
		payCouponAccounttransRec.setDescribe(payGeneral.getTitle());
		payCouponAccounttransRec.setCouponType("0");
		payCouponAccounttransRec.setIsDel("0");

		int a = payGeneralMapper.save(payGeneral);
		if (a > 0) {
			payCouponAccounttransRec.setTranStatus("0");
		} else {
			payCouponAccounttransRec.setTranStatus("1");
		}
		int b = payCouponAccounttransRecMapper.insertSelective(payCouponAccounttransRec);
		if (a > 0 && b > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public void deletePayGeneral(String id) {
		payGeneralMapper.deletePayGeneral(id);
	}

	@Override
	public PayGeneral payGeneralById(String id) {

		return payGeneralMapper.payGeneralById(id);
	}

	@Override
	public int update(PayGeneral payGeneral) {
		int a = 0;
		int b = 0;
		PayGeneral payGeneral1 = payGeneralMapper.payGeneralById(payGeneral.getId());
		if (payGeneral1.getCouponMoney() != null && !"".equals(payGeneral1.getCouponMoney())) {
			if (payGeneral1.getCouponMoney().equals(payGeneral.getCouponMoney()) && payGeneral.getCouponSatus().equals("2") || payGeneral.getCouponSatus().equals("2")) {
				PayCouponAccounttransRec payCouponAccounttransRec = new PayCouponAccounttransRec();
				payCouponAccounttransRec.setId(IDGeneratorUtils.getUUID32());
				payCouponAccounttransRec.setTrtanId(IDGeneratorUtils.getOrderID());
				payCouponAccounttransRec.setCouponId(payGeneral.getCashCouponId());
				payCouponAccounttransRec.setUserId(payGeneral.getUserId());
				payCouponAccounttransRec.setTransAmount(payGeneral.getCouponMoney());
				payCouponAccounttransRec.setTranTime(DateUtils.getCurrTime());
				payCouponAccounttransRec.setTranType("5");
				payCouponAccounttransRec.setDescribe(payGeneral.getTitle());
				payCouponAccounttransRec.setCouponType("0");
				payCouponAccounttransRec.setIsDel("0");
				a = payGeneralMapper.update(payGeneral);
				if (a > 0) {
					payCouponAccounttransRec.setTranStatus("0");
				} else {
					payCouponAccounttransRec.setTranStatus("1");
				}
				b = payCouponAccounttransRecMapper.insertSelective(payCouponAccounttransRec);
				if (a > 0 && b > 0) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		if ((payGeneral1.getCouponMoney() != null ? payGeneral1.getCouponMoney() : "").equals(payGeneral.getCouponMoney())) {
			a = payGeneralMapper.update(payGeneral);
			return 1;
		} else {
			PayCouponAccounttransRec payCouponAccounttransRec = new PayCouponAccounttransRec();
			payCouponAccounttransRec.setId(IDGeneratorUtils.getUUID32());
			payCouponAccounttransRec.setTrtanId(IDGeneratorUtils.getOrderID());
			payCouponAccounttransRec.setCouponId(payGeneral.getCashCouponId());
			payCouponAccounttransRec.setUserId(payGeneral.getUserId());
			payCouponAccounttransRec.setTransAmount(payGeneral.getCouponMoney());
			payCouponAccounttransRec.setTranTime(DateUtils.getCurrTime());
			payCouponAccounttransRec.setTranType("1");
			payCouponAccounttransRec.setDescribe(payGeneral.getTitle());
			payCouponAccounttransRec.setCouponType("0");
			payCouponAccounttransRec.setIsDel("0");
			a = payGeneralMapper.update(payGeneral);
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
		return 0;
	}

	@Override
	public void updatestate(String id) {
		// TODO Auto-generated method stub
		payGeneralMapper.updatestate(id);
	}

}
