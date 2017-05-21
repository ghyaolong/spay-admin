package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.SucceedOperationMapper;
import com.syhbuy.spay.admin.entity.SucceedOperation;
import com.syhbuy.spay.admin.service.SucceedOperationService;

@Service
public class SucceedOperationServiceImpl implements SucceedOperationService {

	@Autowired
	private SucceedOperationMapper succeedOperationMapper;

	@Override
	public List<SucceedOperation> findAll(SucceedOperation succeedOperation) {

		return succeedOperationMapper.findAll(succeedOperation);
	}

}
