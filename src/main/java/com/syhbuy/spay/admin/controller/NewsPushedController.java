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
import com.syhbuy.spay.admin.base.util.DateUtils;
import com.syhbuy.spay.admin.base.util.HttpRequester;
import com.syhbuy.spay.admin.base.util.HttpResponse;
import com.syhbuy.spay.admin.entity.NewsPushed;
import com.syhbuy.spay.admin.service.NewsPushedService;

/**
 * 消息推送 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年10月9日 下午5:36:42
 * <p>
 * Company:
 * <p>
 * 
 * @author caohu
 * @version 1.0.0
 */
@RequestMapping(value = "/NewsPushed/")
@Controller
public class NewsPushedController extends BaseController {

	@Autowired
	private NewsPushedService newsPushedService;

	@RequestMapping("list")
	public String listBtn(Model model) throws Exception {
		model.addAttribute("btns", this.findBtns());
		return "/NewsPushed/list";
	}

	/**
	 * 推送消息列表页
	 * 
	 * @param newsPushed
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<NewsPushed> page(NewsPushed newsPushed, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<NewsPushed> newsPushedList = newsPushedService.QueryAll(newsPushed);
		for (NewsPushed newsPushed2 : newsPushedList) {
			if (newsPushed2.getSendTime() != null) {
				newsPushed2.setSendTimeShow(DateUtils.getDateTime(newsPushed2.getSendTime()));
			}
			if (newsPushed2.getOperatorTime() != null) {
				newsPushed2.setOperatorTimeShow(DateUtils.getDateTime(newsPushed2.getOperatorTime()));
			}

		}

		// 用PageInfo对结果进行包装
		PageInfo<NewsPushed> page = new PageInfo<NewsPushed>(newsPushedList);

		return page;
	}

	/**
	 * 推送消息跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add() {

		return "/NewsPushed/add";

	}

	/**
	 * 推送消息
	 * 
	 * @param newsPushed
	 * @param file
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("save")
	@ResponseBody
	@SuppressWarnings("unused")
	public String save(NewsPushed newsPushed, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
		newsPushed.setSendTime(DateUtils.getCurrTime());
		newsPushed.setOperatorTime(DateUtils.getCurrTime());
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
			newsPushed.setHostImg(filepath);
			newsPushed.setIsDel("0");
			newsPushed.setChaining("http://" + newsPushed.getChaining());
			newsPushedService.add(newsPushed);
		}
		return "success";
	}

	/**
	 * 推送消息跳转详情页面
	 * 
	 * @return
	 */
	@RequestMapping("detailsById")
	public String detailsById(String id, Model model, HttpServletRequest request) {

		NewsPushed newsPushed = newsPushedService.detailsById(id);
		String fileName = newsPushed.getHostImg();
		model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
		newsPushed.setSendTimeShow(DateUtils.getDateTime(newsPushed.getSendTime()));
		newsPushed.setOperatorTimeShow(DateUtils.getDateTime(newsPushed.getOperatorTime()));
		model.addAttribute("newsPushed", newsPushed);

		return "/NewsPushed/newPushedXq";
	}

	/**
	 * 删除推送消息
	 * 
	 * @return
	 */
	@RequestMapping("deleteNewsPushed")
	@ResponseBody
	public String deleteNewsPushed(String id) {

		newsPushedService.deleteNewsPushed(id);

		return "success";

	}
}
