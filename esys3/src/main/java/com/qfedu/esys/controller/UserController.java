package com.qfedu.esys.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qfedu.esys.entity.User;
import com.qfedu.esys.entity.WoResultCode;
import com.qfedu.esys.service.IUserService;
import com.qfedu.esys.vo.GridEuiVo;

@Controller
@RequestMapping("/sys/user")
public class UserController {

	@Resource// @Autowired
	private IUserService userService;
	
	@RequestMapping("/crud")
	public ModelAndView toMain(){
		ModelAndView m =new ModelAndView();
		m.setViewName("user");
		//视图解析器(前缀+视图+后缀)
		return m;
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/list",produces="application/json")//映射URL 并安装json格式返回数据
	public GridEuiVo<User> getList(){
		List<User> list=userService.findAll();
		GridEuiVo<User> grid=new GridEuiVo<User>(Long.valueOf(list.size()), list);	
		return grid;
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/create",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode create(User u){
		userService.create(u);
		return WoResultCode.getSuccessCode();
	
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/update",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode update(User u){
		userService.update(u);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody
	@RequestMapping(value="/delete",produces="application/json")
	public WoResultCode delete(String id){
		userService.delete(id);
		return WoResultCode.getSuccessCode();
	}
	
	
}
