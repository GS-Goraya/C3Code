package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach(); // But it still hardcode  problem
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
