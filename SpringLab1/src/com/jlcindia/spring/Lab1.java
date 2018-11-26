package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	
	// Without IOC
	/*
	A aobj=new A();
	aobj.setA(999);
	aobj.setMsg("Hello Guys");
	B bobj=new B(888,"Hai Guys");
	hello hello=new hello(bobj);
	hello.setAobj(aobj);
	hello.show();
*/
//  2nd step creating a spring container 
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
    System.out.println("Spring container is ready ");
    System.out.println("................");
 // 3rd step retriving a bean  from spring container    
    hello h=(hello)ctx.getBean("hello");  // 1st way by passing ID
    
  //  hello h=(hello)ctx.getBean("hello",hello.class);  // 2nd way 
    h.show();  
}
}
