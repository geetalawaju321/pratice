package com.practice;

import java.util.HashMap;

public class HashMapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>hash=new HashMap<String,String>();
		hash.put("Nepal", "Kathmandu");
		hash.put("China", "Beigine");
		hash.put("India", "Delhi");
		hash.put("Bhutan", "Thimpu");
		hash.put("USA", "Washington");
		for (String i :hash.keySet()) {
			System.out.println(i);
		}	
	
	}

}
