package com.luv2code.springdemo;

import java.util.concurrent.ThreadLocalRandom;



public class DailyFortuneService implements FortuneService {

	String [] fortunes = {"Daily:Its your lucky day","Weekly:Its your lucky week","Yearly:Its your lucky year"};

	@Override
	public String getFortune() {
		int min=0;
		int max=2;
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return fortunes[randomNum];
	}

}
