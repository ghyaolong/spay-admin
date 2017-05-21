package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.BusinessMapper;
import com.syhbuy.spay.admin.entity.Business;
import com.syhbuy.spay.admin.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	BusinessMapper mapper;

	@Override
	public List<Business> findAllBussiness(Business business) {
		// TODO Auto-generated method stub
		return mapper.findAllBussiness(business);
	}

	@Override
	public Business findById(String id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}

	@Override
	public void saveBusiness(Business business) {
		// TODO Auto-generated method stub
		mapper.saveBusiness(business);

	}

	@Override
	public void deleteBusiness(String id) {
		// TODO Auto-generated method stub
		mapper.deleteBusiness(id);
	}

	@Override
	public void updateBusiness(Business business) {
		// TODO Auto-generated method stub
		mapper.updateBusiness(business);
	}

	/**
	 * 交易信息
	 */

	@Override
	public void save(List<Business> businessList) {
		// TODO Auto-generated method stub
		mapper.save(businessList);
	}

}
