package com.lwkangpy.yys_all.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwkangpy.yys_all.beans.Hellspawn;
import com.lwkangpy.yys_all.dao.IHellspawnDao;
import com.lwkangpy.yys_all.services.IHellspawnService;
@Service("hellspawnService")
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
		public void addHellspawn(Hellspawn he) {
			// TODO Auto-generated method stub
			dao.insertHellspawn(he);
		}

		@Override
		public void delHellspawn(String hellspawnName) {
			// TODO Auto-generated method stub
			Hellspawn selectHellspawnByName = dao.selectHellspawnByName(hellspawnName);
			dao.deleteHellspawnById(selectHellspawnByName.getId());
		}
		
}
