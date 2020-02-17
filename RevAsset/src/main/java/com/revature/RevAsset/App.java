package com.revature.RevAsset;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner console = new Scanner (System.in);
	public static int number;
    public static void main( String[] args )
    {
        System.out.println( "Enter 3 digits Integer " );
        number = console.nextInt ();
        TestIntegerPower tip = new TestIntegerPower(number);
        tip.countDigit();
        tip.getDigit();
        tip.sumDigits();
        tip.CompareSumtoInt();
        
        ArraySum asum = new ArraySum ();
        asum.sumArray();
        
        User user = new User (123456, "Bob", "Evans", "BE123", "123456", "Manager");
        user.UserOutput();
    }
}
