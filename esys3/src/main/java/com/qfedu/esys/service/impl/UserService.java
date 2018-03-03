package com.qfedu.esys.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.qfedu.esys.ESysException;
import com.qfedu.esys.dao.IUserDao;
import com.qfedu.esys.entity.User;
import com.qfedu.esys.service.IUserService;
import com.qfedu.esys.util.ESysConstant;






@Service
@Transactional
public class UserService implements IUserService {
	private final static Logger LOG = LogManager.getLogger(UserService.class);

	@Resource//@Autowired
	private IUserDao userdao;
	
	@Override
	public List<User> findAll() {
		return userdao.findAll();
	}

	@Override
	public void create(User u) {
		// TODO Auto-generated method stub
		 userdao.create(u);
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		userdao.update(u);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userdao.delete(id);
	}


	@Override
	public User authentication(String user, String password) {
		User u=userdao.findByLoginname(user);
		if (u == null||(!password.equals(u.getPassword()))) {
			throw new ESysException(ESysConstant.ERR_LOGIN);
		}
		return u;
	}
}
