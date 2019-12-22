package com.gk3.implclasses;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gk2.interfaces.FortuneService;

@Component
@Scope("prototype")
public class DailyFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortuneSerivceMessages() {
		// TODO Auto-generated method stub
		return "Daily Sami kumpidu";
	}

}
