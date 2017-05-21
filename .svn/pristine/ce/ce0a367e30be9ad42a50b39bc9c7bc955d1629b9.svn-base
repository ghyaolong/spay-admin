package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.PayApplyMapper;
import com.syhbuy.spay.admin.entity.PayApply;
import com.syhbuy.spay.admin.service.PayApplyService;

/**
 * @author 调账申请业务层 实现类
 */
@Service
public class PayApplyServiceImpl implements PayApplyService {

	@Autowired
	private PayApplyMapper payApplyMapper;

	@Override
	public int insert(PayApply record) {
		return payApplyMapper.insert(record);
	}

	@Override
	public int insertSelective(PayApply record) {
		return payApplyMapper.insertSelective(record);
	}

	@Override
	public List<PayApply> findAll(PayApply payApply) {
		// TODO Auto-generated method stub
		return payApplyMapper.findAll(payApply);
	}

	@Override
	public PayApply ById(String id) {
		// TODO Auto-generated method stub
		return payApplyMapper.ById(id);
	}

	@Override
	public void changeType(PayApply payApply) {

		payApplyMapper.changeType(payApply);

	}
}
