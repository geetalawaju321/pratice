package com.from.zenhub;

import java.util.Scanner;

public class FindingYoungestAndOldest {

	public static void main(String[] args) {
		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Age of first person: ");
		x=scanner.nextInt();
		
		System.out.println("Age of second person: ");
		y=scanner.nextInt();
		
		System.out.println("Age of third person: ");
		z=scanner.nextInt(); 
		
		int youngest;
		int oldest; 
		
		if(x>y){
			oldest = x;
			youngest = y;
		}else{
			oldest = y;
			youngest= x;
		}
		
		if(z>oldest){
			oldest = z;
		}
		
		if(z<youngest){
			youngest = z;
		}
		System.out.println("The person with age " + oldest + " is oldest and the person with age " + youngest + " is youngest.");
	}
}
