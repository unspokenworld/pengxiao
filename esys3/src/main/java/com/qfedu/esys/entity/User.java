package com.qfedu.esys.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;

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
	
	@Column(length=200)
	private String headImage;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = )
}
