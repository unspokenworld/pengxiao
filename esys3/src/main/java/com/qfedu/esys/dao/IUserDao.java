package com.qfedu.esys.dao;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.User;


public interface IUserDao {

	List<User> findAll();

	void create(User u);

	void update(User u);

	void delete(String id);

	User findByLoginname(String user);

}
