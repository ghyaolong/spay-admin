package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.ReturnTaskPool;

public interface ReturnTaskPoolService {
	
	 List<ReturnTaskPool> findAll(ReturnTaskPool returnTaskPool);

	 public void save(ReturnTaskPool returnTaskPool);
	 
	 public void update(ReturnTaskPool returnTaskPool);

	 public ReturnTaskPool ById(String id);

	 public List<ReturnTaskPool> Excel(ReturnTaskPool returnTaskPool);

}
