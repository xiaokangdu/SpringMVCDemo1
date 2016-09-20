package com.dxk.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;

import com.dxk.po.User;

@Controller
public class UserDao {
	@Resource
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//持久化用户信息到数据库
	public void addUserInfo(User user){
		hibernateTemplate.save(user);
	}
}
