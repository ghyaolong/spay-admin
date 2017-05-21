package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.BusinessDef;

public interface BusinessDefService {
	

	public List<BusinessDef> findAll(BusinessDef businessDef);

	public void save(BusinessDef businessDef);

	public void deleteBusinessDef(String id);

	public BusinessDef findById(String id);

	public void update(BusinessDef businessDef);

}
