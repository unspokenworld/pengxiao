package com.qfedu.esys.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Entity
@Table(name="sys_dept")
public class Dept {
	private final static Logger LOG = LogManager.getLogger(Dept.class);
	
	@Id	
	@Column(length=50)
	private String id;
	
	@Column(length=20)
	private String deptname;
	
	@Column(length=50)
	private String des;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	
}
