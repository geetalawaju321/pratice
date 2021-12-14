package com.practice.pojo;

import com.practice.constant.Day;
import com.practice.constant.TestResult;

public class Person {
	private String name;
	private Day birthDay;
	private TestResult result;
	public TestResult getResult() {
		return result;
	}
	public void setResult(TestResult result) {
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Day getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Day birthDay) {
		this.birthDay = birthDay;
	}
	
	

}
