package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.LoginInfo;

public interface LoginInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(LoginInfo loginInfo);

    int insertSelective(LoginInfo record);

    LoginInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LoginInfo record);

    int updateByPrimaryKey(LoginInfo record);

	public void save(LoginInfo loginInfo);

	public List<LoginInfo> findAllLoginInfo(LoginInfo loginInfo);
}