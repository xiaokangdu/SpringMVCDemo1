package com.dxk.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.dxk.dao.UserDao;
import com.dxk.po.User;

@Controller
public class UserService {
	@Resource
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//增加用户信息
	public void addUserInfo(User user){
		userDao.addUserInfo(user);
		
	}
}
