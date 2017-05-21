package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.LoginInfoMapper;
import com.syhbuy.spay.admin.entity.LoginInfo;
import com.syhbuy.spay.admin.entityVo.UserMessageVo;
import com.syhbuy.spay.admin.service.LoginInfoMapperService;

@Service
public class LoginInfoMapperServiceImpl implements LoginInfoMapperService{
	
	@Autowired
	private LoginInfoMapper loginInfoMapper;

	@Override
	public int insert(LoginInfo info) {
		
		return loginInfoMapper.insert(info);
	}

	@Override
	public void save(LoginInfo loginInfo) {
		// TODO Auto-generated method stub
		loginInfoMapper.save(loginInfo);
	}

	@Override
	public List<LoginInfo> findAllLoginInfo(LoginInfo loginInfo) {
		// TODO Auto-generated method stub
		return loginInfoMapper.findAllLoginInfo(loginInfo);
		
	} 

}
