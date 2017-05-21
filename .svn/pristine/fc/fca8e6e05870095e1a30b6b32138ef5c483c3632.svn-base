package com.syhbuy.spay.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syhbuy.spay.admin.entity.LoginInfo;
import com.syhbuy.spay.admin.entity.MemberRecord;
import com.syhbuy.spay.admin.entity.User;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.PayAuditVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;

public interface MemberRecordMapper {

	@Delete({ "delete from T_PAY_MEMBER_RECORD",
			"where ID = #{id,jdbcType=VARCHAR}" })
	public int deleteByPrimaryKey(String id);

	@Insert({
			"insert into T_PAY_MEMBER_RECORD (ID, USER_ID, ",
			"PAY_MONEY, PAY_STATE, ",
			"TOPUP_TYPE, TOPUP_WAY, ",
			"ACCOUNT_NUMBER_NAME, ACCOUNT_NUMBER, ",
			"CURRENCY, TRANSER_BANK, ",
			"REMARK, TRANSER_SINGLE, ",
			"STSTE, STATE_EXPLAIN, ",
			"AUDITOR, AUDIT_TIME)",
			"values (#{id,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
			"#{payMoney,jdbcType=DECIMAL}, #{payState,jdbcType=TIMESTAMP}, ",
			"#{topupType,jdbcType=VARCHAR}, #{topupWay,jdbcType=VARCHAR}, ",
			"#{accountNumberName,jdbcType=VARCHAR}, #{accountNumber,jdbcType=VARCHAR}, ",
			"#{currency,jdbcType=VARCHAR}, #{transerBank,jdbcType=VARCHAR}, ",
			"#{remark,jdbcType=VARCHAR}, #{transerSingle,jdbcType=VARCHAR}, ",
			"#{stste,jdbcType=VARCHAR}, #{stateExplain,jdbcType=VARCHAR}, ",
			"#{auditor,jdbcType=VARCHAR}, #{auditTime,jdbcType=TIMESTAMP})" })
	public int insert(MemberRecord record);

	public int insertSelective(MemberRecord record);

	@Select({
			"select",
			"ID, USER_ID, PAY_MONEY, PAY_STATE, TOPUP_TYPE, TOPUP_WAY, ACCOUNT_NUMBER_NAME, ",
			"ACCOUNT_NUMBER, CURRENCY, TRANSER_BANK, REMARK, TRANSER_SINGLE, STSTE, STATE_EXPLAIN, ",
			"AUDITOR, AUDIT_TIME", "from T_PAY_MEMBER_RECORD",
			"where ID = #{id,jdbcType=VARCHAR}" })
	@ResultMap("BaseResultMap")
	public MemberRecord selectByPrimaryKey(String id);

	/**
	 * 获取会员充值列表页Dao层
	 * 
	 * @param 对象
	 * @return
	 */
	public List<PayAuditVo> queryAllMemberRecord(PayAuditVo payAuditVo);

	public int updateByPrimaryKeySelective(MemberRecord record);

	@Update({ "update T_PAY_MEMBER_RECORD",
			"set USER_ID = #{userId,jdbcType=VARCHAR},",
			"PAY_MONEY = #{payMoney,jdbcType=DECIMAL},",
			"PAY_STATE = #{payState,jdbcType=TIMESTAMP},",
			"TOPUP_TYPE = #{topupType,jdbcType=VARCHAR},",
			"TOPUP_WAY = #{topupWay,jdbcType=VARCHAR},",
			"ACCOUNT_NUMBER_NAME = #{accountNumberName,jdbcType=VARCHAR},",
			"ACCOUNT_NUMBER = #{accountNumber,jdbcType=VARCHAR},",
			"CURRENCY = #{currency,jdbcType=VARCHAR},",
			"TRANSER_BANK = #{transerBank,jdbcType=VARCHAR},",
			"REMARK = #{remark,jdbcType=VARCHAR},",
			"TRANSER_SINGLE = #{transerSingle,jdbcType=VARCHAR},",
			"STSTE = #{stste,jdbcType=VARCHAR},",
			"STATE_EXPLAIN = #{stateExplain,jdbcType=VARCHAR},",
			"AUDITOR = #{auditor,jdbcType=VARCHAR},",
			"AUDIT_TIME = #{auditTime,jdbcType=TIMESTAMP}",
			"where ID = #{id,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(MemberRecord record);

	/**
	 * 会员充值Dao层
	 * 
	 * @param memberRecord
	 * @return
	 */
	public int save(MemberRecordVo memberRecord);

	/**
	 * 查询memberRecordVo对象ID
	 * @param memberRecordVo
	 * @return
	 */
	public User ById(MemberRecordVo memberRecordVo);

	/**
	 * 充值审核Dao
	 * @param topuPauditVo
	 * @return
	 */
	public List<TopuPauditVo> queryAllRecord(TopuPauditVo topuPauditVo);

	public TopuPauditVo topuPauditById(String id);

	/**
	 * 审核提交Dao层
	 * @param topuPauditVo
	 */
	public void topuPauditUpdate(TopuPauditVo topuPauditVo);

	/**
	 * 会员详情页面Dao层
	 * @param id
	 * @return
	 */
	public TopuPauditVo detailsById(String id);

	/**
	 * 修改会员信息Dao层
	 * @param topuPauditVo
	 */
	public void detailsUpdate(TopuPauditVo topuPauditVo);
	
	/**
	 * 导出Excel
	 * @param payAuditVo
	 * @return
	 */
	public List<PayAuditVo> getAllMember(PayAuditVo payAuditVo);
	
	public List<MemberRecordVo> getUserIdByPhone(MemberRecordVo memberRecordVo);

}