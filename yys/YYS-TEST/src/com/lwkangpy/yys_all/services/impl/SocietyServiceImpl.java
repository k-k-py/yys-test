package com.lwkangpy.yys_all.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yys_all.beans.YYS_Society;
import com.lwkangpy.yys_all.dao.IYYS_SocietyDao;
import com.lwkangpy.yys_all.services.ISocietyService;
@Service("societyService")
public class SocietyServiceImpl implements ISocietyService {
	@Autowired
	private IYYS_SocietyDao dao;

	public void setDao(IYYS_SocietyDao dao) {
		this.dao = dao;
	}

	@Override
	public YYS_Society getSocietyByName(String societyName) {
		// TODO Auto-generated method stub
		YYS_Society selectYYS_SocietyByName = dao.selectYYS_SocietyByName(societyName);
		return selectYYS_SocietyByName;
	}

	@Override
	public List<YYS_Society> getAllSociety() {
		// TODO Auto-generated method stub
		List<YYS_Society> selectAllYYS_Society = dao.selectAllYYS_Society();
		
		return selectAllYYS_Society;
	}

	@Override
	public void addSociety(YYS_Society society) {
		// TODO Auto-generated method stub
		dao.insertYYS_Society(society);
	}

	@Override
	public void delSociet(String societyName) {
		// TODO Auto-generated method stub
		//查询
		YYS_Society selectYYS_SocietyByName = dao.selectYYS_SocietyByName(societyName);
		dao.deleteYYS_SocietyById(selectYYS_SocietyByName.getId());
	}
	
	
}
