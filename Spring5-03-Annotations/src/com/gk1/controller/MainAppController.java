package com.gk1.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;
import com.gk3.implclasses.DailyFortuneServiceImpl;
import com.gk3.implclasses.SwimLifeCycleClass;
import com.gk3.implclasses.literalIn.LiteralInjDemo;
import com.gk3.implclasses.literalIn.LiteralInjDemoUsingProperties;

public class MainAppController {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicaitonConfig.xml");
		Coach theCoach = (Coach) context.getBean("tennisCoach");
		System.out.println("The IOC: " + theCoach.getExercices());
		System.out.println("The DI: "+theCoach.getFortuneServices()); // Qualifier is used here.
		System.out.println("-------------------------------------------------------");
		
		// Scope of the Beans:
		Coach theCoach1 = (Coach) context.getBean("tennisCoach");
		System.out.println("Singleton:");
		System.out.println("tennisCoach: "+theCoach1);
		System.out.println("tennisCoach: "+theCoach);
		System.out.println("-------------------------------------------------------");
		
		FortuneService theFortune = context.getBean("dailyFortuneServiceImpl",DailyFortuneServiceImpl.class);
		FortuneService theFortune1 = context.getBean("dailyFortune"
				+ "ServiceImpl",DailyFortuneServiceImpl.class);
		System.out.println("PROTOTYPE:");
		System.out.println("DailyFortuneServiceImpl: "+theFortune);
		System.out.println("DailyFortuneServiceImpl: "+theFortune1);
		System.out.println("-------------------------------------------------------");
		
		// LifeCyle Methods.
		Coach swimCoach = (Coach) context.getBean("swimLifeCycleClass",SwimLifeCycleClass.class);
		System.out.println("The IOC: " + swimCoach.getExercices());
		System.out.println("The DI: "+swimCoach.getFortuneServices()); // Qualifier is used here.
		System.out.println("-------------------------------------------------------");
		
		// Constructor Injection:
		// There is different way to use Qualifier in Constructor.
		Coach runningCoach = context.getBean("runningCoachConstructorInjection",Coach.class);
		System.out.println("The IOC: " + runningCoach.getExercices());
		System.out.println("The DI: "+runningCoach.getFortuneServices()); // Qualifier is used here.
		System.out.println("-------------------------------------------------------");
		
		// SetterInjection:
		Coach cricketCoach = context.getBean("cricketCoachSetterInjection",Coach.class);
		System.out.println("The IOC: " + cricketCoach.getExercices());
		System.out.println("The DI: "+cricketCoach.getFortuneServices()); // Qualifier is used here.
		System.out.println("-------------------------------------------------------");
		
		// Literal Injection:
		LiteralInjDemo literalDemo = context.getBean("literalInjDemo",LiteralInjDemo.class);
		System.out.println("Employee Name: "+literalDemo.getEmployeeName());
		System.out.println("Employee Age: "+literalDemo.getAge());
		System.out.println("-------------------------------------------------------");
		
		// Literal Value Injection Using Properties Values:
		LiteralInjDemoUsingProperties literalInjDemoUsingProperties = context.getBean("literalInjDemoUsingProperties",LiteralInjDemoUsingProperties.class);
		System.out.println("Employee Name: "+literalInjDemoUsingProperties.getEmployeeName());
		System.out.println("Employee Age: "+literalInjDemoUsingProperties.getAge());
		System.out.println("-------------------------------------------------------");
		
		
		context.close(); // PreDestroy Method will execute here.
	}

}
