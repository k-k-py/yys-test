package com.lwkangpy.yys_all.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yys_all.beans.User;
import com.lwkangpy.yys_all.dao.IUserDao;
import com.lwkangpy.yys_all.services.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		dao.insertUser(user);
	}
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return dao.selectUserByName(user.getUserName());
	}

}
