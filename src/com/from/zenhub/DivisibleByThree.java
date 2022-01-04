package com.from.zenhub;

import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give any number: ");
		int x = scanner.nextInt();
		
		if (x % 3 == 0){
			System.out.println(x + " is exactly divisible by 3.");
		}else{
			System.out.println(x + " is not exactly divisible by 3.");
		}
		scanner.close();
	}
}
