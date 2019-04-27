package com.lwkangpy.yys_all.handles;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwkangpy.yys_all.beans.User;
import com.lwkangpy.yys_all.services.IUserService;

@Controller
@RequestMapping("/test") 
public class LoginHandle {
	
	@Autowired
	@Qualifier("userService")
	private IUserService service;

	public void setService(IUserService service) {
		this.service = service;
	}
	
	@RequestMapping("/login.do")
	public String doLogin(User user,HttpServletRequest request){
		
		User user2 = service.getUser(user);
		if(user2!=null && user.getPassWord().equals(user2.getPassWord())){
			
			request.getSession().setAttribute("user", user2);
			if("root".equals(user2.getUserName()) ){
				return "forward:/WEB-INF/JSPP/root/rootMain.jsp";
			}
			return "forward:/WEB-INF/JSPP/main/main.jsp";
		}
	
		return "forward:/WEB-INF/JSPP/error/loginError.jsp";
	}
	@RequestMapping("/logout.do")
	public String doLogout(HttpSession session){
		session.setAttribute("user", null);
		
		return "forward:/WEB-INF/JSPP/logout/logout.jsp" ;
	}

}
