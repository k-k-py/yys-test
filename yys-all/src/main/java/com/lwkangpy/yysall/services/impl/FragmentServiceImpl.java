package com.lwkangpy.yysall.services.impl;

import java.util.List;

import com.lwkangpy.yysall.dao.IFragmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yysall.beans.Fragment;
import com.lwkangpy.yysall.services.IFragmentService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FragmentServiceImpl implements IFragmentService {

	@Autowired
	private IFragmentDao iFragmentDao;

	public void setDao(IFragmentDao iFragmentDao) {
		this.iFragmentDao = iFragmentDao;
	}

	@Override
	public List<Fragment> getAllFragment(int yys_Id) {
		// TODO Auto-generated method stub
		List<Fragment> selectFragmentByYys_Id = iFragmentDao.selectFragmentByYys_Id(yys_Id);
		return selectFragmentByYys_Id;
	}

	@Override
	@Transactional
	public void addFragment(Fragment fr) {
		// TODO Auto-generated method stub
		iFragmentDao.insertFragment(fr);
	}

	@Override
	public Fragment getFragmentById(int id) {

		// TODO Auto-generated method stub
		Fragment fragment = iFragmentDao.selectFragmentById(id);
		return fragment;
	}

	@Override
	@Transactional
	public void updateFragment(Fragment fr) {
		// TODO Auto-generated method stub
		iFragmentDao.updateFragment(fr);
		
	}

	@Override
	@Transactional
	public void delFragment(Integer id) {
		iFragmentDao.deleteFragment(id);
	}


}
