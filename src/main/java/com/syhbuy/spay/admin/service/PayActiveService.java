package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.PayActive;
import com.syhbuy.spay.admin.entity.PayDispenseBuyRecord;

public interface PayActiveService {
	int deleteByPrimaryKey(String id);

    int insert(PayActive record);

    int insertSelective(PayActive record);

    PayActive selectByPrimaryKey(String id);

    public  int updateByPrimaryKeySelective(PayActive payActive);

    int updateByPrimaryKey(PayActive record);
    
    List<PayActive> getAllPayActive();
    
    public List<PayDispenseBuyRecord> getSum(PayDispenseBuyRecord record);

	List<PayActive> getAllPayActive(PayActive payActive);
}
