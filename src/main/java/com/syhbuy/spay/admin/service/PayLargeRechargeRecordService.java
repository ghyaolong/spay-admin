package com.syhbuy.spay.admin.service;

import java.util.List;

import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;

public interface PayLargeRechargeRecordService {

	List<TopuPauditVo> queryAllRecord(TopuPauditVo topuPauditVo);

	TopuPauditVo topuPauditById(String id);

	void topuPauditUpdate(MemberRecordVo memberRecordVo);

}
