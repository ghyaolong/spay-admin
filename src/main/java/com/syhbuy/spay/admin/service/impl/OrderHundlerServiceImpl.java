package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.OrderHundlerMapper;
import com.syhbuy.spay.admin.entity.OrderHundler;
import com.syhbuy.spay.admin.service.OrderHundlerService;

@Service
public class OrderHundlerServiceImpl implements OrderHundlerService {

	@Autowired
	private OrderHundlerMapper orderHundlerMapper;

	@Override
	public List<OrderHundler> FindAll(OrderHundler orderHundler) {

		return orderHundlerMapper.FindAll(orderHundler);
	}

}
