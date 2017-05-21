package com.syhbuy.spay.admin.service.impl;

import com.syhbuy.spay.admin.base.util.Common;
import com.syhbuy.spay.admin.dao.ResourcesMapper;
import com.syhbuy.spay.admin.entity.AdminUser;
import com.syhbuy.spay.admin.entity.Resources;
import com.syhbuy.spay.admin.service.IndexService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by Administrator on 2016/8/20.
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

    @Autowired
    private ResourcesMapper resourcesMapper;

    public boolean initIndex(Model model) {
        Session session = SecurityUtils.getSubject().getSession();
        String userId =  (String)session.getAttribute("userSessionId");
        List<Resources> ress = resourcesMapper.findResByUserId(userId);
        AdminUser user = (AdminUser) session.getAttribute("userSession");
        model.addAttribute("ress", Common.nodeToTree(ress));
        model.addAttribute("user",user);
        return true;
    }

}
