package com.practice;

import com.practice.constant.Day;
import com.practice.constant.TestResult;
import com.practice.pojo.Person;

public class EnumTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Geeta");
		p.setBirthDay(Day.SUNDAY);
		p.setResult(TestResult.ABSENCE);
		System.out.println(p.getName() + " was born in " + p.getBirthDay() + " and " + p.getResult() + " in test.");

	}

}
