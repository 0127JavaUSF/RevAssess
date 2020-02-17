package com.revature.assessment;

public class Launcher {

	public static void main(String[] args) {
		

		MathHelper mathHelper = new MathHelper();
		
		int[] array = {1, 2, 3, 4};
		long sum = mathHelper.getArraySum(array);

		int[] arrayA = {1, 2, 3, 4, -10};
		long sumA = mathHelper.getArraySum(arrayA);
		
		boolean isEqual = mathHelper.isSumOfPowersEqualToInput(12);
		boolean isEqualA = mathHelper.isSumOfPowersEqualToInput(0);
		boolean isEqualB = mathHelper.isSumOfPowersEqualToInput(1);
	}
}
