package com.qfedu.esys.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.qfedu.esys.dao.IDictionaryDao;
import com.qfedu.esys.entity.Dictionary;
import com.qfedu.esys.entity.User;




@Repository
public class DictionaryDao implements IDictionaryDao {
	private final static Logger LOG = LogManager.getLogger(DictionaryDao.class);

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public List<Dictionary> findall() {
		// TODO Auto-generated method stub
		String hql="from Dictionary d";
		return sessionFactory.getCurrentSession().createQuery(hql,Dictionary.class).list();
	}

	@Override
	public void create(Dictionary d) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(d);
	}

	@Override
	public void update(Dictionary d) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(d);
	}

	@Override
	public void delete(Dictionary d) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(d);
	}
}
