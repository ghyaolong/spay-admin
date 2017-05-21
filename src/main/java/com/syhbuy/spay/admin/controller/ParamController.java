package com.syhbuy.spay.admin.controller;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syhbuy.spay.admin.entity.Parameter;

/**
 * 系统参数控制器 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-6 下午3:40:14
 * <p>
 * Company: 善友汇网络科技股份有限公司
 * <p>
 * 
 * @author 姚成龙
 * @version 1.0.0
 */
@Controller
public class ParamController {

	private final Logger log = Logger.getLogger(ParamController.class);

	@ResponseBody
	@RequestMapping("excel/param")
	public String importExcel() {
		importExcel2();

		return "";
	}

	private void importExcel2() {
		ImportParams params = new ImportParams();
		params.setTitleRows(0);
		params.setHeadRows(1);
		params.setNeedSave(true);
		File file = new File("d:\\tt.xlsx");
		try {
			@SuppressWarnings("unused")
			List<Parameter> listBlackList = ExcelImportUtil.importExcel(file, Parameter.class, params);
			// allRecords.addAll(listBlackList);
		}
		catch (Exception e) {

			log.error("导入Excel异常", e);

		}
		finally {

		}
	}

	/*
	 * private void importExcel1(){ FileInputStream fis = null; try { fis = new
	 * FileInputStream("d:\\tt.xls"); ExcelUtil<Parameter> util = new
	 * ExcelUtil<Parameter>(Parameter.class);// 创建excel工具类 List<Parameter> list
	 * = util.importExcel("参数信息", fis);// 导入 System.out.println(list); } catch
	 * (FileNotFoundException e) { e.printStackTrace(); } }
	 */
}
