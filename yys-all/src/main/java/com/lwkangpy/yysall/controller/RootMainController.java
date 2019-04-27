package com.lwkangpy.yysall.controller;

import com.lwkangpy.yysall.beans.Hellspawn;
import com.lwkangpy.yysall.beans.YYS_Society;
import com.lwkangpy.yysall.services.IHellspawnService;
import com.lwkangpy.yysall.services.ISocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/main/root")
public class RootMainController {

    @Autowired
    private ISocietyService societyService;
    @Autowired
    private IHellspawnService hellspawnService;

    public void setSocietyService(ISocietyService societyService) {
        this.societyService = societyService;
    }

    public void setHellspawnService(IHellspawnService hellspawnService) {
        this.hellspawnService = hellspawnService;
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
