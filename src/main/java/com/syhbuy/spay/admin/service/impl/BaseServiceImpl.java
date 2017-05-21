package com.syhbuy.spay.admin.service.impl;

import com.syhbuy.spay.admin.dao.ResourcesMapper;
import com.syhbuy.spay.admin.entity.Resources;
import com.syhbuy.spay.admin.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */

@Service("baseService")
public class BaseServiceImpl implements BaseService {

    @Autowired
    private ResourcesMapper resourcesMapper;

    public List<Resources> findBtnByMenu(String userId,String parentId) {
        return resourcesMapper.findBtnByMenu(userId,parentId);
    }
}
