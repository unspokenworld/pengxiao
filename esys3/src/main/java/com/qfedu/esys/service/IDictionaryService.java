package com.qfedu.esys.service;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.Dictionary;

public interface IDictionaryService {

	List<Dictionary> findAll();

	void create(Dictionary d);

	void update(Dictionary d);

	void delete(Dictionary d);

}
