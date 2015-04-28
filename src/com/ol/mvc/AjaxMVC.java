package com.ol.mvc;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ol.entity.userEntity;
import com.ol.service.loginService;

@Controller
public class AjaxMVC {

	@Resource()
	private loginService ls;

	@RequestMapping("/login.do")
	@ResponseBody()
	public String Login(HttpServletRequest request) {

		String userId = request.getParameter("id");
		String password = request.getParameter("pwd");

		userEntity ue = ls.getUserEntityById(userId);

		return ls.login(userId, password) ? String.format("%d %s %s", ue
				.getUserExtend().getAge(), ue.getUserExtend().getUserName(), ue
				.getUserExtend().getHobby()) : "null";
	}

	@RequestMapping("/addLogin.do")
	@ResponseBody()
	public String AddLogin(HttpServletRequest request)
			throws FileNotFoundException, IOException {

		System.setProperty("webapp.root", request.getServletContext()
				.getRealPath("/"));

		String userId = request.getParameter("id");
		String password = request.getParameter("pwd");

		return String.valueOf(ls.addLogin(userId, password));
	}
}
