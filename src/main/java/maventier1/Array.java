package maventier1;

public class Array {

	public static void main(String[] args) {
		
		System.out.println(returnArray(0));
	}

	public static int returnArray(int sum) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static int powerMethod(int sum) {

		
		//producing number that i don't understand
		
		int number = 123;
		
		System.out.println(Integer.toString(number).length());
		Integer.toString(number).length();
		
		//Integer.toString(number);
		String.valueOf(number);
		
		char[] digit = Integer.toString(number).toCharArray();
		
		int pow1 = digit[0] * Integer.toString(number).length();
		int pow2 = digit[1] * (char) Integer.toString(number).length();
		int pow3 = digit[2] * (char) Integer.toString(number).length();
		
		
		// these two spilt are 1 and 3 respectively. But is producing a number in the thousands
		Math.pow(digit[0], Integer.toString(number).length()); 
		
		return sum;
		
	}
}