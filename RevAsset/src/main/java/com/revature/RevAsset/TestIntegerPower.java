package com.revature.RevAsset;

public class TestIntegerPower {
	public int number;
	public String num;
	public int pow;
	public int digit1;
	public int digit2;
	public int digit3;
	public char dgt1;
	public char dgt2;
	public char dgt3;
	public int sum;
	public int power;
	
	TestIntegerPower(int n) {
		super ();
		this.number = n;
		
	}
	public int countDigit () {
		num = Integer.toString(number);
		
		for (int i = 0; i< num.length(); i++) {
			pow = i;
		}
		return pow;
	}
	
	public void getDigit() {
		dgt1= num.charAt(0);
		dgt2 = num.charAt(1);
		dgt3 = num.charAt(2);
		digit1 = dgt1;
		digit2 = dgt2;
		digit3 = dgt3;
	}
	
	public int sumDigits() {
		sum = (digit1 ^ pow) + (digit2 ^ pow) + (digit3 ^ pow);
		return sum;
	}
	
	public void CompareSumtoInt () {
		if (sum > number) {
			System.out.println("Sum of digits is " + sum + " gretaer than original number,");
		} else if (sum < number) {
			System.out.println("Sum of digits is " + sum + "less than original number,");
		} else
			System.out.println("Sum of digits is " + sum + "equal to original number,");

			
	}

}
