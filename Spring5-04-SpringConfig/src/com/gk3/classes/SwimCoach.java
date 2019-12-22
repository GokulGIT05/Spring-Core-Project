package com.gk3.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.gk4.interfaces.FortuneService;

public class SwimCoach {
	
	@Autowired
	@Qualifier("fortuneService")
	public FortuneService theFortuneService;
	
	public String getWorkOuts() {
		return "Do Well the  Work out for tennis";
	}
	
	public String getFortuneDI() {
		return theFortuneService.getFortuneService();
	}

}
