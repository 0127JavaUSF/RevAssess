
public class CoolCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkingIfEqual(4);
	}

	
	//	Create a method that iterates over an integer array and returns their sum.
	
	 
	  int iterableSum() {
		
		
		int sum(int array[], int n)  
		{  
		    int total = 0; // initialize sum  
		  
		    // Iterate through all elements  
		    // and add them to sum  
		    for (int i = 0; i < n; i++)  
		    total += array[i];  
		  
		    return total;  
	}
	
	  }
		//d.	Create a method that, given an integer, can raise each digit to the 
		//power of the overall length and return whether the sum of the powers
	  //is equal to the original integer.
	 
	   static void checkingIfEqual(int number) {
		
		  number = 50;
		  
		  int length = String.valueOf(number).length();
		 
		int test = (int) Math.pow(number, length);
				//Math.pow(2, 4);
		  
		  if( number == length) {
				   System.out.println("The sum of the powers is equal to the original integer");
				   
		  }
		  else {
			  System.out.println("The sum of the powers is not equal to the original integer");
		  }
	  }
	  
	
	 
	
	
	
	
}
