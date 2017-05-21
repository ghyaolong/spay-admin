package com.syhbuy.spay.admin.dao;

import java.util.List;
/**
 * 规则管理
 * 
 */


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.syhbuy.spay.admin.entity.Rule;
import com.syhbuy.spay.admin.entity.RuleManage;
import com.syhbuy.spay.admin.entityVo.RuleVo;
@Repository
public interface RuleManageMapper {
	
	public void addManageRule(RuleManage ruleManage);
   
    /**
     * 根据ID查询规则
     * @param id
     * @return
     */
    public RuleManage findById(int id);
    
    public List findAllRuleManage(RuleVo ruleManage);

    /**
     * 创建规则Dao层
     * @param ruleList
     * @return 
     */
	public void save(Rule rule);

	public void saveRule(List<Rule> ruleList);
	
	
}