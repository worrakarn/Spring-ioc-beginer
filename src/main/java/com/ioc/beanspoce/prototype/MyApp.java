package com.ioc.beanspoce.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext-BeanScope-prototype.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach==alphaCoach);
		
		// pring out result
		System.out.println("\nPointing to the same Object "+result);
		System.out.println("\nMemory location of theCoach "+theCoach);
		System.out.println("\nMemory location of alphaCoach "+alphaCoach);

		//close the context
		context.close();

	}

}
