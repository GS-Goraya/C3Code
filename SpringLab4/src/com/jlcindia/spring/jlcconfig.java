package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration   //Specify file which having some beans configuration
public class jlcconfig {
@Bean //(name="hello") // we can specify bean name with name attribute by default  bean name as method name.
@Scope("prototype")
public hello hello() {
	
   return new hello();	
}
}
