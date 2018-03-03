package com.qfedu.esys.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Entity
@Table(name="sys_user")
public class User {
	private final static Logger LOG = LogManager.getLogger(User.class);
	
	@Id
	@Column(length=50)
	private String id;
	
	@Column(length=20)
	private String loginName;
	
	@Column(length=50)
	private String password="123456";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
