package com.qfedu.esys.service;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.dto.MenuDto;
import com.qfedu.esys.entity.Menu;

public interface IMenuService {

	List<Menu> getChildren(String id);

	void create(MenuDto m);

	void update(MenuDto m);

	void delete(MenuDto m);

}
