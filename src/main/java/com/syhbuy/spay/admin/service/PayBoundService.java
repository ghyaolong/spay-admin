package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.PayBound;

public interface PayBoundService {
public List<PayBound> findAll(PayBound bound);
	
	public void delete();
	
	public void save(PayBound bound);

	public List<PayBound> findBound(PayBound payBound);
}
