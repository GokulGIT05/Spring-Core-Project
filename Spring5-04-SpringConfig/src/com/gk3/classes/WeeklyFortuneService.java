package com.gk3.classes;

import org.springframework.stereotype.Component;

import com.gk4.interfaces.FortuneService;

public class WeeklyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Nalla Irunthu thozhai daww - Weekly";
	}
}
