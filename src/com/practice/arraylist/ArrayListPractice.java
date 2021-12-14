package com.practice.arraylist;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		System.out.println(list.size());
		
		list.add("Nepal");
		System.out.println(list.size());
		list.add("USA");
		System.out.println(list.size());
		list.add("Austrialia");
		System.out.println(list.size());
		
		list.add("Nepal");
		System.out.println(list.size());
		System.out.println(list);

	}

}
