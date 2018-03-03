package com.qfedu.esys.dao;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.dto.MenuDto;
import com.qfedu.esys.entity.Menu;

public interface IMenuDao {

	List<Menu> getChildren(String id);

	void create(Menu m);

	void update(Menu m);

	void delete(Menu m);

}
