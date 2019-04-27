package com.lwkangpy.yys_all.handles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwkangpy.yys_all.beans.*;
import com.lwkangpy.yys_all.services.IHellspawnService;
import com.lwkangpy.yys_all.services.ISocietyService;

@Controller
@RequestMapping("/main/root")
public class RootMainHandle {

	@Autowired
	@Qualifier("societyService")
	private ISocietyService societyService;
	@Autowired
	@Qualifier("hellspawnService")
	private IHellspawnService hellspawnService;

	public void setSocietyService(ISocietyService societyService) {
		this.societyService = societyService;
	}

	public void setHellspawnService(IHellspawnService hellspawnService) {
		this.hellspawnService = hellspawnService;
	}

	@RequestMapping("/getAllHellspawn.do")
	@ResponseBody
	public Object getAllHellspawn() {
		List<Hellspawn> hellspawns = hellspawnService.getAllHellspawn();

		return hellspawns;

	}

	@RequestMapping("/getAllSociety.do")
	@ResponseBody
	public Object getAllSociety() {
		List<YYS_Society> societys = societyService.getAllSociety();

		return societys;

	}

	@RequestMapping("/addHellspawn.do")
	@ResponseBody
	public Object addHellspawn(String hellspawnName, String type) {
		Hellspawn he = new Hellspawn(hellspawnName, type);
		hellspawnService.addHellspawn(he);

		return he;
	}

	@RequestMapping("/delHellspawn.do")
	@ResponseBody
	public void delHellspawn(String hellspawnName) {
		hellspawnService.delHellspawn(hellspawnName);
	}

	@RequestMapping("/addSociety.do")
	@ResponseBody
	public Object addSociety(String societyName) {
		YYS_Society society = new YYS_Society(societyName);
		societyService.addSociety(society);
		return society;

	}

	@RequestMapping("/delSociety.do")
	@ResponseBody
	public void delSociety(String societyName) {
		societyService.delSociet(societyName);
	}

}
