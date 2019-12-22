package com.gk2.main.controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk1.config.SpringConfig;
import com.gk1.config.SpringWithoutScanConfig;
import com.gk3.classes.SwimCoach;
import com.gk3.classes.TennisCoach;

public class MainAppController {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		TennisCoach tennis = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(tennis.getWorkOuts());
		// Normal Literal Injection
		System.out.println(tennis.getCoachName());
		System.out.println(tennis.getAge());
		// Using property value;
		System.out.println(tennis.getPlaceName());
		System.out.println(tennis.getHobby());
		context.close();
		System.out.println("*************************************************");
		
		// Without ComponentScan
		AnnotationConfigApplicationContext contextWOScan = new AnnotationConfigApplicationContext(SpringWithoutScanConfig.class);
		SwimCoach theSwim = (SwimCoach) contextWOScan.getBean("swimBeanCoach");
		System.out.println("IOC: "+theSwim.getWorkOuts());
		System.out.println("DI: "+theSwim.getFortuneDI());
		contextWOScan.close();
	}

}
