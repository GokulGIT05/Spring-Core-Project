package com.gk3.implclasses;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

@Component
public class SwimLifeCycleClass implements Coach {

	@Autowired
	@Qualifier("dailyFortuneServiceImpl")
	FortuneService theService;
	
	// NO need of getter and setter, if we are doing by Field Injection
	@Override
	public String getExercices() {
		return "Daily Swim pannu . Udambuku nalathu";
	}

	@Override
	public String getFortuneServices() {
		return theService.getFortuneSerivceMessages();
	}
	
	
	@PostConstruct
	public void initMethod() {
		System.out.println("SwimLifeCycleClassInit: Method. will execute will initilaizing beans itself");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("SwimLifeCycleClass: destroyMethod() Will Execute after the context was closed.");
	}

}
