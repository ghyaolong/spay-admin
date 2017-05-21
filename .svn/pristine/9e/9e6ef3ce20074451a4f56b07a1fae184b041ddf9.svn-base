package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;

public interface BalanceMapper {

	int deleteByPrimaryKey(String id);

	int insertSelective(Balance record);

	Balance selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Balance record);

	int updateByPrimaryKey(Balance record);

	/**
	 * 会员余额账户更新
	 * 
	 * @param balance
	 * @return
	 */
	public int updateBalance(Balance balance);

	public int updateMemberRecord(MemberRecordVo memberRecordVo);

	/**
	 * 查询余额账信息
	 * 
	 * @param balance
	 * @return
	 */
	public Balance findByUserId(String userId);

	/**
	 * @return添加账户余额
	 */
	public void plusBalance(Balance balance);

	/**
	 * @param userId
	 *            会员ID
	 * @return 减少账户余额
	 */
	public void subtractionBalance(Balance balance);

	/**
	 * @param balance
	 * @return 查询所有会员余额信息
	 */
	public List<Balance> listAll(Balance balance);

	/**
	 * @param userId
	 *            会员ID
	 * @return根据Id查询会员账户信息
	 */
	public Balance findById(String id);

	public void changeType(Balance balance);

	public Balance ById(String id);

	public void save(Balance balance);
}