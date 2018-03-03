package com.qfedu.esys.controller;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qfedu.common.util.WoUtil;
import com.qfedu.esys.entity.Dictionary;
import com.qfedu.esys.entity.Menu;
import com.qfedu.esys.entity.Role;
import com.qfedu.esys.entity.WoResultCode;
import com.qfedu.esys.service.IRoleService;
import com.qfedu.esys.vo.GridEuiVo;

@Controller
@RequestMapping("/sys/role")
public class RoleController {
	private final static Logger LOG = LogManager.getLogger(RoleController.class);
	
	@Resource
	private IRoleService roleService;
	
	@RequestMapping("/crud")
	public ModelAndView toMain(){
		ModelAndView m=new ModelAndView();
		m.setViewName("role");
		return m;
	}
	
	@ResponseBody
	@RequestMapping(value="/list",produces="application/json")
	public List<Role> getList(){ 
		List<Role> list =roleService.findAll();
		GridEuiVo<Role> grid=new GridEuiVo<Role>(Long.valueOf(list.size()), list);
		return list;
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/create",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode create(Role r){
		r.setId(WoUtil.uuid());
		roleService.create(r);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/update",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode update(Role r){
		roleService.update(r);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/delete",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode delete(Role r,String woSelectedIds){
		r.setId(woSelectedIds);
		roleService.delete(r);
		return WoResultCode.getSuccessCode();
	}
	
	
	
	
	
	
	
	
	
	
	
}
