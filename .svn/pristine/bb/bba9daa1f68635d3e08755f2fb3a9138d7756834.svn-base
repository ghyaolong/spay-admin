package com.syhbuy.spay.admin.controller;

import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.entity.ReturnTaskPool;
import com.syhbuy.spay.admin.service.ReturnTaskPoolService;

/**
 * 待返任务池 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年11月1日 下午7:08:42
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Controller
@RequestMapping("/ReturnTaskPool/")
public class ReturnTaskPoolController extends BaseController {

	private final Logger log = Logger.getLogger(ReturnTaskPoolController.class);

	@Autowired
	private ReturnTaskPoolService returnTaskPoolService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/ReturnTaskPool/list";
	}

	/**
	 * 待返任务列表页数据
	 * 
	 * @param returnTaskPool
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<ReturnTaskPool> page(ReturnTaskPool returnTaskPool, int pageNum, int pageSize) {
		if (returnTaskPool != null && returnTaskPool.getSearchStartTime() != null && returnTaskPool.getSearchEndTime() != null && returnTaskPool.getTime() != null && !"".equals(returnTaskPool.getSearchStartTime()) && !"".equals(returnTaskPool.getTime()) && !"".equals(returnTaskPool.getSearchEndTime())) {
			returnTaskPool.setStartTime(DateUtils.convertDataToLong(returnTaskPool.getSearchStartTime()));
			returnTaskPool.setEndTime(DateUtils.convertDataToLong(returnTaskPool.getSearchEndTime()));
			returnTaskPool.setTime(DateUtils.convertDataToLong(returnTaskPool.getSearchTime()));
		}
		PageHelper.startPage(pageNum, pageSize);

		List<ReturnTaskPool> returnTaskPoolList = returnTaskPoolService.findAll(returnTaskPool);
		for (ReturnTaskPool returnTaskPool2 : returnTaskPoolList) {
			if (returnTaskPool2.getGenerateTime() != null && !("null").equals(returnTaskPool2.getGenerateTime()) && !("").equals(returnTaskPool2.getGenerateTime())) {
				returnTaskPool2.setSearchStartTime(DateUtils.getDateTime(returnTaskPool2.getGenerateTime()));
			} else {
				returnTaskPool2.setSearchStartTime("");
			}
			if (returnTaskPool2.getEnableTime() != null && !("null").equals(returnTaskPool2.getEnableTime()) && !("").equals(returnTaskPool2.getEnableTime())) {
				returnTaskPool2.setSearchEndTime(DateUtils.getDateTime(returnTaskPool2.getEnableTime()));
			} else {
				returnTaskPool2.setSearchEndTime("");
			}
			if (returnTaskPool2.getDisableTime() != null && !("null").equals(returnTaskPool2.getDisableTime()) && !("").equals(returnTaskPool2.getDisableTime())) {
				returnTaskPool2.setSearchTime(DateUtils.getDateTime(returnTaskPool2.getDisableTime()));
			} else {
				returnTaskPool2.setSearchTime("");
			}
		}

		// 用PageInfo对结果进行包装
		PageInfo<ReturnTaskPool> page = new PageInfo<ReturnTaskPool>(returnTaskPoolList);

		return page;
	}

	/**
	 * 待返任务池添加跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add() {

		return "/ReturnTaskPool/add";

	}

	/**
	 * 添加待返任务
	 * 
	 * @param returnTaskPool
	 * @return
	 */
	@RequestMapping("saveReturnTaskPool")
	@ResponseBody
	public String saveReturnTaskPool(String title, String denomination, String taskType, String type, String directObjId, String directObjId2, String directObjId3) {
		// 创建对象
		ReturnTaskPool returnTaskPool = new ReturnTaskPool();
		returnTaskPool.setTitle(title);
		returnTaskPool.setDenomination(new BigDecimal(denomination));
		returnTaskPool.setTaskType(taskType);
		returnTaskPool.setType(type);
		returnTaskPool.setDirectObjId(directObjId);
		returnTaskPool.setDirectObjId2(directObjId2);
		returnTaskPool.setDirectObjId3(directObjId3);
		returnTaskPool.setFreezeAlive("0");

		// 系统当前时间
		returnTaskPool.setGenerateTime(DateUtils.getCurrTime());

		returnTaskPoolService.save(returnTaskPool);

		return "success";
	}

	/**
	 * 待返任务池修改跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("update")
	public String updateReturnTaskPool(String id, Model model) {

		ReturnTaskPool returnTaskPool = returnTaskPoolService.ById(id);

		model.addAttribute("returnTaskPool", returnTaskPool);

		return "/ReturnTaskPool/update";
	}

	/**
	 * 待返任务池修改
	 * 
	 * @param returnTaskPool
	 * @return
	 */
	@RequestMapping("updateReturnTaskPool")
	@ResponseBody
	public String update(ReturnTaskPool returnTaskPool) {

		returnTaskPoolService.update(returnTaskPool);

		return "success";
	}

	/**
	 * 导出Excel
	 * 
	 * @param returnTaskPool
	 * @param request
	 * @return
	 */
	@SuppressWarnings("deprecation")
	@RequestMapping("excel")
	public String outExcel(ReturnTaskPool returnTaskPool, HttpServletRequest request) {

		// 第一步，创建一个webbook，对应一个Excel文件
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("待返任务池");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow(0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		HSSFCell cell = row.createCell((short) 0);

		cell.setCellValue("标题");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("类型");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("面值");
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("任务类型");
		cell.setCellStyle(style);
		cell = row.createCell((short) 4);
		cell.setCellValue("生成时间");
		cell.setCellStyle(style);
		cell = row.createCell((short) 5);
		cell.setCellValue("启用时间");
		cell.setCellStyle(style);
		cell = row.createCell((short) 6);
		cell.setCellValue("结束时间");
		cell.setCellStyle(style);
		cell = row.createCell((short) 7);
		cell.setCellValue("状态");
		cell.setCellStyle(style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		List<ReturnTaskPool> pageList = returnTaskPoolService.Excel(returnTaskPool);

		for (int i = 0; i < pageList.size(); i++) {
			row = sheet.createRow(i + 1);
			ReturnTaskPool returnTaskPools = pageList.get(i);
			// 第六步，创建单元格，并设置值
			row.createCell((short) 0).setCellValue(returnTaskPools.getTitle());
			row.createCell((short) 1).setCellValue(returnTaskPools.getType());
			row.createCell((short) 2).setCellValue(returnTaskPools.getDenomination().doubleValue());
			row.createCell((short) 3).setCellValue(returnTaskPools.getTaskType());
			row.createCell((short) 4).setCellValue(DateUtils.getDateTime(returnTaskPools.getGenerateTime() == null ? new Long(0) : returnTaskPools.getGenerateTime()));
			row.createCell((short) 5).setCellValue(returnTaskPools.getDisableTime() == null ? "" : DateUtils.getDateTime(returnTaskPools.getEnableTime()));
			row.createCell((short) 6).setCellValue(returnTaskPools.getDisableTime() == null ? "" : DateUtils.getDateTime(returnTaskPools.getDisableTime()));
			row.createCell((short) 7).setCellValue(returnTaskPools.getFreezeAlive());
			cell = row.createCell((short) 8);
			try {
				FileOutputStream fout = new FileOutputStream("D:\\Excel.xls");
				wb.write(fout);
				fout.close();
			}
			catch (Exception e) {
				log.error("待返任务池导出Excel异常", e);
			}
		}

		return "success";
	}

}
