package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.AuditSettlementMapper;
import com.syhbuy.spay.admin.entity.AuditSettlement;
import com.syhbuy.spay.admin.service.AuditSettlementService;

@Service
public class AuditSettlementServiceImpl implements AuditSettlementService {
	
	@Autowired
	private  AuditSettlementMapper auditSettlementMapper;

	@Override
	public List<AuditSettlement> findAll(AuditSettlement auditSettlement) {

		return auditSettlementMapper.findAll(auditSettlement);
	}

}
