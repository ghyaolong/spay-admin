package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.ParameterMapper;
import com.syhbuy.spay.admin.entity.Parameter;
import com.syhbuy.spay.admin.service.ParameterService;
@Service
public class ParameterServiceImpl implements ParameterService{

	@Autowired
	private ParameterMapper parameterMapper;
	
	public List<Parameter> findAll(Parameter parameter) {
		
		return parameterMapper.findAll(parameter);
	}

	/**
	 * 删除数据字典
	 * @return
	 */
	public void deleteParameter(String id) {

		parameterMapper.deleteParameter(id);
		
	}

	/**
	 * 添加数据字典
	 * @return
	 */
	public void save(Parameter parameter) {

		parameterMapper.save(parameter);
	}

	/**
	 * 跳转数据字典
	 * @return
	 */
	public Parameter findById(String id) {
		
		return parameterMapper.findById(id);
	}

	/**
	 * 修改数据字典
	 * @return
	 */
	public void update(Parameter parameter) {

		parameterMapper.update(parameter);
	}

	@Override
	public void ruleAdd(Parameter parameter) {
		// TODO Auto-generated method stub
		parameterMapper.ruleAdd(parameter);
	}

}
