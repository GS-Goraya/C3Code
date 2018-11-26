package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab48 {
public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println("using Target object");
     CustomerServiceImpl cst=(CustomerServiceImpl)ctx.getBean("csTarget");
     cst.addCustomer();
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
    	 System.out.println("Sorry -----");
    	 
     }
     System.out.println("------------------");
     System.out.println("Using Proxy Object -----");
     CustomerService csp=(CustomerService)ctx.getBean("csProxy");
     csp.addCustomer();
     csp.updateCustomer();
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
