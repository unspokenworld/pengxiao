package com.qfedu.esys.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.qfedu.common.util.WoUtil;
import com.qfedu.esys.dao.IRoleDao;
import com.qfedu.esys.entity.Role;
import com.qfedu.esys.service.IRoleService;

@Service
@Transactional
public class RoleService implements IRoleService {
	private final static Logger LOG = LogManager.getLogger(RoleService.class);

	@Resource
	private IRoleDao roledao;
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roledao.findAll();
	}

	@Override
	public void create(Role r) {
		roledao.create(r);
		
	}

	@Override
	public void update(Role r) {
		// TODO Auto-generated method stub
		roledao.update(r);
	}

	@Override
	public void delete(Role r) {
		// TODO Auto-generated method stub
		roledao.delete(r);
	}
}
