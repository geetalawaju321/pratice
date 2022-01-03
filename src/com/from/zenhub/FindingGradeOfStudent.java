package com.from.zenhub;

import java.util.Scanner;

public class FindingGradeOfStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a Marks: ");
		int x = scanner.nextInt();
		
		if (x >= 90){
			System.out.println("You have scored Grade A*.");
		}else if ( x>= 80){
			System.out.println("You have scored Grade A.");
		}else if ( x>= 70){
			System.out.println("You have scored Grade B.");
		}else if ( x>=60 ){
			System.out.println("You have scored Grade C");
		}else if ( x>=50 ){
			System.out.println("You have scored Grade E.");
		}else if ( x<50){
			System.out.println("You have scored Grade F.");
		}
	}
}
