package com.jlcindia.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
@RequestMapping(value= {"/hello.jlc"},method=RequestMethod.GET)
public String showHelloPage()
{
System.out.println("**showHelloPage**");
return "hello";
}
@RequestMapping(value="/admin.jlc",method=RequestMethod.GET)
public String showAdminPage()
{
System.out.println("**ShowAdminPage**");	
return "admin";
}
@RequestMapping(value= "/emp.jlc",method=RequestMethod.GET)
public String showEmployeePage()
{
System.out.println("**showEmployeePage**");
return "employee";
}

@RequestMapping(value= "/logout",method=RequestMethod.GET)
public String logoutPage(HttpServletRequest request,HttpServletResponse response) 
{
System.out.println("**logout page**");	
Authentication auth=SecurityContextHolder.getContext().getAuthentication();
if(auth!=null)
{
new SecurityContextLogoutHandler().logout(request, response, auth);
}
return "redirect:/login?logout";
}
}
