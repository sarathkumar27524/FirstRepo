package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscopeapplicationContext2.xml");
		Coach thecoach = context.getBean("myCoach", Coach.class);
		Coach alphacoach = context.getBean("myCoach", Coach.class);
		boolean isSame = thecoach.equals(alphacoach);
		if(isSame){
			System.out.println("Both are same");
		}
		else{
			System.out.println("Both are different");
		}
		context.close();
		

	}

}
