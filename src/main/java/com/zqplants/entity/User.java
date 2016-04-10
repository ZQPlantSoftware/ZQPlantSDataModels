package com.zqplants.entity;

import java.sql.Date;

import com.zqplants.entity.base.EntityBase;

public class User extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User(){}

	private String userName;
	private String password;
	private String description;
	private Date register_date;
	private String phone;
	private String email;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
