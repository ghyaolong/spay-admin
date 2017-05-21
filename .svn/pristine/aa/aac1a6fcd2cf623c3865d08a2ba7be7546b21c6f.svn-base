package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.DispenseReturnRecordMapper;
import com.syhbuy.spay.admin.entity.DispenseReturnRecord;
import com.syhbuy.spay.admin.entityVo.DispenseReturnRecordVO;
import com.syhbuy.spay.admin.service.DispenseReturnRecordService;

@Service
public class DispenseReturnRecordServiceImpl implements DispenseReturnRecordService {

	@Autowired
	private DispenseReturnRecordMapper mapper;

	public List<DispenseReturnRecord> getAllRecord(DispenseReturnRecordVO record) {
		// TODO Auto-generated method stub
		return mapper.getAllRecord(record);
	}

	public DispenseReturnRecord findById(DispenseReturnRecordVO record) {
		// TODO Auto-generated method stub
		return mapper.findById(record);
	}

}
