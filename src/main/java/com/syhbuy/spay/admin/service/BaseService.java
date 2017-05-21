package com.syhbuy.spay.admin.service;

import com.syhbuy.spay.admin.entity.Resources;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface BaseService {

    List<Resources> findBtnByMenu(String userId,String parentId);
}
