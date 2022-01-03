package com.from.zenhub;

import java.util.Scanner;

public class FindingYoungestAndOldestMathClass {

	public static void main(String[] args) {
		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Age of first person is:");
		x=scanner.nextInt();
		System.out.println("Age of second person is:");
		y=scanner.nextInt();
		System.out.println("Age of third person is:");
		z=scanner.nextInt();
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		
		int maximum = Math.max(max, z);
		int minimum = Math.min(min, z);
		System.out.println("The person with age " + maximum + " is oldest and the person with age " + minimum + " is youngest.");
		scanner.close();
	}
}
