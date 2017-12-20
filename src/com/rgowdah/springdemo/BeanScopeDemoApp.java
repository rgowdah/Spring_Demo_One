package com.rgowdah.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanApplicationContext.xml");
		//Retrieve bean from spring container
		Coach coach=applicationContext.getBean("myCoach",Coach.class);
		Coach alphaCoach=applicationContext.getBean("myCoach",Coach.class);
		boolean result=(coach==alphaCoach);
		System.out.println("Pointing to the same object: "+result);
		System.out.println("Address of coach object: "+coach);
		System.out.println("Address of alpha coach object: "+alphaCoach);
		applicationContext.close();
	}

}
