package com.syhbuy.spay.admin.controller;

import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jxl.common.Logger;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.IDGeneratorUtils;
import com.syhbuy.spay.admin.entity.Balance;
import com.syhbuy.spay.admin.entity.BalanceRecord;
import com.syhbuy.spay.admin.entityVo.MemberRecordVo;
import com.syhbuy.spay.admin.entityVo.PayAuditVo;
import com.syhbuy.spay.admin.entityVo.TopuPauditVo;
import com.syhbuy.spay.admin.service.BalanceRecordService;
import com.syhbuy.spay.admin.service.BalanceService;
import com.syhbuy.spay.admin.service.LoginInfoMapperService;
import com.syhbuy.spay.admin.service.MemberRecordService;

/**
 * 充值管理 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年9月21日 下午1:29:33
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@EnableTransactionManagement
@RequestMapping(value = "/memberRecord/")
@Controller
public class MemberRecordController extends BaseController {

	private final Logger log = Logger.getLogger(MemberRecordController.class);

	@Autowired
	private MemberRecordService memberRecordService;

	@Autowired
	private BalanceService balanceService;

	@Autowired
	private BalanceRecordService balanceRecordService;

	@Autowired
	private LoginInfoMapperService loginInfoService;

	/**
	 * 会员基本信息
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/memberRecord/list";
	}

	/**
	 * @param PayAuditVo对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<PayAuditVo> page(PayAuditVo payAuditVo, int pageNum, int pageSize) {

		if (payAuditVo != null && payAuditVo.getSearchStartTime() != null && payAuditVo.getSearchEndTime() != null && !"".equals(payAuditVo.getSearchStartTime()) && !"".equals(payAuditVo.getSearchEndTime())) {
			payAuditVo.setStartTime(DateUtils.convertDataToLong(payAuditVo.getSearchStartTime()));
			payAuditVo.setEndTime(DateUtils.convertDataToLong(payAuditVo.getSearchEndTime()));
		}

		PageHelper.startPage(pageNum, pageSize);

		List<PayAuditVo> payAuditVoList = memberRecordService.queryAllMemberRecord(payAuditVo);
		for (PayAuditVo payAuditVo2 : payAuditVoList) {
			if (payAuditVo2.getRechargeDate() != null) {
				String timeString = DateUtils.getDateTime(payAuditVo2.getRechargeDate());
				payAuditVo2.setResgTimeString(timeString);
			}
			payAuditVo2.setPhone(payAuditVo2.getPhone() == null ? "" : payAuditVo2.getPhone());
			payAuditVo2.setRealName(payAuditVo2.getRealName() == null ? "" : payAuditVo2.getRealName());
		}
		// 用PageInfo对结果进行包装
		PageInfo<PayAuditVo> page = new PageInfo<PayAuditVo>(payAuditVoList);

		return page;
	}

	/**
	 * 会员充值跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add() {

		return "/memberRecord/add";

	}

	/**
	 * 跳转会员修改页面
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("details")
	public String detailsById(String id, Model mode) {
		// 根据Id查询
		TopuPauditVo topuPauditVo = memberRecordService.detailsById(id);

		mode.addAttribute("topuPauditVo", topuPauditVo);

		return "/memberRecord/payAuditVoxg";
	}

	/**
	 * 修改会员信息
	 * 
	 * @param topuPauditVo
	 * @return
	 */
	@RequestMapping("detailsUpdate")
	@ResponseBody
	public String detailsUpdate(TopuPauditVo topuPauditVo) {
		// 根据Id查询
		memberRecordService.detailsUpdate(topuPauditVo);

		return "success";
	}

	/**
	 * 后台会员充值控制层
	 * 
	 * @param memberRecordVo
	 * @return
	 */
	@Transactional
	@RequestMapping("save")
	@ResponseBody
	public String save(MemberRecordVo memberRecordVo) {
		memberRecordVo.setRechargeDate(DateUtils.getCurrTime());
		memberRecordVo.setTranId(IDGeneratorUtils.getOrderID());
		memberRecordVo.setId(IDGeneratorUtils.getUUID32());

		/*
		 * String phone = memberRecordVo.getPhone(); LoginInfo loginInfo = new
		 * LoginInfo(); loginInfo.setId(IDGeneratorUtils.getUUID32());
		 * loginInfo.setPhone(phone); loginInfo.setLoginType("phone");
		 * loginInfoService.save(loginInfo);
		 */
		try {

			BigDecimal yue = null;
			List<MemberRecordVo> list = memberRecordService.getUserIdByPhone(memberRecordVo);
			String userId = list.get(0).getUserId();

			// 查询userID
			memberRecordVo.setUserId(userId);
			// 充值金额
			memberRecordVo.setPayAccount(memberRecordVo.getPayAccount());
			memberRecordVo.setState("1");

			// 添加一条会员充值记录
			memberRecordService.save(memberRecordVo);
			// 添加一条会员余额账户流水
			BalanceRecord balanceRecord = new BalanceRecord();
			Balance balance = balanceService.findByUserId(userId);
			if (balance == null) {
				Balance newBalance = new Balance();
				newBalance.setId(IDGeneratorUtils.getUUID32());
				newBalance.setUserId(userId);
				newBalance.setAccountBalance(new BigDecimal(0));
				balanceService.save(newBalance);
				yue = new BigDecimal(0);// 当前账户余额
			} else {
				yue = balance.getAccountBalance();// 当前账户余额
			}
			balanceRecord.setTranId(IDGeneratorUtils.getOrderID());
			balanceRecord.setTransactionState("1");
			balanceRecord.setCondition("0");
			balanceRecord.setBeforeChangBlance(yue);
			balanceRecord.setCreateDate(DateUtils.getCurrTime());
			balanceRecord.setUpdateDate(DateUtils.getCurrTime());
			// 修改会员余额账户数据
			balanceService.update(memberRecordVo);

			// 交易金额
			balanceRecord.setAmount(memberRecordVo.getPayAccount());
			balanceRecord.setUserId(userId);

			// 充值前余额
			BigDecimal s = yue;
			// 充值后余额
			BigDecimal t = memberRecordVo.getPayAccount().add(s);
			balanceRecord.setAfterChangeBlance(t);
			balanceRecordService.save(balanceRecord);

			return "success";
		}
		catch (Exception e) {

			return "erroy";
		}
	}

	/**
	 * 导出Excel表格
	 * 
	 * @param payAuditVo
	 * @param request
	 * @return
	 */
	@SuppressWarnings("deprecation")
	@RequestMapping("chargeExcel")
	public String outExcel(PayAuditVo payAuditVo, HttpServletRequest request) {

		// 第一步，创建一个webbook，对应一个Excel文件
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("充值信息");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow(0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("手机号码");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("充值金额");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("充值时间");
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("充值类型");
		cell.setCellStyle(style);
		cell = row.createCell((short) 4);
		cell.setCellValue("充值方式");
		cell.setCellStyle(style);
		cell = row.createCell((short) 5);
		cell.setCellValue("充值状态");
		cell.setCellStyle(style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		List<PayAuditVo> pageList = memberRecordService.getAllMember(payAuditVo);

		for (int i = 0; i < pageList.size(); i++) {
			row = sheet.createRow(i + 1);
			PayAuditVo record = pageList.get(i);
			// 第六步，创建单元格，并设置值
			row.createCell((short) 0).setCellValue(record.getPhone());
			row.createCell((short) 1).setCellValue(record.getPayAccount().doubleValue());
			row.createCell((short) 2).setCellValue(DateUtils.getDateTime(record.getRechargeDate()));
			row.createCell((short) 3).setCellValue(record.getRechargeType());
			row.createCell((short) 4).setCellValue(record.getRechargeWay());
			row.createCell((short) 5).setCellValue(record.getState());
			cell = row.createCell((short) 6);

			try {
				FileOutputStream fout = new FileOutputStream("D:\\Excel.xls");
				wb.write(fout);
				fout.close();
			}
			catch (Exception e) {

				log.error("充值管理导出Excel异常", e);
			}
		}
		return "success";
	}

	/**
	 * 充值电话号码验证
	 * 
	 * @param memberRecordVo
	 * @return
	 */
	@ResponseBody
	@RequestMapping("checnPhone")
	public Map<String, Object> checnPhone(MemberRecordVo memberRecordVo) {
		Map<String, Object> map = new HashMap<String, Object>();
		String realName = memberRecordService.getUserIdByPhone(memberRecordVo).get(0).getRealName();
		map.put("realName", realName);
		return map;

	}
}
