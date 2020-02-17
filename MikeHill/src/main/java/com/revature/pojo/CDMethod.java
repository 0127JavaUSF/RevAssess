package com.revature.pojo;

public class CDMethod {

	
	public static int sum = 0;
	public static int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	
	public static void main(String[] args) {
	 
		 calculate(intArray);
		


	}
	
	public static void calculate(int [] intArray) {
		
		 {

			 for (int i=0; i<intArray.length; i++) {
				 
				 sum += intArray[i];

		
			 }		
			 System.out.println(sum);
			 sum = 0;
			
		}
	}
	


}
