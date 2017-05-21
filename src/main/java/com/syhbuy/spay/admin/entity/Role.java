package com.syhbuy.spay.admin.entity;

import java.util.List;

public class Role {
    private String id;

    private String state;

    private String name;

    private String roleKey;

    private String description;

    private List<AdminUser> adminUsers;

    public Role(String id, String state, String name, String roleKey, String description) {
        this.id = id;
        this.state = state;
        this.name = name;
        this.roleKey = roleKey;
        this.description = description;
    }

    public List<AdminUser> getAdminUsers() {
		return adminUsers;
	}

	public void setAdminUsers(List<AdminUser> adminUsers) {
		this.adminUsers = adminUsers;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Role() {
    }

    public String getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Role){
            Role r = (Role)obj;
            if(r.getId().equals(this.getId())){
                return true;
            }
        }
        return false;
    }
}