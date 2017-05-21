package com.syhbuy.spay.admin.service;

import com.syhbuy.spay.admin.base.util.TreeNode;
import com.syhbuy.spay.admin.entity.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/27.
 */
public interface RoleService {
    public List<Role> findPage(Role role);

    public List<TreeNode> getResourceTree(String parentId,String roleId);

    public void updateAuthorization(List<TreeNode> checkData);
    
    int insert(Role record);

}
