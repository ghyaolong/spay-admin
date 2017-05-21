package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.User;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.UserMessageVo;

public interface UserMapper {

	/**
	 * 用户列表页Dao层
	 * 
	 * @param user对象
	 * @return
	 */
	List<UserMessageVo> QueryAllUser(UserMessageVo userMessageVo);

	/**
	 * 用户添加Dao层
	 * 
	 * @param user对象
	 * @return
	 */
	public int save(User user);

	/**
	 * 用户跳转Dao层
	 * @param userId
	 * @return
	 */
	public UserMessageVo findAllUser(String id);

	/**
	 * 用户修改Dao层
	 * @param user
	 */
	public void update(UserMessageVo userMessageVo);

	public UserMessageVo detailsById(String id);

	/**
	 * 修改会员状态
	 * @param user
	 */
	public void state(User user);

	/**
	 * 导出Excel
	 * @param userMessageVo
	 * @return
	 */
	List<UserMessageVo> deriveExcel(UserMessageVo userMessageVo);

	User ById(MemberRecordVo memberRecordVo);

}