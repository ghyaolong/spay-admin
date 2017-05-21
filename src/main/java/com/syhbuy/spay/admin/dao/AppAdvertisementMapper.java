package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.AppAdvertisement;

public interface AppAdvertisementMapper {
    
    /**
     * APP广告列表Dao
     * @param appAdvertisement
     * @return
     */
    public List<AppAdvertisement> QueryAll(AppAdvertisement appAdvertisement);
    
    /**
     * APP广告详情Dao
     * @param id
     * @return
     */
    public AppAdvertisement detailsById(String id);

    /**
     * 添加APP广告Dao
     * @param id
     * @return
     */
	public int add(AppAdvertisement appAdvertisement);

	/**
     * 删除APP广告Dao
     * @param id
     * @return
     */
	public int deleteApp(String id);
}