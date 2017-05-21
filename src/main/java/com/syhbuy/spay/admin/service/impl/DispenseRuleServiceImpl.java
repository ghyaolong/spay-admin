package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.DispenseRuleMapper;
import com.syhbuy.spay.admin.entity.DispenseRule;
import com.syhbuy.spay.admin.service.DispenseRuleService;

@Service
public class DispenseRuleServiceImpl implements DispenseRuleService {

	@Autowired
	DispenseRuleMapper dispenseRuleMapper;

	@Override
	public List<DispenseRule> getAllDispenseRule(DispenseRule dispenseRule) {
		return dispenseRuleMapper.getAllDispenseRule();
	}

	@Override
	public void deleteDispenseRule(DispenseRule dispenseRule) {
		dispenseRuleMapper.deleteDispenseRule(dispenseRule);

	}

}
