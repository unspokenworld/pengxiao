package com.qfedu.esys.dao;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qfedu.esys.entity.Dictionary;

public interface IDictionaryDao {

	List<Dictionary> findall();

	void create(Dictionary d);

	void update(Dictionary d);

	void delete(Dictionary d);

	

	

}
