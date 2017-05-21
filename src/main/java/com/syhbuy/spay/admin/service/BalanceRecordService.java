package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.BalanceRecord;

public interface BalanceRecordService {

	/**
	 * 会员余额账户流水
	 * @param balanceRecord
	 * @return
	 */
	public int save(BalanceRecord memberRecordVo);

	/**
	 * 获取用户余额交易流水 
	 * 
	 * @param balanceRecord
	 * @return
	 */
	public List<BalanceRecord> findAllBalanceRecord(BalanceRecord balanceRecord);
	
 
}
