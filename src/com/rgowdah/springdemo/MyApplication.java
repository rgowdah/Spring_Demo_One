package com.rgowdah.springdemo;

public class MyApplication {
	public static void main(String[] args) {
		Coach baseballCoach=new BaseballCoach(null);
		Coach trackCoach=new TrackCoach();
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());
	}
}
