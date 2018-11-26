package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	//	When you don’t define any constructor in your class, compiler defines default one for you, however when you declare any constructor (in your example you have already defined a parameterized constructor), compiler doesn’t do it for you.
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}










