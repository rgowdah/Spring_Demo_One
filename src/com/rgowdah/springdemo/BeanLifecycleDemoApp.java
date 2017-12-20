package com.rgowdah.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		//Retrieve bean from spring container
		Coach coach=applicationContext.getBean("myCoach",Coach.class);
		Coach alphaCoach=applicationContext.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println("Address of coach object: "+coach);
		System.out.println("Address of alpha coach object: "+alphaCoach);
		applicationContext.close();
	}

}
