package com.syhbuy.spay.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syhbuy.spay.admin.entity.DispenseRule;

@Repository
public interface DispenseRuleMapper {
	List<DispenseRule> getAllDispenseRule();

	void deleteDispenseRule(DispenseRule dispenseRule);
}