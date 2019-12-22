package com.gk3.implClasses;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

public class SwimInjectionImpl implements Coach {
	
	private FortuneService theService;
	
	// I didn't override implement default constructot but it works.
	public SwimInjectionImpl(FortuneService theService) {
		this.theService=theService;
	}

	@Override
	public String getWorkoutDetails() {
		// TODO Auto-generated method stub
		return "Swim for 6 hrs: IOC";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return theService.getMessage();
	}
	
}
