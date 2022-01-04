package com.from.zenhub;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(7);
		r = r + 1;
		System.out.println("The Random Number is " + r);	
		}
	}