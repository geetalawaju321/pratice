package com.from.zenhub;

import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give any number: ");
		int x = scanner.nextInt();
		
		if (x % 5 == 0){
			System.out.println(x + " is exactlty divisible by 5.");
		}else {
			System.out.println(x + " is not exactly divisible by 5");
		}
		scanner.close();
	}
}
