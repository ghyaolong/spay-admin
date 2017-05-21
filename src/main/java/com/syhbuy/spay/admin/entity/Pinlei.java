package com.syhbuy.spay.admin.entity;

public class Pinlei {
	private String gc_id;
	private String gc_name;
	private String gc_parent_id;
	public String getGc_id() {
		return gc_id;
	}
	public void setGc_id(String gc_id) {
		this.gc_id = gc_id;
	}
	public String getGc_name() {
		return gc_name;
	}
	@Override
	public String toString() {
		return "Pinlei [gc_id=" + gc_id + ", gc_name=" + gc_name
				+ ", gc_parent_id=" + gc_parent_id + "]";
	}
	public void setGc_name(String gc_name) {
		this.gc_name = gc_name;
	}
	public String getGc_parent_id() {
		return gc_parent_id;
	}
	public void setGc_parent_id(String gc_parent_id) {
		this.gc_parent_id = gc_parent_id;
	}
	

}
