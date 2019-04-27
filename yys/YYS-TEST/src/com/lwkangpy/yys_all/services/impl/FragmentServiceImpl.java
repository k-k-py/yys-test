package com.lwkangpy.yys_all.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yys_all.beans.Fragment;
import com.lwkangpy.yys_all.dao.IFragmentDao;
import com.lwkangpy.yys_all.services.IFragmentService;
@Service("fragmentService")
public class FragmentServiceImpl implements IFragmentService {
	@Autowired
	private IFragmentDao dao;

	public void setDao(IFragmentDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Fragment> getAllFragment(int yys_Id) {
		// TODO Auto-generated method stub
		List<Fragment> selectFragmentByYys_Id = dao.selectFragmentByYys_Id(yys_Id);
		return selectFragmentByYys_Id;
	}

	@Override
	public void addFragment(Fragment fr) {
		// TODO Auto-generated method stub
		dao.insertFragment(fr);
	}

	@Override
	public Fragment getFragmentById(int id) {
		// TODO Auto-generated method stub
		Fragment selectFragmentById = dao.selectFragmentById(id);
		return selectFragmentById;
	}

	@Override
	public void updateFragment(Fragment fr) {
		// TODO Auto-generated method stub
		dao.updateFragment(fr);
		
	}

}
