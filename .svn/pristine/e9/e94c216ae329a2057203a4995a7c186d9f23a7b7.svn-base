package com.syhbuy.spay.admin.entity;



import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Transient;

/**
 * @author 调账申请实体类
 *
 */
public class PayApply {
    private String id;

    private String userId;             //会员ID

    private String beforebalance;     //调账前金额

    private String state;             // 状态           1：审核中  2：审核通过 3：驳回

    private String balanceamount;     //调账金额

    private Long balancedate;          //调账时间
    
    private String applyname; //申请人
    
    private Long applydate; //申请时间

    private BigDecimal  accountBalance;//账户余额

	private String assessor;  //审核人

    private Date assessordate; //审核时间

    private String advice; //意见
    
    //新加字段    判断调账类型
    private String applytype;    //充值类型   0:增加金额     1：减少金额
    
	
    //用于显示页面时间
    @Transient
    private String searchStartTime;
    private String searchEndTime;
	private Long startTime;
	private Long endTime;
    
    public String getSearchEndTime() {
		return searchEndTime;
	}

	public void setSearchEndTime(String searchEndTime) {
		this.searchEndTime = searchEndTime;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getSearchStartTime() {
		return searchStartTime;
	}

	public void setSearchStartTime(String searchStartTime) {
		this.searchStartTime = searchStartTime;
	}

	public void setBalancedate(Long balancedate) {
		this.balancedate = balancedate;
	}

	public String getApplytype() {
		return applytype;
	}

	public void setApplytype(String applytype) {
		this.applytype = applytype;
	}
	public Long getApplydate() {
		return applydate;
	}
	
	public void setApplydate(Long applydate) {
		this.applydate = applydate;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    
    

    public String getUserid() {
        return userId;
    }

    public void setUserid(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBeforebalance() {
        return beforebalance;
    }

    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setBeforebalance(String beforebalance) {
        this.beforebalance = beforebalance == null ? null : beforebalance.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBalanceamount() {
        return balanceamount;
   }

   public void setBalanceamount(String balanceamount) {
       this.balanceamount = balanceamount == null ? null : balanceamount.trim();
   }

    public Long getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(long l) {
        this.balancedate = l;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }

    public String getAssessor() {
        return assessor;
    }

    public void setAssessor(String assessor) {
        this.assessor = assessor == null ? null : assessor.trim();
    }

    public Date getAssessordate() {
        return assessordate;
    }

    public void setAssessordate(Date assessordate) {
        this.assessordate = assessordate;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }
}