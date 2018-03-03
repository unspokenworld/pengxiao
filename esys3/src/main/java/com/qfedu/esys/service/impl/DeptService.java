package com.qfedu.esys.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.qfedu.esys.dao.IDeptDao;
import com.qfedu.esys.dao.IUserDao;
import com.qfedu.esys.entity.Dept;
import com.qfedu.esys.service.IDeptService;

@Service
@Transactional
public class DeptService implements IDeptService {
	private final static Logger LOG = LogManager.getLogger(DeptService.class);

	@Resource
	private IDeptDao deptDao;
	
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

	@Override
	public void update(Dept d) {
		 deptDao.update(d);
	}

	@Override
	public void create(Dept d) {
		deptDao.create(d);
		
	}

	@Override
	public void delete(String id) {
		deptDao.delete(id);
		
	}
}
