package com.jlcindia.spring.mvc;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;
@Controller
@SessionAttributes
public class LoginController {
	@Autowired
	private UserValidator userValidator;
	@RequestMapping(value="/verifyUser",method=RequestMethod.POST)
	public String verifyUser(@ModelAttribute("user")User user,BindingResult result) {
		System.out.println("verifyUser()");
		userValidator.validate(user,result);
		if(result.hasErrors())
		{
			System.out.println(result.getErrorCount());
			return "login";
			
			
		}
    
	//User user=(User)command;
		String un=user.getUsername();
		String pw=user.getPassword();
		System.out.println(un);
		System.out.println(pw);
		if(!un.equals(pw))
		{
			return "login";
		}
		return "home";	
	}
	
	@RequestMapping("/login")
	public String showLoginForm(Map model)throws ServletException{
		System.out.println("showLoginFrom");
      	User user = new User();
		user.setUsername("srinivas");
		model.put("user", user);
		return "login";
		
		
		
	}
}

