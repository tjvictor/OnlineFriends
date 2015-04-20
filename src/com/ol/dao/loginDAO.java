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
		
		userExtendEntity uee = new userExtendEntity();
		uee.setUserId(userId);
		uee.setAge(10);
		uee.setHobby("like");
		uee.setUserName("Grubby");
		ue.setUserExtend(uee);
		
		session.save(ue);
		return true;
	}
	
	public userEntity getUserEntityById(String userId){
		String hql = String.format(
				"from userEntity as u where u.id='%s'", userId);
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		
		
		List<userEntity> ueList = query.list();
		if(ueList.size()>0)
			return ueList.get(0);
		return null;
	}
}
