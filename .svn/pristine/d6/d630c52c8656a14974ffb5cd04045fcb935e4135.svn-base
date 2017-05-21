package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.UserOperationLogMapper;
import com.syhbuy.spay.admin.entity.UserOperationLog;
import com.syhbuy.spay.admin.service.UserOperationLogService;

/**
 * 标题、简要说明. <br>
 * 类详细说明. 用户操作日志
 * <p>
 * Copyright: Copyright (c) 2016-11-24 下午5:21:19
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author
 * @version 1.0.0
 */
@Service
public class UserOperationLogServiceImpl implements UserOperationLogService {

	@Autowired
	private UserOperationLogMapper userOperationLogMapper;

	@Override
	public List<UserOperationLog> findAll(UserOperationLog userOperationLog) {

		return userOperationLogMapper.findAll(userOperationLog);

	}
}
