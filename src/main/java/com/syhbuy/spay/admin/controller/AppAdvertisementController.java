package com.syhbuy.spay.admin.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sun.misc.BASE64Encoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syhbuy.spay.admin.base.util.HttpRequester;
import com.syhbuy.spay.admin.base.util.HttpResponse;
import com.syhbuy.spay.admin.entity.AppAdvertisement;
import com.syhbuy.spay.admin.service.AppAdvertisementService;

/**
 * APP广告 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年10月11日 上午11:21:49
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@Controller
@RequestMapping(value = "/AppAdvertisement/")
public class AppAdvertisementController extends BaseController {

	@Autowired
	private AppAdvertisementService appAdvertisementService;

	/**
	 * APP广告跳转页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("list")
	public String listBtn(Model model) {

		model.addAttribute("btns", this.findBtns());

		return "/AppAdvertisement/list";
	}

	/**
	 * APP广告列表页面
	 * 
	 * @param appAdvertisement
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("page")
	public PageInfo<AppAdvertisement> page(AppAdvertisement appAdvertisement, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<AppAdvertisement> Applist = appAdvertisementService.QueryAll(appAdvertisement);

		PageInfo<AppAdvertisement> page = new PageInfo<AppAdvertisement>(Applist);
		// 用PageInfo对结果进行包装
		return page;
	}

	/**
	 * 跳转到添加APP广告页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add() {

		return "/AppAdvertisement/add";
	}

	/**
	 * 广告添加
	 * 
	 * @param appAdvertisement
	 * @param file
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping("save")
	@SuppressWarnings("unused")
	public String save(AppAdvertisement appAdvertisement, @RequestParam("file") MultipartFile file, HttpServletRequest request)throws IllegalStateException, IOException {
		long startTime = System.currentTimeMillis();
		BASE64Encoder encoder = new BASE64Encoder();
		String imgIO = encoder.encode(file.getBytes());// 返回Base64编码过的字节数组字符串
		String url = "http://api.syhbuy.cn/api/index.php?module=upload&method=base_file";
		Map<String, Object> map = new HashMap<String, Object>();
		// 上传图片临时文件
		map.put("image", "data:image/jpeg;base64," + imgIO);
		HttpResponse resposne = HttpRequester.sendPost(url, map);
		if (resposne != null) {
			String result = resposne.getContent().trim();
			JSONObject object = JSON.parseObject(result);
			String version = object.getString("version");
			String type = object.getString("type");
			String msg = object.getString("msg");
			String status = object.getString("status");
			String code = object.getString("code");

			JSONObject dataObject = JSON.parseObject(object.getString("data"));
			String filename = dataObject.getString("filename");
			String filepath = dataObject.getString("filepath");
			appAdvertisement.setImg(filepath);
			appAdvertisement.setUrl("http://" + appAdvertisement.getUrl());
			appAdvertisement.setIsDel("0");
			appAdvertisementService.add(appAdvertisement);
			return "success";
		} else {

			return "success";
		}

	}

	/**
	 * APP广告列详情面
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("detailsById")
	public String detailsById(String id, Model model, HttpServletRequest request) {

		AppAdvertisement appAdvertisement = appAdvertisementService.detailsById(id);

		String fileName = appAdvertisement.getImg();

		model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
		model.addAttribute("appAdvertisement", appAdvertisement);

		return "/AppAdvertisement/appAdvertisementXq";
	}

	/**
	 * 删除广告
	 * 
	 * @return
	 */
	@RequestMapping("deleteApp")
	@ResponseBody
	public String deleteApp(String id) {

		appAdvertisementService.deleteApp(id);

		return "success";

	}

}
