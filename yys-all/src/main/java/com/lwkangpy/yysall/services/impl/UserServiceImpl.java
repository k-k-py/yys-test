package com.lwkangpy.yysall.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yysall.beans.User;
import com.lwkangpy.yysall.dao.IUserDao;
import com.lwkangpy.yysall.services.IUserService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	@Override
	@Transactional
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
