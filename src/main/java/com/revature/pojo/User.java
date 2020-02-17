package com.revature.pojo;


public class User {
private int id;
private String firstName, lastName, username, password, role;


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

//public static int powerLengthRaiser() {
//	int x;
//	return 
//}

          
   

	
	public static void main(String[] args) {
/* 		Create a method that iterates over an integer array and returns their sum.
		Value: 30 points

		Create a method that, given an integer, can raise each digit to the power of the overall length and return whether the sum of the powers is equal to the original integer.
		Value: 40 points
*/
		iterateSum();
	}

}
