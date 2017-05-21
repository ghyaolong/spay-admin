package com.syhbuy.spay.admin.entity;

//会员收货地址信息表
public class Address {
    private String id;//ID

    private String consignee;//收货人

    private String contactTel;//联系手机

    private String contactMachine;//联系座机

    private String province;//省

    private String city;//市

    private String area;//区/县

    private String street;//街道

    private String detailAddress;//详细地址

    private String userId;//关联user
    
    private Long createTime;
    
    private String scopeAddress;
    
    private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getContactMachine() {
		return contactMachine;
	}

	public void setContactMachine(String contactMachine) {
		this.contactMachine = contactMachine;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getScopeAddress() {
		return scopeAddress;
	}

	public void setScopeAddress(String scopeAddress) {
		this.scopeAddress = scopeAddress;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String id, String consignee, String contactTel,
			String contactMachine, String province, String city, String area,
			String street, String detailAddress, String userId,
			Long createTime, String scopeAddress) {
		super();
		this.id = id;
		this.consignee = consignee;
		this.contactTel = contactTel;
		this.contactMachine = contactMachine;
		this.province = province;
		this.city = city;
		this.area = area;
		this.street = street;
		this.detailAddress = detailAddress;
		this.userId = userId;
		this.createTime = createTime;
		this.scopeAddress = scopeAddress;
	}

    
}