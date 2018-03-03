package com.qfedu.esys.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.qfedu.esys.dao.IMenuDao;
import com.qfedu.esys.dto.MenuDto;
import com.qfedu.esys.entity.Menu;
import com.qfedu.esys.service.IMenuService;

@Service
@Transactional
public class MenuService implements IMenuService {
	private final static Logger LOG = LogManager.getLogger(MenuService.class);

	@Resource
	private IMenuDao menuDao;

	@Override
	public List<Menu> getChildren(String id) {
		// TODO Auto-generated method stub
		return menuDao.getChildren(id);
	}

	@Override
	public void create(MenuDto m) {
		// TODO Auto-generated method stub
		menuDao.create(m.createEntity());
	}

	@Override
	public void update(MenuDto m) {
		// TODO Auto-generated method stub
		menuDao.update(m.createEntity());
	}

	@Override
	public void delete(MenuDto m) {
		// TODO Auto-generated method stub
		menuDao.delete(m.createEntity());
	}

}
