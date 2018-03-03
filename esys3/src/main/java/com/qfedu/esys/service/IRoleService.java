package com.qfedu.esys.service;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.Role;

public interface IRoleService {

	List<Role> findAll();

	void create(Role r);

	void update(Role r);

	void delete(Role r);

}
