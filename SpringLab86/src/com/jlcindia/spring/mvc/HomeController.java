package com.jlcindia.spring.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;
@Controller
public class HomeController {
	
	@RequestMapping(value="/home.jlc")
	public String showHome()
	{
		
		System.out.println("**Home controller --> showHome**");
		return "home";
		
	}
		
	
}

