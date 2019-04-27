package com.lwkangpy.yysall.services;

import java.util.List;

import com.lwkangpy.yysall.beans.YYS_Society;

public interface ISocietyService {

	YYS_Society getSocietyByName(String societyName);

	List<YYS_Society> getAllSociety();

	void addSociety(YYS_Society society);

	void delSociet(String societyName);

}
