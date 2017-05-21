package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.RuleMapper;
import com.syhbuy.spay.admin.entity.Rule;
import com.syhbuy.spay.admin.service.RuleService;
@Service
public class RuleServiceImpl implements RuleService{

	@Autowired
	private RuleMapper ruleMapper;
	
	/**
	 * 规则列表实现层
	 * @param id
	 * @return
	 */
	public List<Rule> queryAll(Rule rule) {
		
		return ruleMapper.queryAll(rule);
	}

	/**
	 * 添加规则实现层
	 */
	public void save(Rule rule) {
		
		ruleMapper.save(rule);
	}

	/**
	 * 删除规则实现层
	 */
	public void deleteRule(String id) {

		ruleMapper.deleteRule(id);
		
	}

	/**
	 * 根据ID修改规则实现层
	 */
	public Rule FindAll(String id) {

		return ruleMapper.FindAll(id);
	}

	/**
	 * 修改规则实现层
	 */
	public void update(Rule rule) {
		
		 ruleMapper.update(rule);
	}

	@Override
	public void saveRule(List<Rule> ruleList) {
		// TODO Auto-generated method stub
		ruleMapper.saveRule(ruleList);
	}

}


