

public class mainController {
	
	public static void main(String[] args) {
		
		int[] myArr = {1, 2, 3, 4};
		int[] myArr2 = {-1, 1, -3, 4};
		
		System.out.println(iterIntArray(myArr));
		System.out.println(iterIntArray(myArr2));
		
		System.out.println(weirdExponentTest(11));
		System.out.println(weirdExponentTest(10));

	}
	
	public static int iterIntArray(int[] arr) {

		// resulting sum after interation
		int res = 0;
		
		for(int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		
		// return result
		return res;
		
	}
	
	public static boolean weirdExponentTest(int num) {
		// can raise each digit of num to the power of num's length
		// and return whether SUM[powers] == num.length
		
		int len = numOfDigits(num);
		int myNum = num;
		int sum = 0;
		
		// do so until no digit is left
		while(myNum > 0) {
			// get last digit
			int digit = myNum % 10;
			// add to total sum
			sum += Math.pow(digit, len);
			// get rid of last digit
			myNum /= 10;
		}
		
		if(sum == len) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public static int numOfDigits(int num) {
		
		String str = Integer.toString(num);
		return str.length();
	
	}
	
}
