package com.syhbuy.spay.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syhbuy.spay.admin.entity.PayActive;
import com.syhbuy.spay.admin.entity.PayDispenseBuyRecord;
@Repository
public interface PayActiveMapper {
    public int deleteByPrimaryKey(String id);

    public int insert(PayActive record);

    public int insertSelective(PayActive record);

    public PayActive selectByPrimaryKey(String id);

    public int updateByPrimaryKeySelective(PayActive payActive);

    public int updateByPrimaryKey(PayActive record);
    
    List getAllPayActive();
    
    public List getSum(PayDispenseBuyRecord record);
    
}