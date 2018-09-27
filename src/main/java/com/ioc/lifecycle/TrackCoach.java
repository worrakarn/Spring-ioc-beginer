package com.ioc.lifecycle;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private FortuneService fortuneServiceRandom;

	public TrackCoach(FortuneService fortuneService ,FortuneService fortuneServiceRandom) {
		this.fortuneService = fortuneService;
		this.fortuneServiceRandom = fortuneServiceRandom;
	}
	
	// add init-method
	public void doMyStartupStuff() {
		System.out.println("Start");
	}
	
	// add destroy-method
	public void doMyCleanupStuff() {
		System.out.println("Clean");
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		return fortuneServiceRandom.getFortune();
	}

}
