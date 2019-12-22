package com.gk3.implclasses;

import org.springframework.stereotype.Component;
import com.gk2.interfaces.FortuneService;

@Component("ae")
public class WeeklyFortuneService implements FortuneService {

	@Override
	public String getFortuneSerivceMessages() {
		// TODO Auto-generated method stub
		return "Ella Weekum nala irunthutu poda";
	}

}
