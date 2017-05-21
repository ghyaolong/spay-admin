package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.BalanceRecordMapper;
import com.syhbuy.spay.admin.entity.BalanceRecord;
import com.syhbuy.spay.admin.service.BalanceRecordService;

/**
 * 
 * 会员余额账户流水
 * BalanceRecord对象
 * <p>
 * Copyright: Copyright (c) 2016年9月22日 下午3:24:32
 * <p>
 * Company: 
 * <p>
 * @author caohu
 * @version 1.0.0
 */
@Service
public class BalanceRecordServiceImpl implements BalanceRecordService {

	@Autowired
	private BalanceRecordMapper balanceRecordMapper;

	public int save(BalanceRecord memberRecordVo) {
		
		return balanceRecordMapper.save(memberRecordVo);
	}


	/**
	 *查询用户余额流水
	 */
	public List<BalanceRecord> findAllBalanceRecord(BalanceRecord balanceRecord) {
		return balanceRecordMapper.findAllBalanceRecord(balanceRecord);
	}


	


}
