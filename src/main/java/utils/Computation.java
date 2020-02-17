package utils;
import java.lang.Math;
import java.util.ArrayList; 
public class Computation {
	
	
	public static int sumOfInts(int[] intarr) {
		int sum = 0;
		for (int anint:intarr){
			sum += anint;
			
		}
		return sum;
		
	}
	
	public static boolean powerOfLength(int anint) {
		  String astring = Integer.toString(anint);

		  char[] intsAsChars = astring.toCharArray();//got individual numbers as chars
		  double[] intsToThePower = new double[(int)astring.length()];
		  int integerLength = astring.length();//got overall length
		
		  int sumOfIntsRaised = 0;
		  
		  
		  
		  for(int i=0; i<intsAsChars.length; i++) {
			  intsToThePower[i] = Math.pow((double)Character.getNumericValue(intsAsChars[i]), (double)integerLength);//raise to the power of overall length
			  //raise each digit to the power of overall length

			  System.out.println("Int "+ intsAsChars[i] + " raised to power "+ integerLength + " is: " + intsToThePower[i] );
			  sumOfIntsRaised += (int)intsToThePower[i];
			  System.out.println("The sum of ints raised to power of length so far is... " + sumOfIntsRaised);
		  }
		  //sum of powers equals original?
		  boolean isEqualToOriginal = false;
		  if(sumOfIntsRaised == anint) {
			  isEqualToOriginal = true;
		  }
		  
		  
		  
		  return isEqualToOriginal;
		  

	}

}
