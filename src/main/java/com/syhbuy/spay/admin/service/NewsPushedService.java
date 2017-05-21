package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.NewsPushed;

public interface NewsPushedService {
	
	public List<NewsPushed> QueryAll(NewsPushed newsPushed);

	public int add(NewsPushed newsPushed);

	public NewsPushed detailsById(String id);

	public int deleteNewsPushed(String id);

}
