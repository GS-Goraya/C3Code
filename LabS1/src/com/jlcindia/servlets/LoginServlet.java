package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="myLogin",urlPatterns= {"/login.jlc"})
public class LoginServlet extends HttpServlet {
 
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		String unm=req.getParameter("username");
		String pwd=req.getParameter("password");
		String msg="";
		if(unm.equals(pwd))
		{
			msg="<h1>Login Sucess<br/>Welcome to jlc Home page ";
			
		}
		else
		{
			msg="<h1>Login Failed </br> invaild Username or Password";
			
		}
		Writer out=res.getWriter();
		out.write(msg);
		
	}

}
