package com.revature.assessment;

import com.revature.assessment.interfaces.IMathHelper;

public class MathHelper implements IMathHelper {

	@Override
	public long getArraySum(int[] array) {
		
		//if null or length = 0
		if(array == null || array.length == 0) {
			return 0;
		}
		
		//for each value in array, add sum
		long sum = 0;
		for(int i : array) {
			sum += i;
		}
		
		return sum;
	}

	@Override
	public boolean isSumOfPowersEqualToInput(int input) {
		
		//per instructor, assume input is positive
		
		String inputString = Integer.toString(input);
		int length = inputString.length();
		
		long sum = 0;
		for(int i = 0; i < length; i++) {
			
			char digitChar = inputString.charAt(i);
			
			int digit = Character.getNumericValue(digitChar);
			
			long result = (long)Math.pow(digit, length);
			sum += result;
		}
		
		if(sum == input) {
			return true;
		}
		
		return false;
	}
}
