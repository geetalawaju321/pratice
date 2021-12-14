package com.practice;

import java.util.HashMap;

public class HashMapPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hash = new HashMap<String,String>();
		hash.put("Nepal", "Napali");
		hash.put("India", "Indian");
		hash.put("China", "Chinese");
		hash.put("America", "American");
		hash.put("Bangladesh", "Bangladeshi");
		
		//hash.remove("India");
		//hash.clear();
		
		for(String i : hash.keySet()){
			//System.out.println(i);
			System.out.println("Country: " + i + " " +hash.get( i ));
		}
	}

}
