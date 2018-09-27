package com.ioc.values.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext-DI-Values-Properties.xml");
		// retrieve bean from spring container
		TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailFortune());
		System.out.println("Email: "+theCoach.getEmailAddress());
		System.out.println("Team: "+theCoach.getTeam());
		//close the context
		context.close();

	}

}
