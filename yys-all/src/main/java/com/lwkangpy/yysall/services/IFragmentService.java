package com.lwkangpy.yysall.services;

import java.util.List;

import com.lwkangpy.yysall.beans.Fragment;

public interface IFragmentService {

	List<Fragment> getAllFragment(int yys_Id);

	void addFragment(Fragment fr);

	Fragment getFragmentById(int id);

	void updateFragment(Fragment fr);

    void delFragment(Integer id);
}
