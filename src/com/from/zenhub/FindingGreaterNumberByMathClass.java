package com.from.zenhub;

import java.util.Scanner;

public class FindingGreaterNumberByMathClass {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number is:");
		num1 = scanner.nextInt();
		
		System.out.println("Second number is;");
		num2 = scanner.nextInt();
		
		int x = Math.max(num1 , num2);
		int y = Math.subtractExact(num1,num2);
		
		System.out.println("The greater number is:" + x + " by "+ Math.abs(y) + " point");
	}
}
