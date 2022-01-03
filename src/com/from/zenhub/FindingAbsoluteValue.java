package com.from.zenhub;

import java.util.Scanner;

public class FindingAbsoluteValue {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number:");
		x = scanner.nextInt();
		
		if(x<0){
			x=x*(-1);	
		}
		System.out.println("The absolute value of given number is " + x );
	}
}
