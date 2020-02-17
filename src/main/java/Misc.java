import java.util.ArrayList;

public class Misc {
	
	public Integer sum(ArrayList<Integer> ints) {
		int sum=0;
		for(Integer value:ints) {
			sum += value;
		}
		return sum;
	}
	
	public ArrayList<Integer> extractDigit(ArrayList<Integer> digitList, int number) {		
		if (number > 9) {
			int digit = (number%10);
			digitList.add(digit);
			number = (number-digit)/10;
			extractDigit(digitList, number);
		}
		else			
		{
			digitList.add(number);			
		}		
		
		return digitList;
	}
		
	
	public boolean testPowerSum(Integer number) {
		//12: getting all the different digits in the number
		//using % and / by 10
		//(12%10)= 2 ; (12 - remainder)/10 = 1
		//123: 123%10 = 3; (123-3)/10 = 12 
		//1234: 1234%10 = 4; (1234-4)=1230/10 = 123  find remainder, subtract/divide by then if possible, reiterate
		
		// f1(1234) --> 4; 1230; 123
		// f1 (123)  --> 3; 120; 12
		// f1 (12)  --> 2; 10;1 (<10: end)
		
		//need to store the digits  --> ArrayList
		//need to know how many digits --> length
		//need to raise digits to power, then sum, then test
		
		// >0 Integer, < Integer, 0
		ArrayList<Integer> digitList = this.extractDigit(new ArrayList<Integer>(), number);
		Double power = new Double(digitList.size());
		ArrayList<Integer> poweredDigitsList = new ArrayList<Integer>();
		Double poweredDigit;
		for (Integer value: digitList) {
			poweredDigit = Math.pow(value.doubleValue(),power);
			poweredDigitsList.add(new Integer(poweredDigit.intValue()));
		}
		System.out.println(poweredDigitsList);
		Integer poweredDigitSum = (this.sum(poweredDigitsList)).intValue();
		if (poweredDigitSum==number) {return true;}
		else {return false;}
	}
	
	
	

}
