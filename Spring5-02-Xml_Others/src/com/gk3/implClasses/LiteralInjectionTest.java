package com.gk3.implClasses;

public class LiteralInjectionTest {
	
	private String empName;
	private Integer age;
	
	public LiteralInjectionTest(String empName, Integer age) {
		super();
		this.empName = empName;
		this.age = age;
	}
	
	// Getter & Setter
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
