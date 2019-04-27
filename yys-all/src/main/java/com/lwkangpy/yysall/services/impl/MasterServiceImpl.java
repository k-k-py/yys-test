package com.lwkangpy.yysall.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yysall.beans.Master;
import com.lwkangpy.yysall.dao.IMasterDao;
import com.lwkangpy.yysall.services.IMasterService;
import org.springframework.transaction.annotation.Transactional;

@Service
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
	@Transactional
	public void addMaster(Master ma) {
		// TODO Auto-generated method stub
		dao.insertMaster(ma);
	}

	@Override
	@Transactional
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

	@Override
	@Transactional
	public void updateMaster(Master master1) {
		dao.updateMaster(master1);
	}

	@Override
	public Master getMasterById(int id) {
		Master master = dao.selectMasterById(id);
		return master;
	}
}
