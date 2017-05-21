package com.syhbuy.spay.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syhbuy.spay.admin.entity.Rule;

@Repository
public interface RuleMapper {

	/**
	 * 规则列表Dao
	 * 
	 * @param id
	 * @return
	 */
	public List<Rule> queryAll(Rule rule);

	/**
	 * 添加规则Dao
	 * 
	 * @param rule
	 */
	public void save(Rule rule);

	/**
	 * 删除规则Dao
	 * 
	 * @param id
	 */
	public void deleteRule(String id);

	/**
	 * 根据ID修改规则Dao
	 * 
	 * @param id
	 * @return
	 */
	public Rule FindAll(String id);

	/**
	 * 修改规则
	 * 
	 * @param rule
	 * @return
	 */
	public void update(Rule rule);

	public void saveRule(List<Rule> ruleList);
}