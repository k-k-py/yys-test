package com.lwkangpy.yys_all.handles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwkangpy.yys_all.beans.Fragment;
import com.lwkangpy.yys_all.beans.Hellspawn;
import com.lwkangpy.yys_all.beans.Master;
import com.lwkangpy.yys_all.beans.User;
import com.lwkangpy.yys_all.beans.YYS_Society;
import com.lwkangpy.yys_all.services.IFragmentService;
import com.lwkangpy.yys_all.services.IHellspawnService;
import com.lwkangpy.yys_all.services.IMasterService;
import com.lwkangpy.yys_all.services.ISocietyService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/main") 
public class MainHandle {
	
	@Autowired
	@Qualifier("masterService")
	private IMasterService masterService;
	@Autowired
	@Qualifier("fragmentService")
	private IFragmentService fragmentService;
	@Autowired
	@Qualifier("societyService")
	private ISocietyService societyService;
	@Autowired
	@Qualifier("hellspawnService")
	private IHellspawnService hellspawnService;
	
	public void setHellspawnService(IHellspawnService hellspawnService) {
		this.hellspawnService = hellspawnService;
	}


	public void setSocietyService(ISocietyService societyService) {
		this.societyService = societyService;
	}


	public void setMasterService(IMasterService masterService) {
		this.masterService = masterService;
	}


	public void setFragmentService(IFragmentService fragmentService) {
		this.fragmentService = fragmentService;
	}


	@RequestMapping("/getAllMaster.do")
	@ResponseBody
	public Object getAllMaster(HttpSession session){
		User user = (User) session.getAttribute("user");
		int id = user.getId();
		List<Master> masters = masterService.getAllMaster(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		int i = 0;
		for (Master master : masters) {
			map.put("map" + i++, master);
		}
		return  map;
	}
	
	@RequestMapping(value="/addMaster.do",
					produces="text/html; charset=UTF-8")
	@ResponseBody
	public Object addMaster(HttpSession session,String masterName,String societyName,int yys_Id){
		User user = (User) session.getAttribute("user");
		//查询阴阳寮通过societyName
		YYS_Society yYS_Society = societyService.getSocietyByName(societyName);
		Master ma = new Master(masterName, yys_Id, user, yYS_Society);
		//添加一个master
		masterService.addMaster(ma);
		return "成功";
	}
	
	@RequestMapping("/delMaster.do")
	@ResponseBody
	public Object delMaster(int yys_Id){
		//删除一条
		masterService.delMaster(yys_Id);
		return "成功";
		
	}
	
	@RequestMapping("/getAllFragment.do")
	@ResponseBody
	public Object getAllFragment(int yys_Id){
		//删除一条
		List<Fragment> fragments = fragmentService.getAllFragment(yys_Id);
		return fragments;
		
	}
	
	@RequestMapping("/addFragment.do")
	@ResponseBody
	public Object addFragment(String hellspawnName,int piece,int yys_Id){
		//查询一个Maste
		Master master = masterService.getMasterByYYS_Id(yys_Id);
		//查询一个式神
		Hellspawn hellspawn = hellspawnService.getHellspawnByName(hellspawnName);

		//添加一条
		Fragment fr = new Fragment(hellspawn, piece, master);
		fragmentService.addFragment(fr);
		fr.setMaster(null);
		return fr;
	}
	
	@RequestMapping("/updateFragment.do")
	@ResponseBody
	public Object updateFragment(int id,int piece){
		//查询一条记录
		Fragment fr = fragmentService.getFragmentById(id);
		fr.setPiece(piece);
		fragmentService.updateFragment(fr);
		
		return fr;
	}

}
