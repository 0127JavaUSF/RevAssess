package com.revature.assessment;

public class tier1Number4method {

	public static boolean isPoweredDigitsEqualToValue(int entered) {
		
		int checkedNumber = 0;
		
		int numberEntered = entered;
		
		int enteredLength = String.valueOf(entered).length();
		

		
		for(int x = 0; x < numberEntered;) {
			
			int hold = numberEntered % 10;
			

			
			checkedNumber = (int) Math.pow(hold, enteredLength);
			

			
			numberEntered = numberEntered / 10;
			
		}
		
		//check if true
		
		if(checkedNumber != entered) {
			return false;
		}else {
			
			return true;
		}
		
		
		
	}
	
}
