package com.gk3.implClasses;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

public class CricketImpl implements Coach {

	FortuneService theFortuneService;
	
	@Override
	public String getWorkoutDetails() {
		// TODO Auto-generated method stub
		return "Do the Work: USING IOC";
	}
	
	@Override
	public String getFortuneService() {
		return theFortuneService.getMessage();
	}

	// Without Setter and getter, property injection wont work
	public FortuneService getTheFortuneService() {
		return theFortuneService;
	}

	public void setTheFortuneService(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
	
	
}
