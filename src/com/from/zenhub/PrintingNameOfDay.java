package com.from.zenhub;

import java.util.HashMap;

public class PrintingNameOfDay {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1, "Sunday");
		hashmap.put(2, "Monday");
		hashmap.put(3, "Tuesday");
		hashmap.put(4, "Wednesday");
		hashmap.put(5, "Thursday");
		hashmap.put(6, "Friday");
		hashmap.put(7, "Saturday");
		
		for (Number x : hashmap.keySet()){
			System.out.println("Day: " + x + " " + hashmap.get(x));	
		}
	}
}