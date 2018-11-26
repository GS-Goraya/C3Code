package com.jlcindia.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@Configuration
@ComponentScan({"com.jlcindia.spring.mvc"})
public class jlcConfig {
@Bean
public InternalResourceViewResolver InternalResourceViewResolver()
{
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	  viewResolver.setViewClass(JstlView.class);
	  viewResolver.setPrefix("/");
	  viewResolver.setSuffix(".jsp");
	  return viewResolver;
} 

}
