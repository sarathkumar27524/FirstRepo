package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Spend 1 hour on track running";
	}
	
	public void domyStartupStuff(){
		System.out.println("Indide startup method");
	}
	
	public void domyCleanupStuff(){
		System.out.println("Indide cleanup method");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
