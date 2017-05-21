package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.PayActiveMapper;
import com.syhbuy.spay.admin.entity.PayActive;
import com.syhbuy.spay.admin.entity.PayDispenseBuyRecord;
import com.syhbuy.spay.admin.service.PayActiveService;
@Service
public class PayActiveServiceImpl implements PayActiveService{
	@Autowired
	private PayActiveMapper payActiveMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return payActiveMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(PayActive record) {
		// TODO Auto-generated method stub
		return payActiveMapper.insert(record);
	}

	@Override
	public int insertSelective(PayActive record) {
		// TODO Auto-generated method stub
		return payActiveMapper.insertSelective(record);
	}

	@Override
	public PayActive selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return payActiveMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(PayActive payActive) {
		// TODO Auto-generated method stub
		return payActiveMapper.updateByPrimaryKeySelective(payActive);
	}

	@Override
	public int updateByPrimaryKey(PayActive record) {
		// TODO Auto-generated method stub
		return payActiveMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<PayActive> getAllPayActive() {
		// TODO Auto-generated method stub
		return payActiveMapper.getAllPayActive();
	}
	@Override
	public List getSum(PayDispenseBuyRecord record){
		return payActiveMapper.getSum(record);
	}

	@Override
	public List<PayActive> getAllPayActive(PayActive payActive) {
		return payActiveMapper.getAllPayActive();
	}

}
