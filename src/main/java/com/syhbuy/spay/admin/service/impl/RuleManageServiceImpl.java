package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.RuleManageMapper;
import com.syhbuy.spay.admin.entity.Rule;
import com.syhbuy.spay.admin.entity.RuleManage;
import com.syhbuy.spay.admin.entityVo.RuleVo;
import com.syhbuy.spay.admin.service.RuleManageService;
@Service
public class RuleManageServiceImpl implements RuleManageService{
	@Autowired
	RuleManageMapper ruleManageMapper;

	@Override
	public void addManageRule(RuleManage ruleManage) {
		ruleManageMapper.addManageRule(ruleManage);
		
	}
	@Override
	public RuleManage findById(int id) {
		RuleManage ruleManage = ruleManageMapper.findById(id); 
		return null;
	}
	@Override
	public List<RuleVo> findAllRuleManage(RuleVo ruleManage) {
		// TODO Auto-generated method stub
		return ruleManageMapper.findAllRuleManage(ruleManage);
	}
	
	/**
	 * 添加规则 返回新增ID
	 */
	@Override
	public void save(Rule rule) {
		// TODO Auto-generated method stub
		ruleManageMapper.save(rule);
	}
	@Override
	public void saveRule(List<Rule> ruleList) {
		// TODO Auto-generated method stub
		ruleManageMapper.saveRule(ruleList);
	}
}
