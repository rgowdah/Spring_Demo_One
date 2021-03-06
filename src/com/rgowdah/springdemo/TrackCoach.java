package com.rgowdah.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ fortuneService.getFortune();
	}
	//Add a Init method
	public void doMyStartUpStuff(){
		System.out.println("TrackCoach: inside init method");
	}
	//Add a destroy method
	public void doMyCleanUpStuff(){
		System.out.println("TrackCoach: inside destroy method");
	}

}
