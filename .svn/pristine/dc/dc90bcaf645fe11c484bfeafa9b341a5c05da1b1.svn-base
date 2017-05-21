package com.syhbuy.spay.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.AddressMapper;
import com.syhbuy.spay.admin.entity.Address;
import com.syhbuy.spay.admin.entityVo.UserMessageVo;
import com.syhbuy.spay.admin.service.AddressSevice;

@Service
public class AddressSeviceImpl implements AddressSevice {

	@Autowired
	private AddressMapper addressMapper;

	@Override
	public int updateByPrimaryKeySelective(UserMessageVo userMessageVo) {

		return addressMapper.updateByPrimaryKeySelective(userMessageVo);
	}

	@Override
	public void save(Address address) {
		// TODO Auto-generated method stub
		addressMapper.save(address);
	}

	@Override
	public void updateAddress(UserMessageVo userMessageVo) {
		// TODO Auto-generated method stub
		addressMapper.updateAddress(userMessageVo);
	}

}
