package com.from.zenhub;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Radius of circle: ");
		double radius = scanner.nextDouble();
		double area = 3.14 * Math.pow(radius, 2);
		System.out.println("The Area of the circle with Radius " + radius + " is "+ area + "." );
		scanner.close();
	}
}
