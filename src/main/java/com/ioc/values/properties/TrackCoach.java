package com.ioc.values.properties;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailFortune() {
		return fortuneService.getFortune();
	}

}
