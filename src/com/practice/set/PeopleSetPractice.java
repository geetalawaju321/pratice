package com.practice.set;

import java.util.HashSet;

import com.practice.pojo.People;

public class PeopleSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<People> set = new HashSet<People>();
		
		People obj = new People();
		obj.setName("Ramu");
		obj.setGender("Male");
		obj.setOccupation("Teacher");
		obj.setAge(45);
		obj.setLocation("Bhaktapur");
		
		set.add(obj);
		
		People p = new People("Krishnaa","Female","Beautician",30,"Kamalbinayek");
		set.add(p);
		
		People pe = new People("Pradeep","Male","Developer",28,"Alabama");
		set.add(pe);
		
		People peo = new People("Urusha","Female","Nurse",29,"Kathmandu");
		set.add(peo);
		
		People peop = new People("Prabin","Male","Banker",27,"Lalitpur");
		set.add(peop);
		
		for (People a:set){
			System.out.println( "Gender " +  a.getGender()  + " " +  a.getName() + " is a " + a.getOccupation() + " who is " + a.getAge() + " from " + a.getLocation() + ".");
		}
	}
}


