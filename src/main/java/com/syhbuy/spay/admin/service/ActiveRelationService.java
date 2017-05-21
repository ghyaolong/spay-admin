package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.ActiveRelation;

public interface ActiveRelationService {
	
	public List<ActiveRelation> findAll(ActiveRelation activeRelation);

	public void save(ActiveRelation activeRelation);

	public void deleteActiveRelation(String id);

	public ActiveRelation activeRelationById(String id);

	public void update(ActiveRelation activeRelation);

}
