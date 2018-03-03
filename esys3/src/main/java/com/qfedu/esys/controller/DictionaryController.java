package com.qfedu.esys.controller;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qfedu.esys.entity.Dictionary;
import com.qfedu.esys.entity.Role;
import com.qfedu.esys.entity.User;
import com.qfedu.esys.entity.WoResultCode;
import com.qfedu.esys.service.IDictionaryService;
import com.qfedu.esys.vo.GridEuiVo;


@Controller
@RequestMapping("/sys/dictionary")
public class DictionaryController {
	private final static Logger LOG = LogManager.getLogger(DictionaryController.class);

	@Resource
	private IDictionaryService dictionaryService;
	
	@RequestMapping("/crud")
	public ModelAndView toMain(){
		ModelAndView m =new ModelAndView();
		m.setViewName("dictionary");
		//视图解析器(前缀+视图+后缀)
		return m;
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/list",produces="application/json")//映射URL 并安装json格式返回数据
	public List<Dictionary> getList(){
		List<Dictionary> list=dictionaryService.findAll();
		GridEuiVo<Dictionary> grid=new GridEuiVo<Dictionary>(Long.valueOf(list.size()), list);	
		return list;
	}
	

	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/create",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode create(Dictionary d){
		dictionaryService.create(d);
		return WoResultCode.getSuccessCode();
	
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/update",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode update(Dictionary d){
		dictionaryService.update(d);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/delete",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode delete(Dictionary d,String woSelectedIds){
		d.setId(woSelectedIds);
		dictionaryService.delete(d);
		return WoResultCode.getSuccessCode();
	}
}
