package com.from.zenhub;

import java.util.Scanner;

public class FindingGreaterNumber {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("First unequal number is:");
		num1 = scanner.nextInt();
		System.out.println("Second unequal number is:");
		num2 = scanner.nextInt();
		
		if(num1>num2){
			System.out.println("num1 is greater than num2 by " + (num1 - num2) + " point");
		}else{
			System.out.println("num1 is smaller than num2 by " + (num2 - num1) + " point");
		}
	}
}
