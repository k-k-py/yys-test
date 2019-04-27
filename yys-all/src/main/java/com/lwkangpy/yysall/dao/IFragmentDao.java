package com.lwkangpy.yysall.dao;

import java.util.List;

import com.lwkangpy.yysall.beans.Fragment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IFragmentDao {

	void insertFragment(Fragment Fragment);// 添加碎片记录

	void deleteFragment(int id);// 删除碎片记录
 
	void updateFragment(Fragment Fragment);// 更新碎片记录

	Fragment selectFragmentById(int id);// 查询碎片根据id

	List<Fragment> selectFragmentByYys_Id(int yys_Id);// 查询碎片根据yys_Id

	List<Fragment> selectFragmentByHellspawnId(int hellspawnId);// 查询碎片根据hellspawnId

}
