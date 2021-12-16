package com.practice;

import java.util.HashMap;

import com.practice.pojo.Cat;

public class CatHashMapPractice {

	public static void main(String[] args) {
		HashMap<String,Cat> map =  new HashMap<String,Cat>();
		
		Cat catOne = new Cat();
		catOne.setName("Kitty");
		catOne.setColor("Grey");
		catOne.setGender("Female");
		catOne.setAge(1);
		
		map.put(catOne.getName() ,catOne);
	
		Cat catTwo = new Cat("Jim", "Black", "Male", 2);
		map.put(catTwo.getName(), catTwo);


		Cat catThree = new Cat("Zen", "White", "Female", 3);
		map.put(catThree.getName(), catThree);
		

		Cat catFour = new Cat("Min", "Brown", "Male", 4);
		map.put(catFour.getName(), catFour);
		
		Cat catFive = new Cat("Bin", "White and Black", "Female", 3);
		map.put(catFive.getName(), catFive);
	

		
		for (Cat eachcat : map.values()){
			System.out.println( "Cat:" + eachcat.getName() + "," + eachcat.getGender() + "," + eachcat.getColor() + "," + eachcat.getAge());
		}
		map.remove(catTwo.getName(), catTwo);
		for (Cat eachcat : map.values()){
			System.out.println( "Cat:" + eachcat.getName() + "," + eachcat.getGender() + "," + eachcat.getColor() + "," + eachcat.getAge());
		}
	}

}
