package com.from.zenhub;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (int x = 1;x <= 5; x++){
			System.out.println("Enter the number " + x +" : ");
			int value = scanner.nextInt();
			hashSet.add(value);
		}
		System.out.println(hashSet);
	}
}