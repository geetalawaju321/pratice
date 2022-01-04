package com.from.zenhub;

import java.util.Random;

public class GenerateRandomNumberetweenOneAndTwelve {

	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(12);
		r = r + 1;
		System.out.println("The Random number is " + r);
	}
}
