package com.from.zenhub;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		System.out.println("Enter the number 1 : ");
		int intOne = scanner.nextInt();
		hashSet.add(intOne);
		
		System.out.println("Enter the number 2 : ");
		int intTwo = scanner.nextInt();
		hashSet.add(intTwo);
		
		System.out.println("Enter the number 3 : ");
		int intThree = scanner.nextInt();
		hashSet.add(intThree);
		
		System.out.println("Enter the number 4 : ");
		int intFour = scanner.nextInt();
		hashSet.add(intFour);
		
		System.out.println("Enter the number 5 : ");
		int intFive = scanner.nextInt();
		hashSet.add(intFive);
		
		System.out.println(hashSet);
	}
}
