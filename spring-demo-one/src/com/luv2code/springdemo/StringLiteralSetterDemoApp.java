package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringLiteralSetterDemoApp {

	
	public static void main(String args[]){
		//load the spring configuration files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from the spring container
		CricketCoach coach = context.getBean("crickCoach", CricketCoach.class);
		//call the method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		context.close();
	}
	
}
