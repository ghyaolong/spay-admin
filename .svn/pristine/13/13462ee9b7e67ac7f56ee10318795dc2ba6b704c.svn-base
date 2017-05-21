package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.PayBoundMapper;
import com.syhbuy.spay.admin.entity.PayBound;
import com.syhbuy.spay.admin.service.PayBoundService;
@Service
public class PayBoundServiceImpl implements PayBoundService{
	@Autowired
	PayBoundMapper mapper;

	@Override
	public List<PayBound> findAll(PayBound bound) {
		// TODO Auto-generated method stub
		return mapper.findAll(bound);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		mapper.delete();
		
	}

	@Override
	public void save(PayBound bound) {
		// TODO Auto-generated method stub
		mapper.save(bound);
	}

	@Override
	public List<PayBound> findBound(PayBound payBound) {
		// TODO Auto-generated method stub
		return mapper.findBound(payBound);
	}

}
