package com.from.zenhub;

import java.util.HashMap;

public class PrintTheNameOfMonth {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1, "January");
		hashmap.put(2, "Febraury");
		hashmap.put(3, "March");
		hashmap.put(4, "April");
		hashmap.put(5, "May");
		hashmap.put(6, "June");
		hashmap.put(7, "July");
		hashmap.put(8, "August");
		hashmap.put(9, "September");
		hashmap.put(10, "October");
		hashmap.put(11, "November");
		hashmap.put(12, "December");
		
		for (Number x : hashmap.keySet()){
			System.out.println(x + " " + hashmap.get(x));
		}
	}
}