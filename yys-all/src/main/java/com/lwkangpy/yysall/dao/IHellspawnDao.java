package com.lwkangpy.yysall.dao;

import java.util.List;

import com.lwkangpy.yysall.beans.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHellspawnDao {

	void insertHellspawn(Hellspawn hellspawn);// 添加式神

	void deleteHellspawnById(int id);// 删除式神

	void updateHellspawn(Hellspawn hellspawn);// 修改式神

	List<Hellspawn> selectAllHellspawn();// 查询所有式神

	List<Hellspawn> selectHellspawnByType(String type);// 查询式神根据类型('sp','ssr','限定ssr')

	Hellspawn selectHellspawnById(int id);// 查询式神根据id

	Hellspawn selectHellspawnByName(String hellspawnName);// 查询式神根据名字

}
