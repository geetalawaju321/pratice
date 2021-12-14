package com.practice.set;

import java.util.HashSet;

import com.practice.pojo.Cat;

public class CatSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Cat> set = new HashSet<Cat>();
		
		Cat c = new Cat();
		c.setName("Kitty");
		c.setColor("Grey");
		c.setGender("Female");
		c.setAge(1);
		
		set.add(c);
		
		Cat ca = new Cat("Biralo","White","Male",3);
		//after one year
		ca.setAge(4);
		
		set.add(ca);
		
		Cat b = new Cat("Mmm","Black","Female", 4);
		
		set.add(b);
		
		for (Cat a: set){
			System.out.println("The name of a cat is " + a.getName() + " who is " + a.getColor() + " in color and " + a.getAge() + " years old.");

		}
		
		
		
		
	}

}
