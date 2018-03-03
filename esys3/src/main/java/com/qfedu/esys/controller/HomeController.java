package com.qfedu.esys.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qfedu.esys.ESysException;
import com.qfedu.esys.entity.User;
import com.qfedu.esys.entity.WoResultCode;
import com.qfedu.esys.service.IUserService;
import com.qfedu.esys.util.ESysConstant;

@Controller
@RequestMapping("/")
public class HomeController {
	private final static Logger LOG = LogManager.getLogger(HomeController.class);

	@RequestMapping("/")
	public ModelAndView toMain(HttpServletRequest req){
		String msg="欢迎您";
		//当woLogin为false会弹出登录的对话框,为true则表示已经登录 不会弹出对话框
		boolean woLogin=false;
		//从session里面获取用户信息 从而判断是否登录
		User u=(User) req.getSession().getAttribute("woUser");
		//不为null说明登录成功
		if (u!=null) {
			woLogin=true;
			msg=u.getLoginName()+","+msg;
		}
		ModelAndView m=new ModelAndView();
		m.addObject("woWelcomeMsg", msg);
		m.addObject("woLogin",woLogin);
		m.setViewName("main");
		return m;
	}
	
	@Resource
	private IUserService userService;
	//登录验证
	@ResponseBody
	@RequestMapping(value="/authentication",produces=ESysConstant.APP_JSON)
	public WoResultCode authencication(String user,String password,HttpServletRequest req){
		try {
			User u=userService.authentication(user,password);
			req.getSession().setAttribute("woUser",u);
			return WoResultCode.getSuccessCode();
		} catch (ESysException e) {
			return e.getCode();
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/logout",produces=ESysConstant.APP_JSON)
	public WoResultCode logout(HttpServletRequest request){
		request.getSession().removeAttribute("woUser");
		return WoResultCode.getSuccessCode();
		
	}
}



