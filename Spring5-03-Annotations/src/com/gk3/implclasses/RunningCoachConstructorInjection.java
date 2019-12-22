package com.gk3.implclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gk2.interfaces.Coach;
import com.gk2.interfaces.FortuneService;

@Component
public class RunningCoachConstructorInjection implements Coach {

	FortuneService theService;
	
	// See the difference here. @Qualifier is not present outside, It present inside.
	@Autowired
	public RunningCoachConstructorInjection(@Qualifier("ae") FortuneService theService) {
		super();
		this.theService = theService;
	}

	@Override
	public String getExercices() {
		// TODO Auto-generated method stub
		return "Odu da raja";
	}

	@Override
	public String getFortuneServices() {
		// TODO Auto-generated method stub
		return theService.getFortuneSerivceMessages();
	}

}
