package com.gk3.implclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

@Component
public class CricketCoachSetterInjection implements Coach {

	FortuneService theService;

	@Override
	public String getExercices() {
		// TODO Auto-generated method stub
		return "Only Six than adiakanum";
	}
	
	@Override
	public String getFortuneServices() {
		// TODO Auto-generated method stub
		return theService.getFortuneSerivceMessages();
	}

	
	// Getter & Setters:
	public FortuneService getTheService() {
		return theService;
	}

	@Autowired
	@Qualifier("dailyFortuneServiceImpl")
	public void setTheService(FortuneService theService) {
		this.theService = theService;
	}
	
	
	

}
