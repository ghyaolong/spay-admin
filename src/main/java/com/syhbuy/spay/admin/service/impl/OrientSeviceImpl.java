package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.OrientMapper;
import com.syhbuy.spay.admin.entity.Orient;
import com.syhbuy.spay.admin.service.OrientService;
@Service
public class OrientSeviceImpl implements OrientService{
	@Autowired
	OrientMapper mapper;
	public List getAllDispenseRecord(Orient o) {
		// TODO Auto-generated method stub
		return mapper.getAllDispenseRecord(o);
	}
	public Orient findById(Orient o) {
		// TODO Auto-generated method stub
		return mapper.findById(o);
	}

	
	

}
