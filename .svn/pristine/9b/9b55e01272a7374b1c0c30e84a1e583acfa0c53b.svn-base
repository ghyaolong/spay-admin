package com.syhbuy.spay.admin.service;

import com.syhbuy.spay.admin.entity.AdminUser;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by Administrator on 2016/9/10.
 */
public interface AdminUserService {
    /**
     *
     * @param adminUser
     * @return
     */
    public List<AdminUser> findPage(AdminUser adminUser);

    /**
     *
     * @param record
     * @return
     */
    public int save(AdminUser record,String[] roles);

    public int update(AdminUser adminUser,String[] roles);

    public List<AdminUser> validAccount(String accountName);

    public void initAdd(Model model);

    public void initUpdate(Model model,String userId);



}
