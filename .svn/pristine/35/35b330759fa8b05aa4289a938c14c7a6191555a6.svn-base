package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.BusinessDefMapper;
import com.syhbuy.spay.admin.entity.BusinessDef;
import com.syhbuy.spay.admin.service.BusinessDefService;
@Service
public class BusinessDefServiceImpl implements BusinessDefService{

	@Autowired
	private BusinessDefMapper businessDefMapper;
	
	/**
	 * 业务列表页
	 */
	public List<BusinessDef> findAll(BusinessDef businessDef) {

		return businessDefMapper.findAll(businessDef);
	}

	/**
	 * 增加业务
	 */
	public void save(BusinessDef businessDef) {
		
		businessDefMapper.save(businessDef);
	}

	/**
	 * 删除业务
	 */
	public void deleteBusinessDef(String id) {
		
		businessDefMapper.deleteBusinessDef(id);
		
	}

	/**
	 * 跳转修改业务页面
	 */
	public BusinessDef findById(String id) {
		
		return businessDefMapper.findById(id);
	}

	/**
	 * 修改业务
	 */
	public void update(BusinessDef businessDef) {
		
		businessDefMapper.update(businessDef);
	}

}
