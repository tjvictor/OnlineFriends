package com.ol.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ol.entity.*;

public class loginDAO extends baseDAO {

	public boolean login(String userId, String password) {
		String hql = String.format(
				"from userEntity as u where u.id='%s' and u.password='%s'", userId,
				password);
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		
		
		List<userEntity> ueList = query.list();
		if(ueList.size()>0)
			return true;
		return false;
	}

	public boolean addLogin(String userId, String password){
		userEntity ue = new userEntity();
		Session session = sessionFactory.getCurrentSession();
		ue.setId(userId);
		ue.setPassword(password);
		session.save(ue);
		return true;
	}
	
	
	public List<loginEntity> getAllUser() {
		String hsql = "from login";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hsql);
		userEntity ue = new userEntity();
		
		return query.list();
	}
}
