package com.from.zenhub;

import java.util.ArrayList;
import java.util.Scanner;

public class AscendingSortArrayList {

	public static void main(String[] args) {
		//1
		Scanner scanner = new Scanner(System.in);
		int tempValue;
		//2
		System.out.println("Enter number of array elements : ");
		int size = scanner.nextInt();
		//3
		int[] numArray = new int[size];
		//4
		for (int i = 0; i < size; i++){
			System.out.println("Enter element : ");
			numArray[i] = scanner.nextInt();
		}
		//5
		System.out.println("You have entered : ");
		for (int i = 0; i < size - 1; i++){
			System.out.println(numArray[i] + ",");
		}
		System.out.println(numArray[numArray.length - 1]);
		//6
		for (int i = 0; i < numArray.length; i++){
			for (int j = i + 1; j < numArray.length; j++){
			//7
				if (numArray[i] > numArray[j]){
					tempValue = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = tempValue;
				}
			}
		}
		//8
		System.out.println("Final array after the sorting : ");
		for (int i = 0; i < size - 1; i++){
			System.out.println(numArray[i] + ",");
		}
		System.out.println(numArray[numArray.length - 1]);
	}
}
