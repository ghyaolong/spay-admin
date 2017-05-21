package com.syhbuy.spay.admin.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.base.util.TreeNode;
import com.syhbuy.spay.admin.dao.ResourcesMapper;
import com.syhbuy.spay.admin.dao.RoleMapper;
import com.syhbuy.spay.admin.entity.Role;
import com.syhbuy.spay.admin.service.RoleService;

/**
 * Created by Administrator on 2016/9/27.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private ResourcesMapper resourcesMapper;

	@Override
	public List<Role> findPage(Role role) {
		return roleMapper.findPage(role);
	}

	@Override
	public List<TreeNode> getResourceTree(String parentId, String roleId) {
		List<TreeNode> ns = resourcesMapper.findResTreeByRoleId(roleId, parentId);
		for (TreeNode n : ns) {
			List<TreeNode> cns = this.getResourceTree(n.getNodeId(), roleId);
			n.setNodes(cns);
		}
		return ns;
	}

	@Override
	public void updateAuthorization(List checkData) {
		// 删除无关授权的条件组装
		Map<String, Object> pars = new HashMap<String, Object>();

		// 收集选中选中的资源节点的id
		List<String> checkRess = new ArrayList<String>();

		// 对选中资源节点进行判断，已入库则不处理，未入库则进行入库处理。
		for (Object o : checkData) {
			// 1、检查tn节点是否存在
			// 1.1、如果不存在
			Map tn = (Map) o;
			String roleId = (String) tn.get("roleId");
			pars.put("roleId", roleId);
			String resID = (String) tn.get("resId");
			checkRess.add(resID);
			Map state = (Map) tn.get("state");
			if ((Boolean) state.get("checked")) {
				if (resourcesMapper.checkAuthorization(roleId, resID) == 0) {
					// 插入此节点
					resourcesMapper.insertAuthorization(roleId, resID);
				}
			}
		}

		// 删除在库中的未选中节点
		pars.put("resIds", checkRess);
		resourcesMapper.deleteResRole(pars);
	}

	@Override
	public int insert(Role record) {
		// TODO Auto-generated method stub

		return roleMapper.insert(record);
	}

}
