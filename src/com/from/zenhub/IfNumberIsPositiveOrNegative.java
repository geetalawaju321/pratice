package com.from.zenhub;

import java.util.Scanner;

public class IfNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give any integer: ");
		int x = scanner.nextInt();
		
		if (x > 0){
			System.out.println(x + " is a postive number.");
		}else if (x < 0){
			System.out.println(x + " is a negative number.");	
		}else if (x == 0){
			System.out.println(x + " is neither positive nor negative.");
		}
		scanner.close();
	}
}