package com.lwkangpy.yys_all.services;

import java.util.List;

import com.lwkangpy.yys_all.beans.Master;

public interface IMasterService {

	List<Master> getAllMaster(int id);

	void addMaster(Master ma);

	void delMaster(int yys_Id);

	Master getMasterByYYS_Id(int yys_Id);

}
