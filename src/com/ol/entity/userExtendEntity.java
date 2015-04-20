package com.ol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tblUserExtend")
public class userExtendEntity {

	@Id
	@Column(name="UserId")
	private String userId;
	
	@Column(name="UserName")
	private String userName;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Sex")
	private String sex;
	
	@Column(name="Job")
	private String job;
	
	@Column(name="Area")
	private String area;
	
	@Column(name="Hobby")
	private String hobby;
	
	@Column(name="Avatar", length=102400)
	private byte[] avatar;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public byte[] getAvatar() {
		return avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
