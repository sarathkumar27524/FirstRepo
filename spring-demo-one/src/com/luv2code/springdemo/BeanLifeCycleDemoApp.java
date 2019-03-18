package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		Coach thecoach = context.getBean("myCoach", Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		context.close();
		

	}

}
