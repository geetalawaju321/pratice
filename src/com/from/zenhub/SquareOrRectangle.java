package com.from.zenhub;

import java.util.Scanner;

public class SquareOrRectangle {

	public static void main(String[] args) {
		int length;
		int breadth;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = scanner.nextInt();
		
		System.out.println("Enter the breath:");
		breadth = scanner.nextInt();
		
		if(length==breadth){
			System.out.println("The geometry shape is Square.");
		}else {
			System.out.println("The geometry shape is Rectangle.");
		}
		int a = length*breadth;
		int p = 2*(length + breadth);
		
		System.out.println("The area of geometry shape is:" + a + " and the perimeter of the square is: " + p);	
	}
}
