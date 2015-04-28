package com.ol.dao;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ol.entity.userEntity;
import com.ol.entity.userExtendEntity;

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

	public boolean addLogin(String userId, String password) throws FileNotFoundException, IOException{
		userEntity ue = new userEntity();
		Session session = sessionFactory.getCurrentSession();
		ue.setId(userId);
		ue.setPassword(password);
		
		userExtendEntity uee = new userExtendEntity();
		uee.setUserId(userId);
		uee.setAge(10);
		uee.setHobby("like");
		uee.setUserName("Grubby");
		
		
		String imgPath = System.getProperty("webapp.root")+"res\\photo1.jpg";
		System.out.println(imgPath);
		File file = new File(imgPath);
		FileInputStream fis = new FileInputStream(file);  
//        ByteArrayOutputStream bos = new ByteArrayOutputStream((int)file.length());
        byte[] imageByte = new byte[(int)file.length()];
        fis.read(imageByte);
		
		/*while((n= fis.read(imageByte)) != -1){
			bos.write(imageByte,0,n);
		}*/
        fis.close();
//        bos.close();
        
//		bos.write(imageByte);
		uee.setAvatar(imageByte);
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
