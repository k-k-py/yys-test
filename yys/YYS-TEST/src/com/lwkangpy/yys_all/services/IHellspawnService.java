package com.lwkangpy.yys_all.services;

import java.util.List;

import com.lwkangpy.yys_all.beans.Hellspawn;

public interface IHellspawnService {

	Hellspawn getHellspawnByName(String hellspawnName);

	List<Hellspawn> getAllHellspawn();

	void addHellspawn(Hellspawn he);

	void delHellspawn(String hellspawnName);

}
