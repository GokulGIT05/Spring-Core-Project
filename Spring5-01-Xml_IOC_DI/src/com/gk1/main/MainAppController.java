package com.gk1.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk2.interfaces.Coach;

public class MainAppController {

	// Main Method is Compulsory to execute.
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app1XmlBasicContext.xml");
		
		Coach theCoach = (Coach) context.getBean("cricketBean");

		System.out.println("Using SpringIOC: " + theCoach.getWorkoutDetails());
		System.out.println("Using Spring DI: " + theCoach.getFortuneService());

		context.close();
	}
}
