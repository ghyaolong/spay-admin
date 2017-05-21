package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.Business;

public interface BusinessService {
	List<Business> findAllBussiness(Business business);

	Business findById(String id);

	public void saveBusiness(Business business);

	public void deleteBusiness(String id);

	public void updateBusiness(Business business);

	public void save(List<Business> businessList);
}
