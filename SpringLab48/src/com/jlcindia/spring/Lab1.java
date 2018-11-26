package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println("Using Target Object");
	CustomerService cst=(CustomerService)ctx.getBean("asTarget");
	cst.addCutomer();
	cst.updateCustomer();
	AccountService ast=(AccountService)ctx.getBean("asTarget");
	ast.mydeposit();
	ast.getBal();
	try
	{
		ast.mywithdraw();
		
	}
	catch(Exception e)
	{
		System.out.println("sorry----- ");
	}
	System.out.println("----------");
	System.out.println("----using Proxy object--- ");
	CustomerService csp=(CustomerService)ctx.getBean("csProxy");
	csp.addCustomer();
	AccountService asp=(AccountService)ctx.getBean("asProxy");
	asp.mydeposit();
	asp.getBal();
	try
	{
		asp.mywithdraw();
		
	}
	catch(Exception e)
	{
		System.out.println("Sorry -----");
		
	}
	
}
}
