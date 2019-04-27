package com.lwkangpy.yys_all.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yys_all.beans.Master;
import com.lwkangpy.yys_all.dao.IMasterDao;
import com.lwkangpy.yys_all.services.IMasterService;
@Service("masterService")
public class MasterServiceImpl implements IMasterService {
	@Autowired
	private IMasterDao dao;

	public void setDao(IMasterDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Master> getAllMaster(int id) {
		// TODO Auto-generated method stub
		List<Master> selectMasterByUser_Id = dao.selectMasterByUser_Id(id);
	
		return selectMasterByUser_Id;
	}

	@Override
	public void addMaster(Master ma) {
		// TODO Auto-generated method stub
		dao.insertMaster(ma);
	}

	@Override
	public void delMaster(int yys_Id) {
		// TODO Auto-generated method stub
		Master selectMasterByYys_Id = dao.selectMasterByYys_Id(yys_Id);
		dao.deleteMasterById(selectMasterByYys_Id.getId());
	}

	@Override
	public Master getMasterByYYS_Id(int yys_Id) {
		// TODO Auto-generated method stub
		Master selectMasterByYys_Id = dao.selectMasterByYys_Id(yys_Id);
		return selectMasterByYys_Id;
	}
}
