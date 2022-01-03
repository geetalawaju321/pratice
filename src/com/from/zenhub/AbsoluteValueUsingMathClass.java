package com.from.zenhub;

import java.util.Scanner;

public class AbsoluteValueUsingMathClass {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number: ");
		x=scanner.nextInt();
		
		x= Math.abs(x);
		System.out.println("Absolute value of given number is " + x);
	}
}