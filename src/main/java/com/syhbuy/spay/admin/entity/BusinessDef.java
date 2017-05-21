package com.syhbuy.spay.admin.entity;

public class BusinessDef {
    private String id;

    private String bussinessId;

    private String businessDescribe;

    private String isDel;

    private Long delTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBussinessId() {
		return bussinessId;
	}

	public void setBussinessId(String bussinessId) {
		this.bussinessId = bussinessId;
	}

	public String getBusinessDescribe() {
		return businessDescribe;
	}

	public void setBusinessDescribe(String businessDescribe) {
		this.businessDescribe = businessDescribe;
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

	public BusinessDef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessDef(String id, String bussinessId, String businessDescribe,
			String isDel, Long delTime) {
		super();
		this.id = id;
		this.bussinessId = bussinessId;
		this.businessDescribe = businessDescribe;
		this.isDel = isDel;
		this.delTime = delTime;
	}

}