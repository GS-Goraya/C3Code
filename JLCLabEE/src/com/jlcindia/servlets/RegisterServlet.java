package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	protected void service ( HttpServletRequest req, HttpServletResponse res ) throws IOException
	{
		
		System.out.println("service()");
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		String ge=req.getParameter("gender");
		String ti=req.getParameter("timings");
		String co=req.getParameter("course");	
		String cous[]=req.getParameterValues("course");
		String re=req.getParameter("remarks");
		String msg="Your Enquiery has been added sucessfully";
		System.out.println("Full name"+fn);
		System.out.println("Email"+em);
		System.out.println("phone No"+ph);
		System.out.println("Gender"+ge);
		System.out.println("Timings"+ti);
		System.out.println("Course"+co);
		System.out.println("All Course");
		if(cous !=null)
			for(String c:cous)
			{
				System.out.println(c);
				
			}
		System.out.println("Remarks"+re);
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("java learing center");
		out.println(msg);
		out.println(fn);
		out.println(em);
		out.println(ph);
		out.println(ge);
		out.println(ti);
		out.println(co);
		out.println("All Course");
		if(cous !=null)
			for(String c: cous)
			{
				out.println(c);
			}
		out.println(re);
		
		
		
		
	}
}
