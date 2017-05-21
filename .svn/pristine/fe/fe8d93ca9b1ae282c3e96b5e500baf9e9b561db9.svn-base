package com.syhbuy.spay.admin.controller;

import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import com.syhbuy.spay.admin.entity.Address;
import com.syhbuy.spay.admin.entity.LoginInfo;
import com.syhbuy.spay.admin.entity.User;
import com.syhbuy.spay.admin.entityVo.UserMessageVo;
import com.syhbuy.spay.admin.service.AddressSevice;
import com.syhbuy.spay.admin.service.LoginInfoMapperService;
import com.syhbuy.spay.admin.service.UserService;

/**
 * 用户列表页控制层
 * <p>
 * Copyright: Copyright (c) 2016年9月12日 下午2:28:20
 * <p>
 * Company:
 * <p>
 * 
 * @author 曹虎
 * @version 1.0.0
 */
@EnableTransactionManagement
@Transactional
@Controller
@RequestMapping(value = "/user/")
public class UserController extends BaseController {

	private final Logger log = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private AddressSevice addressSevice;

	@Autowired
	private LoginInfoMapperService loginInfoService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/user/list";
	}

	/**
	 * 用户信息列表页
	 * 
	 * @param user对象
	 * @param pageNum当前页的页号
	 * @param pageSize每页显示条数
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	@SuppressWarnings("unused")
	public PageInfo<UserMessageVo> page(UserMessageVo userMessageVo, int pageNum, int pageSize) {
		if (userMessageVo != null && userMessageVo.getSearchStartTime() != null && userMessageVo.getSearchEndTime() != null && !"".equals(userMessageVo.getSearchStartTime()) && !"".equals(userMessageVo.getSearchEndTime())) {
			userMessageVo.setStartTime(DateUtils.convertDataToLong(userMessageVo.getSearchStartTime() == null ? "" : userMessageVo.getSearchStartTime()));
			userMessageVo.setEndTime(DateUtils.convertDataToLong(userMessageVo.getSearchEndTime() == null ? "" : userMessageVo.getSearchEndTime()));
		}
		PageHelper.startPage(pageNum, pageSize);

		List<UserMessageVo> pageList = userService.QueryAllUser(userMessageVo);
		for (UserMessageVo userMessageVo2 : pageList) {
			if (userMessageVo2.getRegDate() != null) {
				BigDecimal bal = new BigDecimal(0);
				String timeString = DateUtils.getDateTime(userMessageVo2.getRegDate());
				userMessageVo2.setResgTimeString(timeString);
				userMessageVo2.setAddress(userMessageVo2.getAddress() == null ? "" : userMessageVo2.getAddress());
				userMessageVo2.setRealName(userMessageVo2.getRealName() == null ? "" : userMessageVo2.getRealName());
				userMessageVo2.setMail(userMessageVo2.getMail() == null ? "" : userMessageVo2.getMail());
				userMessageVo2.setPhone(userMessageVo2.getPhone() == null ? "" : userMessageVo2.getPhone());
				userMessageVo2.setAccountBalance(userMessageVo2.getAccountBalance() == null ? new BigDecimal(0) : userMessageVo2.getAccountBalance());
			}
		}
		PageInfo<UserMessageVo> page = new PageInfo<UserMessageVo>(pageList);

		return page;
	}

	/**
	 * 添加用户
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String add(Model model) {

		return "/user/add";
	}

	/**
	 * 用户添加控制层
	 * 
	 * @param user
	 * @return
	 */
	@Transactional
	@ResponseBody
	@RequestMapping("save")
	public String save(User user, String address) {
		// 创建时间
		Long ss = DateUtils.getCurrTime();
		user.setRegDate(ss);
		// 获取ID
		String id = IDGeneratorUtils.getUUID32();
		user.setId(id);
		// 添加用户基本信息
		userService.save(user);
		// 添加会员地址
		Address addre = new Address();
		addre.setId(id);
		addre.setUserId(id);
		addre.setAddress(address);
		addressSevice.save(addre);
		// 创建LoginInfo对象
		LoginInfo loginInfo = new LoginInfo();
		ss = DateUtils.getCurrTime();
		loginInfo.setCreateDate(ss);
		loginInfo.setId(id);
		loginInfo.setUserId(id);
		loginInfo.setPhone(user.getPhone());
		loginInfo.setLoginType("phone");
		loginInfoService.save(loginInfo);
		return "success";
	}

	/**
	 * 跳转会员信息修改页面
	 * 
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "updateUser")
	public String updateUser(String id, Model model) {

		// 根据Id查询
		UserMessageVo user = userService.findAllUser(id);
		model.addAttribute("user", user);

		return "/user/update";
	}

	/**
	 * 会员信息修改控制层
	 * 
	 * @param user
	 * @return
	 */
	@Transactional
	@RequestMapping(value = "update")
	@ResponseBody
	public String update(UserMessageVo userMessageVo) {
		// 会员信息修改
		userService.update(userMessageVo);
		// 修改会员地址
		addressSevice.updateAddress(userMessageVo);

		return "success";

	}

	/**
	 * 跳转会员信息账户状态页面
	 * 
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "updateState")
	public String updateState(String id, Model model) {

		UserMessageVo user = userService.findAllUser(id);
		if (user.getAccountState().equals("正常")) {
			user.setAccountState("0");
		} else if (user.getAccountState().equals("冻结")) {
			user.setAccountState("1");
		}

		model.addAttribute("user", user);

		return "/user/updateState";
	}

	/**
	 * 修改会员账户状态（0.正常 1.冻结）
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "State")
	@ResponseBody
	public String State(User user) {

		userService.stata(user);

		return "success";
	}

	/**
	 * 查看会员详情信息
	 * 
	 * @param userId
	 * @return
	 */
	@RequestMapping("detailsById")
	public String detailsById(String id, Model model) {

		UserMessageVo user = userService.detailsById(id);

		model.addAttribute("user", user);

		return "/user/userxq";
	}

	/**
	 * 导出Excel
	 * 
	 * @param userMessageVo
	 * @param request
	 * @return
	 */
	@RequestMapping("outExcel")
	@ResponseBody
	public String outExcel(UserMessageVo userMessageVo, HttpServletRequest request) {
		try {

			// 第一步，创建一个webbook，对应一个Excel文件
			XSSFWorkbook wb = new XSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			XSSFSheet sheet = wb.createSheet("会员信息");
			// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
			XSSFRow row = sheet.createRow(0);
			// 第四步，创建单元格，并设置值表头 设置表头居中
			XSSFCellStyle style = wb.createCellStyle();

			style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
			XSSFCell cell = row.createCell((short) 0);

			cell.setCellValue("用户名");
			cell.setCellStyle(style);
			cell = row.createCell((short) 1);
			cell.setCellValue("昵称");
			cell.setCellStyle(style);
			cell = row.createCell((short) 2);
			cell.setCellValue("手机号");
			cell.setCellStyle(style);
			cell = row.createCell((short) 3);
			cell.setCellValue("邮箱");
			cell.setCellStyle(style);
			cell = row.createCell((short) 4);
			cell.setCellValue("性别");
			cell.setCellStyle(style);
			cell = row.createCell((short) 5);
			cell.setCellValue("详细地址");
			cell.setCellStyle(style);
			cell = row.createCell((short) 6);
			cell.setCellValue("账户状态");
			cell.setCellStyle(style);
			cell = row.createCell((short) 7);
			cell.setCellValue("真实姓名");
			cell.setCellStyle(style);
			cell = row.createCell((short) 8);
			cell.setCellValue("账户余额");
			cell.setCellStyle(style);
			cell = row.createCell((short) 9);
			cell.setCellValue("注册时间");
			cell.setCellStyle(style);

			// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
			List<UserMessageVo> pageList = userService.deriveExcel(userMessageVo);
			for (int i = 0; i < pageList.size(); i++) {
				row = sheet.createRow(i + 1);
				UserMessageVo user = pageList.get(i);
				// 第六步，创建单元格，并设置值
				row.createCell((short) 0).setCellValue(user.getId());
				row.createCell((short) 1).setCellValue(user.getUserName());
				row.createCell((short) 2).setCellValue(user.getPhone());
				row.createCell((short) 3).setCellValue(user.getMail());
				row.createCell((short) 4).setCellValue(user.getAddress());
				row.createCell((short) 5).setCellValue(user.getAccountState());
				row.createCell((short) 6).setCellValue(user.getRealName());
				row.createCell((short) 7).setCellValue(user.getAccountBalance() == null ? new Double(0) : user.getAccountBalance().doubleValue());
				row.createCell((short) 8).setCellValue(DateUtils.getDateTime(user.getRegDate()));
				cell = row.createCell((short) 9);

				FileOutputStream fout = new FileOutputStream("D:\\Excel.xls");
				wb.write(fout);
				fout.close();
			}
		}
		catch (Exception e) {
			log.error("用户列表导出Excel异常", e);
		}

		return "success";
	}

}
