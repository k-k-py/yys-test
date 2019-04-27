package com.lwkangpy.yys_all.handles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index") 
public class IndexHandle {
	
	@RequestMapping("/toLoginPage.do")
	public String toLoginPage(){
		
		return "forward:/WEB-INF/JSPP/login/login.jsp";
		
	}
	
	@RequestMapping("/toRegisterPage.do")
	public String toRegisterPage(){
		
		return "forward:/WEB-INF/JSPP/register/register.jsp";
		
	}

}
