package com.practice.pojo;

public class Dog {
	private String name;
	private String breed;
	private String color;
	private int age;
	
	public Dog() {	
	}
	public Dog(String name) {
		super();
		this.name = name;
	}
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	public Dog(String name, String breed, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
	}
	public Dog(String name, String breed, String color, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
