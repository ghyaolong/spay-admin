package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.TerraceActiveMapper;
import com.syhbuy.spay.admin.entity.TerraceActive;
import com.syhbuy.spay.admin.service.TerraceActiveService;
@Service
public class TerraceActiveServiceImpl implements TerraceActiveService{

	@Autowired
	private TerraceActiveMapper terraceActiveMapper;

	public List<TerraceActive> findAll(TerraceActive terraceActive) {
		// TODO Auto-generated method stub
		return terraceActiveMapper.findAll(terraceActive);
	}


	public void save(TerraceActive terraceActive) {
		// TODO Auto-generated method stub
		terraceActiveMapper.save(terraceActive);
	}

	public void deleteTerraceActive(String id) {
		// TODO Auto-generated method stub
		terraceActiveMapper.deleteTerraceActive(id);
	}


	public TerraceActive terraceActiveById(String id) {
		// TODO Auto-generated method stub
		return terraceActiveMapper.terraceActiveById(id);
	}


	public void update(TerraceActive terraceActive) {
		// TODO Auto-generated method stub
		terraceActiveMapper.update(terraceActive);
	}

}
