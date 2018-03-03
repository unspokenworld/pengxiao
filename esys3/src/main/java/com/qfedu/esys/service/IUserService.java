package com.qfedu.esys.service;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.User;



public interface IUserService {

	List<User> findAll();

	void create(User u);

	void update(User u);

	void delete(String id);

	

	com.qfedu.esys.entity.User authentication(String user, String password);



}
