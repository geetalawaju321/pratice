package com.practice.arraylist;

import java.util.ArrayList;

import com.practice.pojo.Cat;

public class CatArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Cat> array = new ArrayList<Cat>();
		
		Cat c = new Cat();
		c.setName("Kitty");
		c.setColor("Grey");
		c.setGender("Female");
		c.setAge(1);
		
		array.add(c);
		
		Cat ca = new Cat("Bhaucha","Grey","Male",3);
		array.add(ca);
		
		Cat cat = new Cat("Biralo","Black","Female",2);
		array.add(cat);
	
		Cat a = new Cat("Milly","White","Male",3);
		array.add(a);
		
		Cat t = new Cat("Gen","Brown","Male",4);
		array.add(t);
		
		Cat tt = new Cat("Mig","White and Black","Female",2);
		array.add(tt);
		
		for (Cat n : array){
			System.out.println(n.getName() + " is the name of the cat who is " + n.getColor() + " in color " + "and " + n.getGender() + " is " + n.getAge() + " years old.");	
		}
		array.remove(c);
		for (Cat n : array){
			System.out.println(n.getName() + " is the name of the cat who is " + n.getColor() + " in color " + "and " + n.getGender() + " is " + n.getAge() + " years old.");	
		}
	}

}
