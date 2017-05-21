package com.syhbuy.spay.admin.entity;

/**
 * Created by Administrator on 2016/10/10.
 */
public class UserRole {
    private AdminUser adminUser;
    private Role role;
    private boolean checked;

    public AdminUser getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(AdminUser adminUser) {
        this.adminUser = adminUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
