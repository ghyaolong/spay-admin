package com.syhbuy.spay.admin.dao;

import com.syhbuy.spay.admin.entity.Address;
import com.syhbuy.spay.admin.entityVo.UserMessageVo;

public interface AddressMapper {

	int deleteByPrimaryKey(String id);

	int insert(Address record);

	int insertSelective(Address record);

	Address selectByPrimaryKey(String id);

	int updateByPrimaryKey(Address record);

	public int updateByPrimaryKeySelective(UserMessageVo userMessageVo);

	public void save(Address address);

	public void updateAddress(UserMessageVo userMessageVo);
}