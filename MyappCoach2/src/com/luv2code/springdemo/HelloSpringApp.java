package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);   //Coach is interface....When we pass the interface to the method, behind the scenes Spring will cast the object for you.
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}







