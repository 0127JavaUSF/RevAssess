package com.revature.assessment;

import java.lang.reflect.Array;
import java.util.Scanner;


public class assessment {

	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int array[] = {5, 6, 10, 15};
		
		int hold = arrayMethod(array);
		
		System.out.println(hold);
		
		System.out.println("please enter a integer.");
		
		
		
		int entered = scanner.nextInt();
		
		boolean doesequalentered = tier1Number4method.isPoweredDigitsEqualToValue(entered);
		
		System.out.print(doesequalentered);
		
	}

	public static int arrayMethod(int[] array) {
		
		int hold = 0;
		
		for(int x = 0; x < Array.getLength(array); x++) {
			
			hold += array[x];
			
		}
		
		return hold;
		
	}

	
}
