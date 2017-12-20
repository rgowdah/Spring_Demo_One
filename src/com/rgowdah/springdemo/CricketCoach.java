package com.rgowdah.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	//no-arg constructor
	public CricketCoach(){
		System.out.println("Inside no arg constructor");
	}
	//Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter Method - setfortuneservice");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside Setter Method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("Inside Setter Method - setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
