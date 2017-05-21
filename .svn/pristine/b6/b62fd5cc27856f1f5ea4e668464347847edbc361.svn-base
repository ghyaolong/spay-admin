package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.ReturnTaskPoolMapper;
import com.syhbuy.spay.admin.entity.ReturnTaskPool;
import com.syhbuy.spay.admin.service.ReturnTaskPoolService;
@Service
public class ReturnTaskPoolServiceImpl implements ReturnTaskPoolService{

	@Autowired
	private ReturnTaskPoolMapper returnTaskPoolMapper;
	/**
	 * 待返任务池列表页
	 */
	@Override
	public List<ReturnTaskPool> findAll(ReturnTaskPool returnTaskPool) {
		
		return returnTaskPoolMapper.findAll(returnTaskPool);
	}
	/**
	 * 添加任务
	 */
	@Override
	public void save(ReturnTaskPool returnTaskPool) {
		// TODO Auto-generated method stub
		returnTaskPoolMapper.save(returnTaskPool);
	}
	/**
	 * 跳转修改页面
	 * @return 
	 */
	@Override
	public ReturnTaskPool ById(String id) {
		// TODO Auto-generated method stub
		return returnTaskPoolMapper.ById(id);
	}
	/**
	 * 修改任务
	 */
	@Override
	public void update(ReturnTaskPool returnTaskPool) {
		// TODO Auto-generated method stub
		returnTaskPoolMapper.update(returnTaskPool);
	}
	
	/**
	 * 导出Excel
	 */
	@Override
	public List<ReturnTaskPool> Excel(ReturnTaskPool returnTaskPool) {
		// TODO Auto-generated method stub
		return returnTaskPoolMapper.Excel(returnTaskPool);
	}

}
