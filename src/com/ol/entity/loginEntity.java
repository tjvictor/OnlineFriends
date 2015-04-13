package com.ol.entity;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="login")
public class loginEntity {
	public loginEntity(){ super();}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	@Resource()
	private int ID;
	
	@Column(name="userID")
	@Resource()
	private int userID;
	
	@Column(name="password")
	@Resource()
	private String password;
}
