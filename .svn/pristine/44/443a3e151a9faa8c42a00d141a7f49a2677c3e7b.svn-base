package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.NewsPushedMapper;
import com.syhbuy.spay.admin.entity.NewsPushed;
import com.syhbuy.spay.admin.service.NewsPushedService;
@Service
public class NewsPushedServiceImpl implements NewsPushedService{

	@Autowired
	private NewsPushedMapper newsPushedMapper;
	
	public List<NewsPushed> QueryAll(NewsPushed newsPushed) {
		
		return newsPushedMapper.QueryAll(newsPushed);
	}

	/**
	 * 推送消息
	 * @return 
	 */
	public int add(NewsPushed newsPushed) {
		
		return newsPushedMapper.add(newsPushed);
		
	}

	/**
	 * 推送详情
	 */
	public NewsPushed detailsById(String id) {
		
		return newsPushedMapper.detailsById(id);
	}

	/**
	 * 删除推送消息
	 */
	public int deleteNewsPushed(String id) {
		
		return newsPushedMapper.deleteNewsPushed(id);
	}

}
