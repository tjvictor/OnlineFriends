package com.ol.service;

import com.ol.dao.loginDAO;

public class loginService {

	private loginDAO loginDao;

	public int loginCount() {
		return loginDao.getAllUser().size();
	}

	public loginDAO getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(loginDAO loginDAO) {
		this.loginDao = loginDAO;
	}

	public boolean login(String userId, String password) {
		return loginDao.login(userId, password);
	}
	
	public boolean addLogin(String userId, String password) {
		return loginDao.addLogin(userId, password);
	}
}
