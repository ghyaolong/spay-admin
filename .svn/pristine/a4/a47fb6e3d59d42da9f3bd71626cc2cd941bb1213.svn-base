package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.PayLargeRechargeRecordMapper;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;
import com.syhbuy.spay.admin.service.PayLargeRechargeRecordService;
@Service
public class PayLargeRechargeRecordServiceImpl implements PayLargeRechargeRecordService{

	@Autowired
	private PayLargeRechargeRecordMapper payLargeRechargeRecordMapper;
	
	public List<TopuPauditVo> queryAllRecord(TopuPauditVo topuPauditVo) {
		// TODO Auto-generated method stub
		return payLargeRechargeRecordMapper.queryAllRecord(topuPauditVo);
	}
	public TopuPauditVo topuPauditById(String id) {
		// TODO Auto-generated method stub
		return payLargeRechargeRecordMapper.topuPauditById(id);
	}
	public void topuPauditUpdate(MemberRecordVo memberRecordVo) {
		// TODO Auto-generated method stub
		payLargeRechargeRecordMapper.topuPauditUpdate(memberRecordVo);
	}

}
