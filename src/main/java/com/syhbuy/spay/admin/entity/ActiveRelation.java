package com.syhbuy.spay.admin.entity;

public class ActiveRelation {
	
    private String id;//主键

    private String activeId;//活动ID

    private String businessId;//业务号

    private String isDel;

    private Long delTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActiveId() {
		return activeId;
	}

	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public Long getDelTime() {
		return delTime;
	}

	public void setDelTime(Long delTime) {
		this.delTime = delTime;
	}

	public ActiveRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActiveRelation(String id, String activeId, String businessId,
			String isDel, Long delTime) {
		super();
		this.id = id;
		this.activeId = activeId;
		this.businessId = businessId;
		this.isDel = isDel;
		this.delTime = delTime;
	}

}