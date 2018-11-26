package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //Specify file which having some beans configuration
public class jlcconfig {
@Bean //(name="hello") // we can specify bean name with name attribute by default  bean name as method name.
public hello hello(A aobj, B bobj) {
	hello h= new hello(bobj);
	h.setAobj(aobj);
   return h;	
}
@Bean
public A createA()  // creating A instance 
{
 A aobj= new A();
 aobj.setA(88);
 aobj.setMsg("hello guys");
 return aobj;
}
@Bean
public B createB()
{
	return new B(99, "hai guys");
	}
}
