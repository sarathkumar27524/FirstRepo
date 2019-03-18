package com.luv2code.springdemo;

public class MyApp {

	public static void main(String args[]){
		
		//create the object
		Coach baseCoach = new BaseBallCoach();
		Coach trackCoach = new TrackCoach();
		//use the object of baseCoach
		System.out.println(baseCoach.getDailyWorkout());
		//use the object of trackCoach
		System.out.println(trackCoach.getDailyWorkout());
	}
}
