package com.lwkangpy.yysall.services;

import java.util.List;

import com.lwkangpy.yysall.beans.Hellspawn;

public interface IHellspawnService {

	Hellspawn getHellspawnByName(String hellspawnName);

	List<Hellspawn> getAllHellspawn();

	void addHellspawn(Hellspawn he);

	void delHellspawn(String hellspawnName);

    Hellspawn getHellspawnById(Integer id);
}
