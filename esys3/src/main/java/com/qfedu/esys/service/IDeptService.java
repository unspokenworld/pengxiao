package com.qfedu.esys.service;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.Dept;

public interface IDeptService {

	List<Dept> findAll();

	void update(Dept d);

	void create(Dept d);

	void delete(String id);

}
