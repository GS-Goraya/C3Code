package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	

	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
    System.out.println("Spring container is ready ");
    System.out.println("................");
    hello h1=(hello)ctx.getBean("hello");  
    hello h2=(hello)ctx.getBean("hello");  
    System.out.println(h1==h2);
    System.out.println("Printing Memory loaction of bean "+h1);
    System.out.println("Printing Memory loaction of bean  "+h2);
    
}
}
