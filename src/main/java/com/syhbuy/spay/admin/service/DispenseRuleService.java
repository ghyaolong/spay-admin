package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.DispenseRule;

public interface DispenseRuleService {
	public List<DispenseRule> getAllDispenseRule(DispenseRule dispenseRule);

	void deleteDispenseRule(DispenseRule dispenseRule);

}
