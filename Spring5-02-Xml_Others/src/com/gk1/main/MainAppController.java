package com.gk1.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;
import com.gk3.implClasses.LiteralInjUsingProperties;
import com.gk3.implClasses.LiteralInjectionTest;

public class MainAppController {

	// Main Method is Compulsory to execute.
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app1XmlBasicContext.xml");
		
		Coach theCoach = (Coach) context.getBean("cricketBean");
		System.out.println("Using SpringIOC: " + theCoach.getWorkoutDetails());
		System.out.println("Using Spring DI: " + theCoach.getFortuneService()); // Also Example for setter injection
		System.out.println("***********************************************************");
		
		// Scope of Beans: Singleton
		Coach theCoach1 = (Coach) context.getBean("cricketBean");
		System.out.println("The Scopes of Beans: Default / Singleton");
		System.out.println(theCoach1);
		System.out.println(theCoach);
		System.out.println("***********************************************************");
		
		// Scope of Beans: Prototype
		FortuneService theFortuneService = (FortuneService) context.getBean("fortuneBean");
		FortuneService theFortuneService1 = (FortuneService) context.getBean("fortuneBean");
		System.out.println("The Scopes of Beans: Prototype");
		System.out.println(theFortuneService);
		System.out.println(theFortuneService1);
		System.out.println("***********************************************************");
		
		// Life Cycle Methods:
		// Init method will execute while beans are instantiated itself
		// Destroy Method will get executed after the context is closed. If we don't close the context then destroy method wont be executed.
		System.out.println("The Life Cycle Methods of Spring");
		Coach theTennisCoach = (Coach) context.getBean("tennisBean");
		System.out.println("Using SpringIOC: " + theTennisCoach.getWorkoutDetails());
		System.out.println("Using Spring DI: " + theTennisCoach.getFortuneService());
//		context.close(); // Destroy Method will be called only when context is closed.
		System.out.println("***********************************************************");
		
		// Constructor Injection using only one parameter in argument field.
		Coach theSwimCoach = (Coach) context.getBean("swimBean");
		System.out.println("Using SpringIOC: " + theSwimCoach.getWorkoutDetails());
		System.out.println("Using Spring DI: " + theSwimCoach.getFortuneService());
		// Note: If we are using constructor injection, then we must overload default constructor or 
		// we have to instantiate the bean always with the constructor injection type.
		System.out.println("***********************************************************");
		
		// Literal Injection
		LiteralInjectionTest literalInj = context.getBean("literalInjTest",LiteralInjectionTest.class);
		// change in App Context for setter injection
		System.out.println("Literal Injection");
		System.out.println("Employee Name: "+literalInj.getEmpName());
		System.out.println("Age: "+literalInj.getAge());
		System.out.println("***********************************************************");
		
		// Literal Injection Using Properties File 
		LiteralInjUsingProperties literalProp = context.getBean("literalsUsingPropertyFile",LiteralInjUsingProperties.class);
		System.out.println("Literal Injection using Properties Files");
		System.out.println("Employee Name: "+literalProp.getEmpName());
		System.out.println("Age: "+literalProp.getAge());
		System.out.println("***********************************************************");
		context.close();
	}
}
