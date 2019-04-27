package com.lwkangpy.yysall.services;

import java.util.List;

import com.lwkangpy.yysall.beans.Master;

public interface IMasterService {

	List<Master> getAllMaster(int id);

	void addMaster(Master ma);

	void delMaster(int yys_Id);

	Master getMasterByYYS_Id(int yys_Id);

	void updateMaster(Master master1);

    Master getMasterById(int id);
}
