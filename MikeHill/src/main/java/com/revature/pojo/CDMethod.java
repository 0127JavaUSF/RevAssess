package com.revature.pojo;

public class CDMethod {

	
	public static int sum = 0;
	
	public static void main(String[] args) {
	 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		 
 {

		 for (int i=0; i<intArray.length; i++) {
			 
			 sum += intArray[i];

	
		 }		
		 System.out.println(sum);
		
	}

	}
	


}
