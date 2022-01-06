package com.from.zenhub;

import java.util.Scanner;

public class GeetaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give first integer: ");
		int n1 = scanner.nextInt();
		System.out.println("Give Second integer: ");
		int n2 = scanner.nextInt();
		System.out.println("The given number are " + n1 + " and " + n2 +".");
		
		GeetaMathImpl geetaMath = new GeetaMathImpl();
		int sum = geetaMath.add(n1, n2);
		int difference = geetaMath.subtract(n1, n2);
		int greater = geetaMath.max(n1, n2);
		int smaller = geetaMath.min(n1, n2);
		int absolute = geetaMath.abs(difference);
		
		System.out.println("The sum of " + n1 + " and " + n2 + " is " + sum);
		System.out.println("The difference of " + n1 + " and " + n2 + " is " + difference);
		System.out.println("The greater of " + n1 + " and " + n2 + " is " + greater);
		System.out.println("The smaller of " + n1 + " and " + n2 + " is " + smaller);
		System.out.println("The absolute of difference between " + n1 + " and " + n2 + " is " + absolute);
	}

}
