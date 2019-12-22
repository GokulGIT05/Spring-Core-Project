package com.gk3.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gk4.interfaces.FortuneService;

@Component
public class TennisCoach {
	
	@Value("Gokul G")
	private String coachName;
	
	@Value("27")
	private Integer age;
	
	@Value("${place}")
	private String placeName;
	
	@Value("${hobby}")
	private String hobby;
	
	@Autowired
	@Qualifier("dailyFS")
	public FortuneService theFortuneService;  // For Auto wired no need of getter and setter.
	
	// Getters and Setters:
	public String getWorkOuts() {
		return "Do Well the  Work out for tennis";
	}
	
	public String getFortuneDI() {
		return theFortuneService.getFortuneService();
	}

	
	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	

	
	
	
}
