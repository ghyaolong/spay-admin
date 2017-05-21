package com.syhbuy.spay.admin.service.impl;

import com.syhbuy.spay.admin.dao.ResourcesMapper;
import com.syhbuy.spay.admin.entity.Resources;
import com.syhbuy.spay.admin.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@Service("resourcesService")
public class ResourcesServiceImpl  implements ResourcesService{
    @Autowired
    private ResourcesMapper resourcesMapper;

    public List<Resources> findPage(Resources resources) {
        return resourcesMapper.findPage(resources);
    }

    public List<Resources> validKey(String key) {
        Resources r = new Resources();
        r.setResKey(key);
        return resourcesMapper.findPage(r);
    }

    public int save(Resources resources) {
        return resourcesMapper.insertSelective(resources);
    }
}
