package com.revature.pojo;

public class IteratorSum {
	static int iterateSum() {
		int[] array = {1, 2, 3, 4, 5};
		int sum = 0;

		//Advanced for loop
		for( int num : array) {
		sum = sum+num;
		}
		System.out.println("Sum of the integers found in the array: "+sum);
		return sum;
		}         
		   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
iterateSum();
	}

}
