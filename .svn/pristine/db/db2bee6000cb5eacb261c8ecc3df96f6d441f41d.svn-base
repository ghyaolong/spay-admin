package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.PayDispenseBuyRecordMapper;
import com.syhbuy.spay.admin.entityVo.PayDispenseBuyRecordVO;
import com.syhbuy.spay.admin.service.PayDispenseBuyRecordService;

@Service
public class PayDispenseBuyRecordImp implements PayDispenseBuyRecordService {
	@Autowired
	PayDispenseBuyRecordMapper mapper;

	@Override
	public List<PayDispenseBuyRecordVO> getAllDispenseBuyRecord(
			PayDispenseBuyRecordVO record) {
		// TODO Auto-generated method stub
		return mapper.getAllDispenseBuyRecord(record);
	}

	@Override
	public PayDispenseBuyRecordVO getDispenseBuyRecordById(
			PayDispenseBuyRecordVO record) {
		// TODO Auto-generated method stub
		return mapper.getDispenseBuyRecordById(record);
	}

}
