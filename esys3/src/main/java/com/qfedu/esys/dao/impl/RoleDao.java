package com.qfedu.esys.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.qfedu.esys.dao.IRoleDao;
import com.qfedu.esys.entity.Role;
import com.qfedu.esys.entity.User;


@Repository
public class RoleDao implements IRoleDao {
	private final static Logger LOG = LogManager.getLogger(RoleDao.class);

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public List<Role> findAll() {
		String hql="from Role r";
		return sessionFactory.getCurrentSession().createQuery(hql,Role.class).list();
	}

	@Override
	public void create(Role r) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(r);
	}

	@Override
	public void update(Role r) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(r);
	}

	@Override
	public void delete(Role r) {
		
		sessionFactory.getCurrentSession().delete(r);
	}
}
