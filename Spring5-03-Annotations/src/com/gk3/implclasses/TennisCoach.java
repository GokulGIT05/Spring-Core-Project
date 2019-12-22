package com.gk3.implclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("ae")
	FortuneService theFortuneService;

	@Override
	public String getExercices() {
		// TODO Auto-generated method stub
		return "Play for 2 Weeks";
	}

	@Override
	public String getFortuneServices() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortuneSerivceMessages();
	}
	// No Need of getter and Setter
}
