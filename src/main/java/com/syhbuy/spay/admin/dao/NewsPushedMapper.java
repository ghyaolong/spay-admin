package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.NewsPushed;

public interface NewsPushedMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewsPushed record);

    int insertSelective(NewsPushed record);

    NewsPushed selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewsPushed record);

    int updateByPrimaryKey(NewsPushed record);
    
    public List<NewsPushed> QueryAll(NewsPushed newsPushed);

    public int add(NewsPushed newsPushed);

    public NewsPushed detailsById(String id);

	public int deleteNewsPushed(String id);
}