package com.qfedu.esys.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.qfedu.esys.dao.IMenuDao;
import com.qfedu.esys.dto.MenuDto;
import com.qfedu.esys.entity.Dept;
import com.qfedu.esys.entity.Menu;

@Repository
public class MenuDao implements IMenuDao {
	private final static Logger LOG = LogManager.getLogger(MenuDao.class);

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public List<Menu> getChildren(String id) {
		if (null == id || "".equals(id)) {
			String hql = "from Menu m where m.parent.id is null";
			return sessionFactory.getCurrentSession().createQuery(hql, Menu.class).list();
		} else {
			String hql = "from Menu m where m.parent.id = :id";
			return sessionFactory.getCurrentSession().createQuery(hql, Menu.class).setParameter("id", id).list();
		}

	}

	@Override
	public void create(Menu m) {
		sessionFactory.getCurrentSession().persist(m);
		
	}

	@Override
	public void update(Menu m) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(m);
	}

	@Override
	public void delete(Menu m) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(m);
	}

}
