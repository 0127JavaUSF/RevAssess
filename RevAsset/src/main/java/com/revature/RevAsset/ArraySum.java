package com.revature.RevAsset;

public class ArraySum {
	int sum;
	int [] number = {1, 2, 3, 4, 5, 6};
	
	public void sumArray () {
		for (int i = 0; i < number.length; i++) {
			sum +=number[i];
		}
		System.out.println ("Sum of Array is " + sum);
	}
}