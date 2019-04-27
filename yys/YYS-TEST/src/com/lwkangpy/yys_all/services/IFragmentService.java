package com.lwkangpy.yys_all.services;

import java.util.List;

import com.lwkangpy.yys_all.beans.Fragment;

public interface IFragmentService {

	List<Fragment> getAllFragment(int yys_Id);

	void addFragment(Fragment fr);

	Fragment getFragmentById(int id);

	void updateFragment(Fragment fr);

	

}
