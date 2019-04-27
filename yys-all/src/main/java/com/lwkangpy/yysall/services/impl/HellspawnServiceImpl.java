package com.lwkangpy.yysall.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yysall.beans.Hellspawn;
import com.lwkangpy.yysall.dao.IHellspawnDao;
import com.lwkangpy.yysall.services.IHellspawnService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HellspawnServiceImpl implements IHellspawnService {

		@Autowired
		private IHellspawnDao dao;

		public void setDao(IHellspawnDao dao) {
			this.dao = dao;
		}

		@Override
		public Hellspawn getHellspawnByName(String hellspawnName) {
			// TODO Auto-generated method stub
			Hellspawn selectHellspawnByName = dao.selectHellspawnByName(hellspawnName);
			return selectHellspawnByName;
		}

		@Override
		public List<Hellspawn> getAllHellspawn() {
			// TODO Auto-generated method stub
			List<Hellspawn> selectAllHellspawn = dao.selectAllHellspawn();
			return selectAllHellspawn;
		}

		@Override
		@Transactional
		public void addHellspawn(Hellspawn he) {
			// TODO Auto-generated method stub
			dao.insertHellspawn(he);
		}

		@Override
		@Transactional
		public void delHellspawn(String hellspawnName) {
			// TODO Auto-generated method stub
			Hellspawn selectHellspawnByName = dao.selectHellspawnByName(hellspawnName);
			dao.deleteHellspawnById(selectHellspawnByName.getId());
		}

	@Override
	public Hellspawn getHellspawnById(Integer id) {
		Hellspawn hellspawn = dao.selectHellspawnById(id);
		return hellspawn;
	}

}
