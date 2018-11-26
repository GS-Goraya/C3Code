package com.jlcindia.spring;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	DataSource dataSource;
	@Autowired
	@Qualifier("userDetailsService")
	UserDetailsService userDetailsService;
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth,PasswordEncoder passwordEncoder) throws Exception
{
	System.out.println("**ConfigureGlobal**");
	
//	auth.inMemoryAuthentication().withUser("srinivas").password("jlcindia").roles("ADMIN");
//	auth.inMemoryAuthentication().withUser("manish").password("jlcindia").roles("EMP");
//	  auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
//				"select username,password, enabled from jlcusers where username=?")
//			.authoritiesByUsernameQuery(
//				"select username, role from jlcusers_roles where username=?");
	
	auth.userDetailsService(userDetailsService);
//	auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
}
@Bean
public PasswordEncoder passwordEncoder()
{
PasswordEncoder encoder=new BCryptPasswordEncoder();
return encoder;
}
protected void configure(HttpSecurity http) throws Exception
{
http.authorizeRequests().antMatchers("/admin**").access("hasRole('ROLE_ADMIN')")
.antMatchers("/emp**").access("hasAnyRole('ROLE_ADMIN','ROLE_EMP')")
.and().formLogin().loginPage("/login.jsp").
usernameParameter("username").passwordParameter("password").
defaultSuccessUrl("/index.jsp").failureUrl("/login.jsp?error").and()
.logout().logoutUrl("/j_spring_security_logout").logoutSuccessUrl("/login.jsp?logout").and().csrf().and().
exceptionHandling().accessDeniedPage("/invaild-access.jsp");
}
}
