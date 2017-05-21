package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.UserOperationLog;

public interface UserOperationLogService {

	public List<UserOperationLog> findAll(UserOperationLog userOperationLog);

}
