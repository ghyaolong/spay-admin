package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.BalanceRecord;

public interface BalanceRecordMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(BalanceRecord record);

    BalanceRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BalanceRecord record);

    int updateByPrimaryKey(BalanceRecord record);
    
    
    /**
     * 会员余额账户流水
     * @param balanceRecord
     * @return
     */
    public int save(BalanceRecord memberRecordVo);
	/**
	 * 获取用户余额交易流水记录
	 * @param balanceRecord
	 * @return
	 */
	public List<BalanceRecord> findAllBalanceRecord(BalanceRecord balanceRecord);

	public List<BalanceRecord> getAllDispenseRule();
    
	
	


	
}