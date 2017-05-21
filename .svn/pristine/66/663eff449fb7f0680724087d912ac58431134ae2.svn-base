package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.BalanceMapper;
import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.service.BalanceService;

/**
 * 会员余额账户更新实现层 Copyright: Copyright (c) 2016年9月22日 下午3:10:47
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Service
public class BalanceServiceImpl implements BalanceService {

	@Autowired
	private BalanceMapper balanceMapper;

	/**
	 * 查询账户余额
	 * 
	 * @param balance
	 * @return
	 */
	@Override
	public Balance findByUserId(String userId) {
		return balanceMapper.findByUserId(userId);
	}

	@Override
	public int update(Balance balance) {
		return balanceMapper.updateBalance(balance);
	}

	@Override
	public int update(MemberRecordVo memberRecordVo) {

		return balanceMapper.updateMemberRecord(memberRecordVo);
	}

	@Override
	public void plusBalance(Balance balance) {
		balanceMapper.plusBalance(balance);
	}

	@Override
	public void subtractionBalance(Balance balance) {
		balanceMapper.subtractionBalance(balance);
	}

	@Override
	public List<Balance> listAll(Balance balance) {
		return balanceMapper.listAll(balance);
	}

	@Override
	public Balance findById(String id) {
		return balanceMapper.findById(id);
	}

	@Override
	public Balance ById(String id) {
		// TODO Auto-generated method stub
		return balanceMapper.ById(id);
	}

	@Override
	public void save(Balance balance) {
		// TODO Auto-generated method stub
		balanceMapper.save(balance);

	}
}
