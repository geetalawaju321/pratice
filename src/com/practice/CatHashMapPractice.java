package com.practice;

import java.util.HashMap;

import com.practice.pojo.Cat;

public class CatHashMapPractice {

	public static void main(String[] args) {
		HashMap<String,Cat> map =  new HashMap<String,Cat>();
		
		Cat c = new Cat();
		c.setName("Kitty");
		c.setColor("Grey");
		c.setGender("Female");
		c.setAge(1);
		
		map.put(c.getName() ,c);
	
		Cat ca = new Cat("Jim", "Black", "Male", 2);
		
		map.put(ca.getName(), ca);


		Cat b = new Cat("Zen", "White", "Female", 3);
		map.put(b.getName(), b);
		

		Cat a = new Cat("Min", "Brown", "Male", 4);
		map.put(a.getName(), a);
		
		Cat t = new Cat("Bin", "White and Black", "Female", 3);
		map.put(t.getName(), t);
	

		
		for (Cat eachcat : map.values()){
			System.out.println( "Cat:" + eachcat.getName() + "," + eachcat.getGender() + "," + eachcat.getColor() + "," + eachcat.getAge());
		}
		map.remove(ca.getName(), ca);
		for (Cat eachcat : map.values()){
			System.out.println( "Cat:" + eachcat.getName() + "," + eachcat.getGender() + "," + eachcat.getColor() + "," + eachcat.getAge());
		}
	}

}
