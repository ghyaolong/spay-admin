package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.AppAdvertisementMapper;
import com.syhbuy.spay.admin.entity.AppAdvertisement;
import com.syhbuy.spay.admin.service.AppAdvertisementService;
@Service
public class AppAdvertisementServiceImpl implements AppAdvertisementService{

	@Autowired
	private AppAdvertisementMapper advertisementMapper;
	
	/**
	 *APP广告实现层 
	 */
	public List<AppAdvertisement> QueryAll(AppAdvertisement appAdvertisement) {
		
		return advertisementMapper.QueryAll(appAdvertisement);
	}
	
	/**
	 * APP广告 详情
	 */
	public AppAdvertisement detailsById(String id) {
		
		return advertisementMapper.detailsById(id);
	}

	/**
	 * 添加APP广告
	 */
	public int add(AppAdvertisement appAdvertisement) {
		
		return advertisementMapper.add(appAdvertisement);
	}

	/**
	 * 删除广告 
	 * @param id
	 */
	public int deleteApp(String id) {
	
		return advertisementMapper.deleteApp(id);
		
	}

}
