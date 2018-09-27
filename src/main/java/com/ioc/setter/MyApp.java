package com.ioc.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext-DI-Setter.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailFortune());
		//close the context
		context.close();

	}

}
