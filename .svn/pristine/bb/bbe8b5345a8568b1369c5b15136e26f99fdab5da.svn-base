package com.syhbuy.spay.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.syhbuy.spay.admin.entity.PayApply;

/**
 * @author 调账申请
 * 
 */
public interface PayApplyMapper {

	/**
	 * @param record
	 * @return 添加调账申请流水
	 */
	 public int insert(PayApply record);

	/**
	 * @param record
	 * @return
	 */
	 public int insertSelective(PayApply record);

	/**
	 * @param payApply 
	 * @return 查询所有
	 */
	 public List<PayApply> findAll(PayApply payApply);

	 public PayApply ById(@Param("id")String id);

     public void changeType(PayApply payApply);
     
   
}