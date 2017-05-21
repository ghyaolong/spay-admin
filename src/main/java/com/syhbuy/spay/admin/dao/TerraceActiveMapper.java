package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.TerraceActive;

public interface TerraceActiveMapper {
    int deleteByPrimaryKey(String id);

    int insert(TerraceActive record);

    int insertSelective(TerraceActive record);

    TerraceActive selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TerraceActive record);

    int updateByPrimaryKey(TerraceActive record);
    
    //页面的增删改查
    public List<TerraceActive> findAll(TerraceActive terraceActive);

	public void save(TerraceActive terraceActive);

	public void deleteTerraceActive(String id);

	public TerraceActive terraceActiveById(String id);

	public void update(TerraceActive terraceActive);
}