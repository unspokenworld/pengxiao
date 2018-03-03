package com.qfedu.esys.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.qfedu.esys.dao.IDeptDao;
import com.qfedu.esys.entity.Dept;
import com.qfedu.esys.entity.User;

@Repository
public class DeptDao implements IDeptDao {
	private final static Logger LOG = LogManager.getLogger(DeptDao.class);

	//注入
		@Resource//@Autowired
		private SessionFactory sessionFactory;
	
	@Override
	public List<Dept> findAll() {
		String hql="from Dept d";//面向对象  u是别名
		return sessionFactory.getCurrentSession().createQuery(hql,Dept.class).list();
	}

	@Override
	public void update(Dept d) {
		sessionFactory.getCurrentSession().merge(d);
	}

	@Override
	public void create(Dept d) {
		sessionFactory.getCurrentSession().persist(d);
		
	}

	@Override
	public void delete(String id) {
		String hql="delete from Dept d where d.id= :id";
		sessionFactory.getCurrentSession().createQuery(hql).setParameter("id",id).executeUpdate();
	}
}
