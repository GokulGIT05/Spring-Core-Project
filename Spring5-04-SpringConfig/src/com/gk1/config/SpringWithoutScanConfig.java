package com.gk1.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gk3.classes.DaliyFortuneService;
import com.gk3.classes.SwimCoach;
import com.gk3.classes.TennisCoach;
import com.gk3.classes.WeeklyFortuneService;
import com.gk4.interfaces.FortuneService;

@Configuration
public class SpringWithoutScanConfig {

	@Bean
// 	@Qualifier("SwimCoachBean") // This Qualifier wont work, only method names
	public SwimCoach swimBeanCoach() { // Bean names are method Name
		return new SwimCoach();
	}
	
	@Bean // fortuneService - bean name
	public FortuneService fortuneService() {
		return new WeeklyFortuneService();
	}
}
