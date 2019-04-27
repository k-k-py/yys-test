package com.lwkangpy.yysall.controller;

import com.lwkangpy.yysall.beans.User;
import com.lwkangpy.yysall.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

//    @DeleteMapping
//    @PutMapping
//    @GetMapping
    @Autowired
    private IUserService service;

    public void setService(IUserService service) {
        this.service = service;
    }


    @PostMapping(value = "/user/login.do")
    public String doLogin(User user,HttpSession session,Map<String,Object> map){

        User user2 = service.getUser(user);
        if(user2!=null && user.getPassWord().equals(user2.getPassWord())){

            session.setAttribute("loginUser", user2);
            if("root".equals(user2.getUserName()) ){
                return "redirect:/root/main.html";
            }
            return "redirect:/main.html";
        }else if("lwkangpy".equals(user.getUserName())&&"123456".equals(user.getPassWord())){
            //测试用户 lwkangpy 123456
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        }else{
            //登陆失败

            map.put("msg","用户名密码错误!");
            return  "login";

        }


    }

    @PostMapping(value="/user/register.do")
    public String doRegister(User user,Map<String,Object> map){
        //查询数据库中name

        User user2 = service.getUser(user);

        if(user2 != null){
            map.put("msgErro","用户名已存在!");
            return "register";
        }else if(""==user.getUserName()){
            map.put("msgErro","用户名不合法!");
            return "register";
        }

        map.put("msg","注册成功!");
        service.addUser(user);
        return "login";
    }



    @GetMapping("/user/logout.do")
    public String doLogout(HttpSession session, RedirectAttributes rs){
        session.setAttribute("loginUser", null);
        rs.addAttribute("msgLogout","用户退出成功!");
        return "redirect:/index.html";//重定向到页面
    }


}
