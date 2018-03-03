package com.qfedu.esys.controller;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qfedu.common.util.WoUtil;
import com.qfedu.esys.dto.MenuDto;
import com.qfedu.esys.entity.Dictionary;
import com.qfedu.esys.entity.Menu;
import com.qfedu.esys.entity.User;
import com.qfedu.esys.entity.WoResultCode;
import com.qfedu.esys.service.IMenuService;
import com.qfedu.esys.vo.MenuEuiVo;

@RestController
@RequestMapping(value="/sys/menu",produces="application/json")
public class MenuController {
	private final static Logger LOG = LogManager.getLogger(MenuController.class);

	@Resource
	private IMenuService menuService;
	
	@RequestMapping(value="/getChildren")
	public List<MenuEuiVo> getChildren(String id){
		List<Menu> list=menuService.getChildren(id);
		return MenuEuiVo.getVos(list);
	}
	
	@RequestMapping(value="/list")
	public List<MenuDto> getList(String id){
		List<Menu> list=menuService.getChildren(id);
		return MenuDto.getDtos(list);
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/create",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode create(MenuDto m){
		m.setId(WoUtil.uuid());
		menuService.create(m);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/update",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode update(MenuDto m){
		menuService.update(m);
		return WoResultCode.getSuccessCode();
	}
	
	@ResponseBody//按照对象方式处理返回结果
	@RequestMapping(value="/delete",produces="application/json")//映射URL 并安装json格式返回数据
	public WoResultCode delete(MenuDto m,String woSelectedIds){
		m.setId(woSelectedIds);
		menuService.delete(m);
		return WoResultCode.getSuccessCode();
	}
}
