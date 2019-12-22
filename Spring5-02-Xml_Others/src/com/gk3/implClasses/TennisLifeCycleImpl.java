package com.gk3.implClasses;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

public class TennisLifeCycleImpl implements Coach {
	
	FortuneService theFortuneService;
	
	@Override
	public String getWorkoutDetails() {
		// TODO Auto-generated method stub
		return "Need two player everytime to play";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return theFortuneService.getMessage();
	}

	// Life Cycle Demo:
	public void initMethodDemo() {
		System.out.println("init-Method in TennisLifeCycleImpl is Called");
	}
	
	public void destroyMethodDemo() {
		System.out.println("destroy-Method in TennisLifeCycleImpl is Called");
	}
	
	public FortuneService getTheFortuneService() {
		return theFortuneService;
	}

	public void setTheFortuneService(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

}
