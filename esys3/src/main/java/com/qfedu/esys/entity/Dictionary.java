package com.qfedu.esys.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


@Entity
@Table(name="sys_dictionary")
public class Dictionary {
	private final static Logger LOG = LogManager.getLogger(Dictionary.class);
	
	@Id
	@Column(length=50)
	private String id;
	
	@Column(length=100)
	private String description;

	@Column(length=50)
	private String dicType;
	
	@Column(length=50)
	private String name;
	
	@Column(length=50)
	private String val;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDicType() {
		return dicType;
	}

	public void setDicType(String dicType) {
		this.dicType = dicType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	
}
