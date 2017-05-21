package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.Parameter;

public interface ParameterMapper {
    
	public List<Parameter> findAll(Parameter parameter);

	public void deleteParameter(String id);

	public void save(Parameter parameter);
	
	public Parameter findById(String id);

	public void update(Parameter parameter);

	public void ruleAdd(Parameter parameter);
}