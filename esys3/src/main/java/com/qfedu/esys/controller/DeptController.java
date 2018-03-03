package com.qfedu.esys.controller;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qfedu.esys.entity.Dept;
import com.qfedu.esys.entity.WoResultCode;
import com.qfedu.esys.service.IDeptService;
import com.qfedu.esys.vo.GridEuiVo;

@Controller
@RequestMapping("/sys/dept/")
public class DeptController {
	private final static Logger LOG = LogManager.getLogger(DeptController.class);

	@Resource
	private IDeptService deptservice;
	
	@RequestMapping("/crud")
	public ModelAndView toMain(){
		ModelAndView m=new ModelAndView();
		m.setViewName("dept");
		return m;
	}
	
	@ResponseBody
	@RequestMapping(value="/list",produces="application/json")
	public GridEuiVo<Dept> getList(){
		List<Dept> list =deptservice.findAll();
		GridEuiVo<Dept> grid=new GridEuiVo<Dept>(Long.valueOf(list.size()), list);
		return grid;
	}
	
	@ResponseBody
	@RequestMapping(value="/create",produces="application/json")
	public WoResultCode Create(Dept d){
		deptservice.create(d);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody
	@RequestMapping(value="/update",produces="application/json")
	public WoResultCode update(Dept d){
		deptservice.update(d);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody
	@RequestMapping(value="/delete",produces="application/json")
	public WoResultCode delete(String id){
		deptservice.delete(id);
		return WoResultCode.getSuccessCode();
	}
}
