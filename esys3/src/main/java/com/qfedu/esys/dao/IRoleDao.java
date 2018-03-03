package com.qfedu.esys.dao;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.Role;

public interface IRoleDao {

	List<Role> findAll();

	void create(Role r);

	void update(Role r);

	void delete(Role r);

}
