package com.syhbuy.spay.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syhbuy.spay.admin.dao.MemberRecordMapper;
import com.syhbuy.spay.admin.entity.LoginInfo;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.PayAuditVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;
import com.syhbuy.spay.admin.service.MemberRecordService;

/**
 * 会员充值列表页实现层
 * 
 * <p>
 * Copyright: Copyright (c) 2016年9月12日 下午2:34:48
 * <p>
 * Company:
 * <p>
 * 
 * @author 曹虎
 * @version 1.0.0
 */
@Service
public class MemberRecordServiceImpi implements MemberRecordService {

	@Autowired
	private MemberRecordMapper memberRecordMapper;

	/**
	 * 列表查询实现层
	 */
	public List<PayAuditVo> queryAllMemberRecord(PayAuditVo payAuditVo) {
		return memberRecordMapper.queryAllMemberRecord(payAuditVo);

	}

	/**
	 * 会员充值实现层
	 */
	public int save(MemberRecordVo memberRecordVo) {
		/*MemberRecordVo mv = new MemberRecordVo();
		mv.setPayAccount(new BigDecimal(memberRecordVo.getPayAccount().toString()));*/
		return memberRecordMapper.save(memberRecordVo);

	}

	/**
	 * 充值审核实现层
	 */
	public List<TopuPauditVo> queryAllRecord(TopuPauditVo topuPauditVo) {
		
		return memberRecordMapper.queryAllRecord(topuPauditVo);
	}

	public TopuPauditVo topuPauditById(String id) {
		
		return memberRecordMapper.topuPauditById(id);
	}

	/**
	 * 审核提交实现层
	 */
	public void topuPauditUpdate(TopuPauditVo topuPauditVo){
		
		memberRecordMapper.topuPauditUpdate(topuPauditVo);
	}

	/**
	 * 会员详情页面实现层
	 */
	public TopuPauditVo detailsById(String id) {
		
		return memberRecordMapper.detailsById(id);
	}

	/**
	 * 修改会员信息实现层
	 */
	public void detailsUpdate(TopuPauditVo topuPauditVo) {
		
		memberRecordMapper.detailsUpdate(topuPauditVo);
	}

	/**
	 * 导出Excel
	 */
	public List<PayAuditVo> getAllMember(PayAuditVo payAuditVo) {
		
		return memberRecordMapper.getAllMember(payAuditVo);
	}

	@Override
	public List<MemberRecordVo> getUserIdByPhone(MemberRecordVo memberRecordVo) {
		// TODO Auto-generated method stub
		return memberRecordMapper.getUserIdByPhone(memberRecordVo);
	}
}
