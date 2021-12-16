package com.practice;

import com.practice.pojo.Dog;

public class DogPractice {

	public static void main(String[] args) {
		Dog dogOne = new Dog();
		dogOne.setName("Motu");
		dogOne.setBreed("Spliz");
		dogOne.setColor("White");
		dogOne.setAge(5);
		System.out.println("Dog name " + dogOne.getName() + " is a " + dogOne.getBreed() + " breed who is " + dogOne.getColor() + " in color and age is " + dogOne.getAge() + ".");
		
		Dog dogTwo = new Dog("Bhuntu");
		dogTwo.setBreed("Local");
		dogTwo.setColor("Black and Brown");
		dogTwo.setAge(4);
		System.out.println(dogTwo.getName() + " is a " + dogTwo.getBreed() + " breed who is " + dogTwo.getColor() + " in color and age is " + dogTwo.getAge() + ".");
		
		Dog dogThree = new Dog("Puntu","Local");
		dogThree.setColor("Black and White");
		dogThree.setAge(2);
		System.out.println(dogThree.getName() + " is also a " + dogThree.getBreed() + " breed who is " + dogThree.getColor() + " in color and age is " + dogThree.getAge() + ".");
	
		Dog dogFour = new Dog("Kali","Local","Black");
		dogFour.setAge(2);
		System.out.println(dogFour.getName() + " is also a " + dogFour.getBreed() + " breed who is " + dogFour.getColor() + " in color and age is " + dogFour.getAge() + ".");
		
		Dog dogFive = new Dog("Browny", "local","Light Brown", 7);
		System.out.println(dogFive.getName() + " is also a " + dogFive.getBreed() + " breed who is " + dogFive.getColor() + " in color and age is " + dogFive.getAge() + ".");
				
	}

}
