package com.syhbuy.spay.admin.dao;

import java.util.List;

import com.syhbuy.spay.admin.entity.OrderHundler;

public interface OrderHundlerMapper {

	List<OrderHundler> FindAll(OrderHundler orderHundler);

}
