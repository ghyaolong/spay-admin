package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.Business;

public interface BusinessMapper {

	List<Business> findAllBussiness(Business record);

	Business findById(String id);

	public int saveBusiness(Business business);

	public void deleteBusiness(String id);

	public void updateBusiness(Business business);

	public void save(List<Business> businessList);

}