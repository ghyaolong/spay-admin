package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entityVo.PayDispenseBuyRecordVO;

public interface PayDispenseBuyRecordService {
	List<PayDispenseBuyRecordVO> getAllDispenseBuyRecord(
			PayDispenseBuyRecordVO record);

	PayDispenseBuyRecordVO getDispenseBuyRecordById(
			PayDispenseBuyRecordVO record);

}
