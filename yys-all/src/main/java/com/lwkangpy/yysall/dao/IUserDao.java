package com.lwkangpy.yysall.dao;

import java.util.List;

import com.lwkangpy.yysall.beans.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao {

	void insertUser(User user);// 添加用户

	void deleteUserById(int id);// 删除用户

	void updateUser(User user);// 修改用户

	List<User> selectAllUsers();// 查询所有用户

	User selectUserById(int id);// 查询用户根据id

	User selectUserByName(String userName);// 查询用户根据用户名

}
