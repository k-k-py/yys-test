package com.lwkangpy.yys_all.handles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lwkangpy.yys_all.beans.User;
import com.lwkangpy.yys_all.services.IUserService;

@Controller
@RequestMapping("/test") 
public class RegisterHandler {
	@Autowired
	@Qualifier("userService")
	private IUserService service;

	public void setService(IUserService service) {
		this.service = service;
	}
	
	@RequestMapping("/register.do")
	public ModelAndView doRegister(User user){
		System.out.println(user);
		//查询数据库中name
		ModelAndView mv = new ModelAndView();
		User user2 = service.getUser(user);
		if(user2 != null){
			mv.setViewName("forward:/WEB-INF/JSPP/error/registerError.jsp");
			return mv;
		}
		
		mv.addObject("user",user);
		service.addUser(user);
		mv.setViewName("forward:/index.jsp");
		return mv;
	}

}
