package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	
	// Without IOC
	/*
	A aobj=new A();
	aobj.setA(99);
	aobj.setMsg("Hello Guys");
	B bobj=new B(88,"Hai Guys");
	hello hello=new hello(bobj);
	hello.setAobj(aobj);
	hello.show();
	*/
	ApplicationContext ctx=new AnnotationConfigApplicationContext(jlcconfig.class);
    System.out.println("Spring container is ready ");
    System.out.println("................");
    hello h=(hello)ctx.getBean("hello");
    h.show();
}
}
