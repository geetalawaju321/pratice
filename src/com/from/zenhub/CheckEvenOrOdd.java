package com.from.zenhub;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int x = scanner.nextInt();
		
		if(x % 2 == 0){
			System.out.println( x + " is  Even.");
		}else{
			System.out.println(x + " is odd.");
		}
	}
}
