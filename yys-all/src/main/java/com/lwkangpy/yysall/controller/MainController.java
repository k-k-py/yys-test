package com.lwkangpy.yysall.controller;

import com.lwkangpy.yysall.beans.Fragment;
import com.lwkangpy.yysall.beans.Master;
import com.lwkangpy.yysall.beans.User;
import com.lwkangpy.yysall.beans.YYS_Society;
import com.lwkangpy.yysall.services.IFragmentService;
import com.lwkangpy.yysall.services.IHellspawnService;
import com.lwkangpy.yysall.services.IMasterService;
import com.lwkangpy.yysall.services.ISocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private IMasterService masterService;
    @Autowired
    private ISocietyService societyService;

    //注入redis缓存
    @Autowired
    private RedisTemplate<String,String>  stringStringRedisTemplate;
    @Autowired
    private RedisTemplate<Object,Object>  objectObjectRedisTemplate;

    public void setSocietyService(ISocietyService societyService) {
        this.societyService = societyService;
    }


    public void setMasterService(IMasterService masterService) {
        this.masterService = masterService;
    }


    @GetMapping("/main/getAllMaster.do")
    public String doUserSelect(HttpSession session, Model model){
        User user = (User) session.getAttribute("loginUser");
        int id = user.getId();
        //使用redis缓存
        //两次判断
        /*List<Master> masters1 = (List<Master>)objectObjectRedisTemplate.opsForValue().get("masters");
        if (null == masters1){
            synchronized (this){
                masters1 = (List<Master>)objectObjectRedisTemplate.opsForValue().get("masters");
                if (null == masters1){

                    List<Master> masters = masterService.getAllMaster(id);
                    objectObjectRedisTemplate.opsForValue().set("masters",masters);
                }
            }
        }*/
        List<Master> masters = masterService.getAllMaster(id);
        model.addAttribute("masters",masters);

        return "master/list";
    }
    //来到Master修改界面
    @GetMapping("/main/updateMater.do/{yys_Id}")
    public String doUpdateMaster(@PathVariable("yys_Id")Integer yys_Id,Model model){
        //回显处理
        //将Mater信息回显
        //查询用户Master根据id
        Master masterByYYS_id = masterService.getMasterByYYS_Id(yys_Id);
        //阴阳师账户名 阴阳师唯一ID
        //回显所有阴阳寮 YYS_Society societyName
        List<YYS_Society> allSociety = societyService.getAllSociety();
        //获得所属阴阳寮
        YYS_Society yys_society = masterByYYS_id.getyYS_Society();
        model.addAttribute("master",masterByYYS_id);
        model.addAttribute("allSociety" , allSociety);
        model.addAttribute("societyMake" , yys_society);

        return "master/add";
    }
    //来到master添加界面
    @GetMapping("/main/addMaterView.do")
    public String doAddMaterView(Model model){
        //回显所有阴阳寮 YYS_Society societyName
        List<YYS_Society> allSociety = societyService.getAllSociety();
        model.addAttribute("allSociety" , allSociety);
        return "master/add";
    }

    //master添加post
    @PostMapping("/main/addMaster.do")
    public String addMaster(String masterName,Integer id,int yys_Id,HttpSession session){

        Master master = new Master();
        master.setMasterName(masterName);
        YYS_Society society = new YYS_Society();
        society.setId(id);
        System.out.println(id);
        master.setyYS_Society(society);
        master.setYys_Id(yys_Id);
        User user = (User) session.getAttribute("loginUser");
        master.setUser(user);
        masterService.addMaster(master);

        return "redirect:/main/getAllMaster.do";//返回list页面
    }

    //master修改
    @PutMapping("/main/addMaster.do")
    public String upDateMaster(Integer id,String masterName,String societyName,int yys_Id,HttpSession session){
        Master master1 = new Master();
        master1.setId(id);
        master1.setMasterName(masterName);
        master1.setYys_Id(yys_Id);
        User user = (User) session.getAttribute("loginUser");
        master1.setUser(user);
        YYS_Society societyByName = societyService.getSocietyByName(societyName);
        System.out.println(societyName);
        master1.setyYS_Society(societyByName);
        masterService.updateMaster(master1);

        return "redirect:/main/getAllMaster.do";
    }
    //删除Master操作

    @DeleteMapping("/main/delMaster.do/{yys_Id}")
    public String delMaster(@PathVariable("yys_Id")Integer yys_Id){

        masterService.delMaster(yys_Id);

        return "redirect:/main/getAllMaster.do";
    }



}


