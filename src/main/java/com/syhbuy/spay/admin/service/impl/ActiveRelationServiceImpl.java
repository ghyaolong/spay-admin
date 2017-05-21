package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.ActiveRelationMapper;
import com.syhbuy.spay.admin.entity.ActiveRelation;
import com.syhbuy.spay.admin.service.ActiveRelationService;
@Service
public class ActiveRelationServiceImpl implements ActiveRelationService{

	@Autowired
	private ActiveRelationMapper activeRelationMapper;
	
	public List<ActiveRelation> findAll(ActiveRelation activeRelation) {
		
		return activeRelationMapper.findAll(activeRelation);
	}

	/**
	 * 添加业务规则
	 */
	public void save(ActiveRelation activeRelation) {

		activeRelationMapper.save(activeRelation);
	}

	/**
	 * 删除业务规则
	 */
	public void deleteActiveRelation(String id) {

		activeRelationMapper.deleteActiveRelation(id);
	}

	/**
	 * 跳转修改业务规则
	 */
	public ActiveRelation activeRelationById(String id) {
		
		return activeRelationMapper.activeRelationById(id);
	}

	/**
	 * 修改业务规则
	 */
	public void update(ActiveRelation activeRelation) {

		activeRelationMapper.update(activeRelation);
	}

}
