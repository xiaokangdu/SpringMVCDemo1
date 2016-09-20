package com.dxk.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxk.po.User;
import com.dxk.service.UserService;
@Controller
@RequestMapping(value="/user.do")
public class UserController {
	@Resource
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(params="method=reg")
	public String addUser(int id,String uname,String pwd, ModelMap model){
		User u=new User();
		u.setId(id);
		u.setUname(uname);
		u.setPwd(pwd);
		model.addObject(u);
		return "reg_success";
	}
	
	
}
