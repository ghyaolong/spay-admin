package com.syhbuy.spay.admin.entity;

import javax.persistence.Transient;

public class TerraceActive {
    private String id;

    private String title;//标题

    private String activeInstruction;//活动说明

    private Long beginTime;//开始时间

    private Long endTime;//结束时间

    private String status;//状态 0有效 1 无效
    
    //新增字段用于接受时间
    @Transient
    private String beTime;
    @Transient
    private String  enTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getActiveInstruction() {
        return activeInstruction;
    }

    public void setActiveInstruction(String activeInstruction) {
        this.activeInstruction = activeInstruction == null ? null : activeInstruction.trim();
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

	public Long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getBeTime() {
		return beTime;
	}

	public void setBeTime(String beTime) {
		this.beTime = beTime;
	}

	public String getEnTime() {
		return enTime;
	}

	public void setEnTime(String enTime) {
		this.enTime = enTime;
	}

	public TerraceActive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TerraceActive(String id, String title, String activeInstruction,
			Long beginTime, Long endTime, String status, String beTime,
			String enTime) {
		super();
		this.id = id;
		this.title = title;
		this.activeInstruction = activeInstruction;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.status = status;
		this.beTime = beTime;
		this.enTime = enTime;
	}

	

	
    
    
}