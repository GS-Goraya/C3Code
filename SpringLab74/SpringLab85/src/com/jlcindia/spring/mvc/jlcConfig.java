package com.jlcindia.spring.mvc;

import java.util.Locale;

import javax.servlet.http.Cookie;

import org.apache.tiles.locale.LocaleResolver;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan({"com.jlcindia.spring.mvc"})
public class jlcConfig {
@Bean
public InternalResourceViewResolver viewResolver()
{
InternalResourceViewResolver viewResolver =new InternalResourceViewResolver();
viewResolver.setViewClass(JstlView.class);
viewResolver.setPrefix("/");
viewResolver.setSuffix(".jsp");
viewResolver.setOrder(0);
return viewResolver;
}
@Bean
public  MessageSource messageSource()
{
	ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
	 messageSource.setBasename("classpath:messages");
	 messageSource.setDefaultEncoding("UTF-8");
	 return messageSource();
	 
}
@Bean
public LocaleResolver localeResolver()
{
CookieLocaleResolver localeResolver=new CookieLocaleResolver();
localeResolver.setDefaultLocale(new Locale("en"));
return localeResolver();
}
public void addInterceptor(InterceptorRegistry registry)
{
LocaleChangeInterceptor localeChangeInterceptor=new LocaleChangeInterceptor();
localeChangeInterceptor.setParamName("language");
registry.addInterceptor(localeChangeInterceptor);
}
}
