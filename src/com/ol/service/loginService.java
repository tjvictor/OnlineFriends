package com.ol.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ol.dao.loginDAO;
import com.ol.entity.userEntity;

public class loginService {

	private loginDAO loginDao;

	public loginDAO getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(loginDAO loginDAO) {
		this.loginDao = loginDAO;
	}

	public boolean login(String userId, String password) {
		return loginDao.login(userId, password);
	}
	
	public boolean addLogin(String userId, String password) throws FileNotFoundException, IOException {
		return loginDao.addLogin(userId, password);
	}
	
	public userEntity getUserEntityById(String id){
		return loginDao.getUserEntityById(id);
	}
}
