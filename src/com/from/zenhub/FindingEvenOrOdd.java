package com.from.zenhub;

import java.util.Scanner;

public class FindingEvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give any number: ");
		int x = scanner.nextInt();
		
		if (x % 2 == 0){
			System.out.println(x + " is a Even.");
		}else{
			System.out.println(x + " is a Odd.");
		}
		scanner.close();
	}
}
