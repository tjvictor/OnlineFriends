package com.ol.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="userEntity")
@Table(name="tblUsers")
public class userEntity {
	
	@Id
	@Column(name="Id")
	private String id;
	
	@Column(name="Password")
	private String password;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="UserId")
	private userExtendEntity userExtend;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public userExtendEntity getUserExtend() {
		return userExtend;
	}

	public void setUserExtend(userExtendEntity userExtend) {
		this.userExtend = userExtend;
	}
	
	
}
