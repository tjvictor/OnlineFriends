package com.ol.mvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ol.service.loginService;

@Controller
public class AjaxMVC {
	
	@Resource()
	private loginService ls;
	
	@RequestMapping("/login.do")
	@ResponseBody()
	public String Login(HttpServletRequest request) {
		
		String userId = request.getParameter("id");
		String password=request.getParameter("pwd");
		
		return String.valueOf(ls.login(userId, password));
	}
	
	@RequestMapping("/addLogin.do")
	@ResponseBody()
	public String AddLogin(HttpServletRequest request) {
		
		String userId = request.getParameter("id");
		String password=request.getParameter("pwd");
		
		return String.valueOf(ls.addLogin(userId, password));
	}
}
