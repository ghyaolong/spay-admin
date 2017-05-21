package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;

public interface BalanceService {

	/**
	 * 会员余额账户更新
	 * 
	 * @param balance
	 * @return
	 */
	public int update(Balance balance);

	public int update(MemberRecordVo memberRecordVo);

	/**
	 * 查询余额账信息
	 * 
	 * @param balance
	 * @return
	 */
	public Balance findByUserId(String userId);

	/**
	 * @param userId
	 * @param amount
	 *            增加金额数
	 * @return
	 */
	public void plusBalance(Balance balance);

	/**
	 * @param userId
	 * @return 减少账户余额
	 */
	public void subtractionBalance(Balance balance);

	/**
	 * @param balance
	 * @return 查询显示所有会员余额账户信息
	 */
	public List<Balance> listAll(Balance balance);

	/**
	 * @param userId
	 * @return 根据Id查询
	 */
	public Balance findById(String Id);

	public Balance ById(String id);

	public void save(Balance balance);

}
