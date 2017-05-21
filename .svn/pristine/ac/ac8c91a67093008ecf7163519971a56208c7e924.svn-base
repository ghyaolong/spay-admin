package com.syhbuy.spay.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.syhbuy.spay.admin.base.util.Common;
import com.syhbuy.spay.admin.service.IndexService;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-19 下午5:02:49
 * <p>
 * Company: 善友汇网络
 * <p>
 * 
 * @author lixing
 * @version 1.0.0
 */

@Controller
@RequestMapping("/")
public class IndexController {

	private final Logger log = Logger.getLogger(IndexController.class);

	@Autowired
	private IndexService indexService;

	/**
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String login(HttpServletRequest request) {
		request.removeAttribute("error");
		return "/index/login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String login(String username, String password, HttpServletRequest request) {
		try {
			if (Common.isEmpty(username) || Common.isEmpty(password)) {
				request.setAttribute("error", "用户名或密码不能为空！");
				return "/index/login";
			}
			// 想要得到 SecurityUtils.getSubject()　的对象．．访问地址必须跟ｓｈｉｒｏ的拦截地址内．不然后会报空指针
			Subject user = SecurityUtils.getSubject();
			// 用户输入的账号和密码,,存到UsernamePasswordToken对象中..然后由shiro内部认证对比,
			// 认证执行者交由ShiroDbRealm中doGetAuthenticationInfo处理
			// 当以上认证成功后会向下执行,认证失败会抛出异常
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			try {
				user.login(token);
			}
			catch (LockedAccountException lae) {
				token.clear();
				request.setAttribute("error", "用户已经被锁定不能登录，请与管理员联系！");
				return "/index/login";
			}
			catch (ExcessiveAttemptsException e) {
				token.clear();
				request.setAttribute("error", "账号：" + username + " 登录失败次数过多,锁定10分钟!");
				return "/index/login";
			}
			catch (AuthenticationException e) {
				token.clear();
				request.setAttribute("error", "用户或密码不正确！");
				return "/index/login";

			}
		}
		catch (Exception e) {
			log.error("登录异常", e);
			request.setAttribute("error", "登录异常，请联系管理员！");
			return "/index/login";
		}
		return "redirect:index.do";

	}

	@RequestMapping("index")
	public String index(Model model) throws Exception {
		if (indexService.initIndex(model)) {
			return "/index/index";
		}
		return null;
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout() {
		// 使用权限管理工具进行用户的退出，注销登录
		SecurityUtils.getSubject().logout(); // session
		// 会销毁，在SessionListener监听session销毁，清理权限缓存
		return "redirect:login.do";
	}

	@RequestMapping(value = "home", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String home(HttpServletRequest request) {
		request.removeAttribute("error");
		return "/index/home";
	}

	@RequestMapping(value = "denied", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String denied(HttpServletRequest request) {
		request.removeAttribute("error");
		return "/index/denied";
	}

}
