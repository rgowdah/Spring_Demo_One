package com.rgowdah.springdemo;

public class BaseballCoach implements Coach{
	//Define private field for dependency injection
	private FortuneService fortuneService;
	
	//Define constructor for dependency injection
	public BaseballCoach(FortuneService myfortuneService){
		fortuneService=myfortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "Spend 30minutes for batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get fortune
		return fortuneService.getFortune();
	}
}
