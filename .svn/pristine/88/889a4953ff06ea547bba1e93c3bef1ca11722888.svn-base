package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.UserMapper;
import com.syhbuy.spay.admin.entity.User;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.UserMessageVo;
import com.syhbuy.spay.admin.service.UserService;

/**
 * 
 * 用户列表页查询实现层
 * <p>
 * Copyright: Copyright (c) 2016年9月12日 下午2:27:20
 * <p>
 * Company:
 * <p>
 * 
 * @author 曹虎
 * @version 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserMessageVo> QueryAllUser(UserMessageVo userMessageVo) {

		return userMapper.QueryAllUser(userMessageVo);
	}

	/**
	 * 用户添加实现层
	 */
	@Override
	public int save(User user) {
		
		return userMapper.save(user);
	}

	/**
	 * 跳转用户修改实现层
	 */
	@Override
	public UserMessageVo findAllUser(String id) {

		return userMapper.findAllUser(id);
	
	}

	/**
	 * 用户修改实现层
	 */
	@Override
	public void update(UserMessageVo userMessageVo) {
		
		userMapper.update(userMessageVo);
	}

	/**
	 * 查看会员信息详情
	 */
	@Override
	public UserMessageVo detailsById(String id) {
		
		return	userMapper.detailsById(id);
		
		
	}

	/**
	 * 修改会员状态
	 */
	@Override
	public void stata(User user) {
		
		userMapper.state(user);
		
		
	}


	/**
	 * 导出Excel表格
	 */
	@Override
	public List<UserMessageVo> deriveExcel(UserMessageVo userMessageVo) {
		
		return userMapper.deriveExcel(userMessageVo);
	}

	@Override
	public User ById(MemberRecordVo memberRecordVo) {
		// TODO Auto-generated method stub
		return userMapper.ById(memberRecordVo);
	}

}
