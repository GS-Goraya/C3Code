package com.jlcindia.spring;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.jlcindia.*" })
@EnableTransactionManagement
@Import({ SecurityConfig.class })
public class jlcConfig {
	@Bean
	public SessionFactory sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.scanPackages("com.jlcindia.hibernate");
		builder.addProperties(getHibernateProperties());
		return builder.buildSessionFactory();
	}

	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.format_sql", true);
		prop.put("hibernate.show_sql", true);
		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		return prop;
	}

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
	public HibernateTransactionManager txManager(SessionFactory sessionFactory) {

		return new HibernateTransactionManager(sessionFactory);
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}

}
