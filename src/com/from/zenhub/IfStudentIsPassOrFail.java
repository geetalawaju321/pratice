package com.from.zenhub;

import java.util.Scanner;

public class IfStudentIsPassOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide Marks: ");
		int x = scanner.nextInt();
		
		if (x >= 40){
			System.out.println("Congratulations, You are Pass.");
		}else if (x < 40){
			System.out.println("You are Fail.Better luck next time.");
		}
		scanner.close();
	}
}
