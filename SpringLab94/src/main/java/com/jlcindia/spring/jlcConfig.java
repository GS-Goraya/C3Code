package com.jlcindia.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@Configuration
@ComponentScan({"com.jlcindia.spring"})
@Import({SecurityConfig.class})
public class jlcConfig {
	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/jlcdb");
	    dataSource.setUsername("root");
	    dataSource.setPassword("guri");
	    return dataSource;
	}
	
@Bean
public InternalResourceViewResolver viewResolver()
{
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	
}

}
