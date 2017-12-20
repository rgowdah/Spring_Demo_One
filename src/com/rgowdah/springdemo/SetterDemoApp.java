package com.rgowdah.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from container
		CricketCoach cricketCoach=applicationContext.getBean("myCricketCoach", CricketCoach.class);
		//call methods on the bean 
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		//close the context
		applicationContext.close();
	}

}
