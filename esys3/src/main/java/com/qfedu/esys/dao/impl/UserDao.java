package com.qfedu.esys.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.qfedu.esys.dao.IUserDao;
import com.qfedu.esys.entity.User;

@Repository//这里是查询数据库的
public class UserDao implements IUserDao {
	private final static Logger LOG = LogManager.getLogger(UserDao.class);

	//注入
	@Resource//@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> findAll() {
		String hql="from User u";//面向对象  u是别名
		return sessionFactory.getCurrentSession().createQuery(hql,User.class).list();
	}

	@Override
	public void create(User u) {
		sessionFactory.getCurrentSession().persist(u);
	}

	@Override
	public void update(User u) {
		sessionFactory.getCurrentSession().merge(u);
	}

	@Override
	public void delete(String id) {
		String hql="delete from User u where u.id= :id";
		sessionFactory.getCurrentSession().createQuery(hql).setParameter("id",id).executeUpdate();
	}

	

	@Override
	public User findByLoginname(String user) {
		String hql="from User u where u.loginName= :loginName";
		return  sessionFactory.getCurrentSession().createQuery(hql,User.class).setParameter("loginName", user)
		.uniqueResult();
	}
}
