package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
{
	auth.inMemoryAuthentication().withUser("srinivas").password("jlcindia").roles("ADMIN");
	auth.inMemoryAuthentication().withUser("manish").password("jlcindia").roles("EMP");
	
}
protected void configure(HttpSecurity http) throws Exception
{
http.authorizeRequests().antMatchers("/admin**").access("hasRole('ROLE_ADMIN')").antMatchers("/emp**").access("hasAnyRole('ROLE_ADMIN','ROLE_EMP')").and().formLogin().and().exceptionHandling().accessDeniedPage("/invaild-access.jsp");
}
}
