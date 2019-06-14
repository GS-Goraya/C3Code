package com.jlcindia.spring.mvc;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.jlcindia.spring.*" })
@EnableTransactionManagement
public class JLCConfig extends WebMvcConfigurerAdapter {

	@Bean
	ViewResolver createViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(InternalResourceView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jlcindiadb");
		dataSource.setUsername("root");
		dataSource.setPassword("guri");
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource ds) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(ds);
		sessionFactory.setPackagesToScan("com.jlcindia.spring.hibernate");
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		sessionFactory.setHibernateProperties(props);
		return sessionFactory;
	}

	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sf) {
		HibernateTemplate hTemp = new HibernateTemplate(sf);
		return hTemp;
	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sf) {
		HibernateTransactionManager txManager = new HibernateTransactionManager(sf);
		return txManager;
	}

}
