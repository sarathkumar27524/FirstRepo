package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;


	public BaseBallCoach(FortuneService theFortuneService){	
		fortuneService = theFortuneService;
	}
	public BaseBallCoach() {
		// TODO Auto-generated constructor stub
	}
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
