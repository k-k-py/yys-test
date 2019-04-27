package com.lwkangpy.yysall.dao;

import java.util.List;

import com.lwkangpy.yysall.beans.Master;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMasterDao {

	void insertMaster(Master master);// 添加阴阳师

	void deleteMasterById(int id);// 删除阴阳师

	void updateMaster(Master master);// 修改阴阳师

	Master selectMasterById(int id);// 查询阴阳师根据id

	Master selectMasterByName(String masterName);// 查询阴阳师根据名字
	
	Master selectMasterByYys_Id(int yys_Id);// 查询阴阳师根据yys_Id

	List<Master> selectMasterByUser_Id(int user_Id);// 查询阴阳师根据user_id

	List<Master> selectMasterByYys_SocietyId(int yys_SocietyId);// 查询阴阳师根据yys_societyId 

}
