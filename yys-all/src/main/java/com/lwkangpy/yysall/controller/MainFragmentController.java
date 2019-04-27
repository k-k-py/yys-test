package com.lwkangpy.yysall.controller;

import com.lwkangpy.yysall.beans.*;
import com.lwkangpy.yysall.services.IFragmentService;
import com.lwkangpy.yysall.services.IHellspawnService;
import com.lwkangpy.yysall.services.IMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainFragmentController {
    @Autowired
    private IFragmentService fragmentService;
    @Autowired
    private IMasterService masterService;
    @Autowired
    private IHellspawnService hellspawnService;

    public void setMasterService(IMasterService masterService) {
        this.masterService = masterService;
    }

    public void setHellspawnService(IHellspawnService hellspawnService) {
        this.hellspawnService = hellspawnService;
    }

    public void setFragmentService(IFragmentService fragmentService) {
        this.fragmentService = fragmentService;
    }

    @GetMapping("/main/fragmentAllSelect.do")
    public String doFragmentAllSelect(HttpSession session, Model model){
        User user = (User) session.getAttribute("loginUser");
        int id = user.getId();
        //获得所有master
        List<Fragment> fragments = new ArrayList<Fragment>();
        List<Master> masters = masterService.getAllMaster(id);

        for (Master master:masters) {

            if (master.getFragments()!=null){
                List<Fragment> allFragment1 = fragmentService.getAllFragment(master.getYys_Id());
                for (Fragment fragment:allFragment1
                ) {
                    if (null!=fragment){
                        fragments.add(fragment);
                    }

                }
            }

        }

        model.addAttribute("fragments",fragments);
        return "fragment/list";
    }

    //来到Fragment修改界面
    @GetMapping("/main/updateFragment.do/{id}")
    public String doUpdateMaster(HttpSession session,@PathVariable("id")Integer id,Model model){
        //回显处理
        //将Fragment信息回显id/piece
        //查询用户Fragment根据id
        Fragment fragment = fragmentService.getFragmentById(id);
        //要显示用户
        User user = (User) session.getAttribute("loginUser");
        int userId = user.getId();
        //获得所有master
        List<Master> masters = masterService.getAllMaster(userId);
        //得到此用户master
        Master master = fragment.getMaster();//只有名字与id值
        fragment.getMaster().getId();//id
        fragment.getMaster().getMasterName();//用户名
        //碎片信息类型对应碎片名
        List<Hellspawn> hellspawns = hellspawnService.getAllHellspawn();
        Hellspawn hellspawn = fragment.getHellspawn();
        model.addAttribute("hellspawnMake",hellspawn);
        model.addAttribute("hellspawns",hellspawns);
        model.addAttribute("masterMake",master);
        model.addAttribute("masters",masters);
        model.addAttribute("fragment",fragment);
        return "fragment/add";
    }
    // 来到添加页面/main/addFragmentView.do

    @GetMapping("/main/addFragmentView.do")
    public String addaddFragmentView(HttpSession session,Model model){

        //碎片信息类型对应碎片名
        List<Hellspawn> hellspawns = hellspawnService.getAllHellspawn();
        //要显示用户
        User user = (User) session.getAttribute("loginUser");
        int userId = user.getId();
        //获得所有master
        List<Master> masters = masterService.getAllMaster(userId);

        model.addAttribute("hellspawns",hellspawns);
        model.addAttribute("masters",masters);

        return "fragment/add";
    }

    //添加碎片post方式
    @PostMapping("/main/addFragment.do")
    //masterId
    public String addFragment(Integer hellspawnId,Integer masterId,int piece){

        //yys_Id 从Master
        Master master = masterService.getMasterById(masterId);
        //hell id
        Hellspawn hellspawn = hellspawnService.getHellspawnById(hellspawnId);
        Fragment fragment = new Fragment();
        fragment.setMaster(master);
        fragment.setHellspawn(hellspawn);
        fragment.setPiece(piece);
        //添加
        fragmentService.addFragment(fragment);

        return "redirect:/main/fragmentAllSelect.do";
    }
    //修改啊碎片post方式
    @PutMapping("/main/addFragment.do")
    public String updateFragment(Integer fragmentId,Integer hellspawnId,Integer masterId,int piece){
        //yys_Id 从Master
        Master master = masterService.getMasterById(masterId);
        //式神 id
        Hellspawn hellspawn = hellspawnService.getHellspawnById(hellspawnId);
        Fragment fragment = new Fragment();
        fragment.setId(fragmentId);
        fragment.setHellspawn(hellspawn);
        fragment.setPiece(piece);
        fragment.setMaster(master);
        //修改*/

        fragmentService.updateFragment(fragment);
        return "redirect:/main/fragmentAllSelect.do";
    }
    @DeleteMapping("/main/delFragment.do/{id}")
    public String delFragment(@PathVariable("id")Integer id){

        System.out.println(id);
        //删除
        fragmentService.delFragment(id);
        return "redirect:/main/fragmentAllSelect.do";

    }

}
