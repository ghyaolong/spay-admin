package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entity.LoginInfo;
import com.syhbuy.spay.admin.entity.User;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.PayAuditVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;

public interface MemberRecordService {

	public List<PayAuditVo> queryAllMemberRecord(PayAuditVo payAuditVo);

	public int save(MemberRecordVo memberRecord);

	public List<TopuPauditVo> queryAllRecord(TopuPauditVo topuPauditVo);

	public TopuPauditVo topuPauditById(String id);

	public void topuPauditUpdate(TopuPauditVo topuPauditVo);

	public TopuPauditVo detailsById(String id);

	public void detailsUpdate(TopuPauditVo topuPauditVo);

	public List<PayAuditVo> getAllMember(PayAuditVo payAuditVo);
	
	public List<MemberRecordVo> getUserIdByPhone(MemberRecordVo memberRecordVo);
}
