package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.AppAdvertisement;

public interface AppAdvertisementService {
	
	public List<AppAdvertisement> QueryAll(AppAdvertisement appAdvertisement);

	public AppAdvertisement detailsById(String id);

	public int add(AppAdvertisement appAdvertisement);

	public int deleteApp(String id);


}
