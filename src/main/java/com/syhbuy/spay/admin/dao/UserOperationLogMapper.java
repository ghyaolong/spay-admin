package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.UserOperationLog;

public interface UserOperationLogMapper {

	List<UserOperationLog> findAll(UserOperationLog userOperationLog);
}