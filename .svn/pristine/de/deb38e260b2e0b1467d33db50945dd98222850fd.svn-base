package com.syhbuy.spay.admin.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.PasswordHelper;
import com.syhbuy.spay.admin.dao.RoleMapper;
import com.syhbuy.spay.admin.entity.Role;
import com.syhbuy.spay.admin.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.AdminUserMapper;
import com.syhbuy.spay.admin.entity.AdminUser;
import com.syhbuy.spay.admin.service.AdminUserService;
import org.springframework.ui.Model;

/**
 * Created by Administrator on 2016/9/10.
 */
@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	private AdminUserMapper adminUserMapper;

	@Autowired
	private RoleMapper roleMapper;

	public List<AdminUser> findPage(AdminUser adminUser) {
		return adminUserMapper.findPage(adminUser);
	}

	public int save(AdminUser adminUser,String[] roles) {

		adminUser.setPassword("123456");
		//后期进行时间修改
		adminUser.setCreateTime(DateUtils.getCurrTime());
		adminUser.setDeleteStatus("0");
		PasswordHelper.encryptPassword(adminUser);
		adminUserMapper.insertSelective(adminUser);
		if(roles.length>0){
			for(String roleid : roles){
				roleMapper.insertUserRole(adminUser.getId(),roleid);
			}
		}
		return 0;
	}

	public List<AdminUser> validAccount(String accountName) {
		AdminUser adminUser = new AdminUser();
		adminUser.setAccountName(accountName);
		return  adminUserMapper.findPage(adminUser);
	}

	public void initAdd(Model model) {
		List roles= roleMapper.findRoleAll();
		model.addAttribute("roles",roles);

	}

	public void initUpdate(Model model, String userId) {
		AdminUser adminUser = adminUserMapper.selectUserRoleByUserId(userId);
		List<Role> roles= roleMapper.findRoleAll();
		List<UserRole>  urs= new ArrayList<UserRole>();
		for(Role r : roles){
			UserRole ur =new UserRole();
			ur.setAdminUser(adminUser);
			ur.setRole(r);
			if(adminUser.getRoles().contains(r)){
				ur.setChecked(true);
			}else{
				ur.setChecked(false);
			}
			urs.add(ur);
		}
		model.addAttribute("adminUser",adminUser);
		model.addAttribute("urs",urs);
	}

	public int update(AdminUser adminUser,String[] roles) {

		PasswordHelper.encryptPassword(adminUser);

		//1、更新平台用户基本信息
		adminUserMapper.updateAdminUserByUserId(adminUser);

		//2、更新平台用户角色授权信息
		//2.1先删除不存在的用户角色授权
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId",adminUser.getId());
		params.put("roles",roles);
		adminUserMapper.deleteUserRole(params);

		//2.2检查提交过来的角色授权信息
		if(roles!=null && roles.length>0){
				for(String roleid : roles){
				if(adminUserMapper.checkUserRole(roleid,adminUser.getId()) ==0){
					roleMapper.insertUserRole(adminUser.getId(),roleid);
				}

			}
		}
		return 0;
	}
}
