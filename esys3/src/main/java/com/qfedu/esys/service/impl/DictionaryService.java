package com.qfedu.esys.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.qfedu.common.util.WoUtil;
import com.qfedu.esys.dao.IDictionaryDao;
import com.qfedu.esys.entity.Dictionary;
import com.qfedu.esys.service.IDictionaryService;

@Service
@Transactional
public class DictionaryService implements IDictionaryService {
	private final static Logger LOG = LogManager.getLogger(DictionaryService.class);

	@Resource
	private IDictionaryDao dictionarydao;
	
	@Override
	public List<Dictionary> findAll() {
		// TODO Auto-generated method stub
		return dictionarydao.findall();
	}

	@Override
	public void create(Dictionary d) {
		// TODO Auto-generated method stub
		d.setId(WoUtil.uuid());
		dictionarydao.create(d);
	}

	@Override
	public void update(Dictionary d) {
		// TODO Auto-generated method stub
		dictionarydao.update(d);
	}

	@Override
	public void delete(Dictionary d) {
		// TODO Auto-generated method stub
		dictionarydao.delete(d);
	}
}
