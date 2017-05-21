package com.syhbuy.spay.admin.entity;
/**
 * 代金券规则实体类
 * 
 * @author Administrator
 *
 */
public class DispenseRule {
	private String id;
	private String userId;
	private String dispenseId;
	private float full;
	private float give;
	private String createTime;
	private String ebableStatus;
	private String delStatus;
	private String isDel;
	private Long delTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	
	public String getDispenseId() {
		return dispenseId;
	}
	public void setDispenseId(String dispenseId) {
		this.dispenseId = dispenseId;
	}
	public float getFull() {
		return full;
	}
	public void setFull(float full) {
		this.full = full;
	}
	public float getGive() {
		return give;
	}
	public void setGive(float give) {
		this.give = give;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public String getEbableStatus() {
		return ebableStatus;
	}
	public void setEbableStatus(String ebableStatus) {
		this.ebableStatus = ebableStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(String delStatus) {
		this.delStatus = delStatus;
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
	

}
