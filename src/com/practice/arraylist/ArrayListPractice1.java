package com.practice.arraylist;

import java.util.ArrayList;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Black");
		list.add("White");
		list.add("Blue");
		list.add("Green");
		list.add("yellow");
		
		list.remove("Black");
		
		//list.set(1, "Pink");
		
		//list.clear();
		
		for (String i : list){
			System.out.println(i);
		}
		
		//System.out.println(list);
		
		//System.out.println(list.size());
		
		//System.out.println(list.get(3));
	}

}
