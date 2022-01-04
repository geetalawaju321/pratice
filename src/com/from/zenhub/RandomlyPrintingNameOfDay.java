package com.from.zenhub;

import java.util.Random;

public class RandomlyPrintingNameOfDay {

	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(7);
		r = r + 1;
		//System.out.println(r);
		if (r == 1){
			System.out.println("Sunday");
		}else if (r == 2){
			System.out.println("Monday");
		}else if (r == 3){
			System.out.println("Tuesday");
		}else if (r == 4){
			System.out.println("Wednesday");
		}else if (r == 5){
			System.out.println("Thursday");
		}else if (r ==6){
			System.out.println("Friday");
		}else if (r == 7){
			System.out.println("Saturday");
		}
	}
}
