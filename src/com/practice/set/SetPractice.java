package com.practice.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		//System.out.println(h.isEmpty());
		System.out.println(h.size());
		
		h.add("Nepal");
		//System.out.println(h.isEmpty());
		System.out.println(h.size());

		h.add("USA");
		System.out.println(h.size());
		h.add("Australia");
		System.out.println(h.size());
		
		h.add("Nepal");
		System.out.println(h.size());
		
		System.out.println(h);
		
		h.remove("Australia");
		System.out.println("Set after removing" +  " Autrialia:" +  h);
		
		
		
		

	}

}
