package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.PayBound;

public interface PayBoundMapper {
	
	public List<PayBound> findAll(PayBound bound);
	
	public void delete();
	
	public void save(PayBound bound);

	public List<PayBound> findBound(PayBound payBound);

}
