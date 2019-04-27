package com.lwkangpy.yysall.dao;

import java.util.List;
import com.lwkangpy.yysall.beans.YYS_Society;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IYYS_SocietyDao {

	void insertYYS_Society(YYS_Society yYS_Society);// 添加阴阳寮

	void deleteYYS_SocietyById(int id);// 删除阴阳寮

	void updateYYS_Society(YYS_Society yYS_Society);// 修改阴阳寮

	List<YYS_Society> selectAllYYS_Society();// 查询所有阴阳寮

	YYS_Society selectYYS_SocietyById(int id);// 查询阴阳寮根据id

	YYS_Society selectYYS_SocietyByName(String yYS_SocietyName);// 查询阴阳寮根据名字
}
