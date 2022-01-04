package com.from.zenhub;

import java.util.Scanner;

public class ExactlyDivisibleByFiveOrThree {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Give any number: ");
	int x = scanner.nextInt();
	if (x % 5 == 0 && x % 3 == 0){
		System.out.println(x + " is exactly divisible by both 5 and 3.");
	}else if (x % 5 == 0){
		System.out.println(x + " is exactly divisible by 5.");	
	}else if (x % 3 == 0){
		System.out.println(x + " is exactly divisible by 3.");
	}else{
		System.out.println(x + " is not divisible by 5 and 3.");
	}
	scanner.close();
	}
}