package com.qfedu.esys.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Entity
@Table(name="sys_role")
public class Role {
	private final static Logger LOG = LogManager.getLogger(Role.class);

	@Id
	@Column(length=50)
	private String id;
	
	@Column(length=200)
	private String description;
	
	@Column(length=20)
	private String name;
	
	@Column(length=2)
	private String type;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
