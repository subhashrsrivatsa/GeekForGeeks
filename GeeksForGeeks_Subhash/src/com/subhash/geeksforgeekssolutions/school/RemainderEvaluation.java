/**
 * 
 */
package com.subhash.geeksforgeekssolutions.school;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Given two positive integers num1 and num2, the task is to find the remainder when num1 is divided by num2.

	Example 1:

	Input:
	num1 = 5
	num2 = 3

	Output:
	2

	Explanation:
	The remainder after dividing 5 by 3 is: 2.
 *
 */
public class RemainderEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 2 numbers of your choice");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		findRemainder(num1,num2);
		
		s.close();
	}

	private static void findRemainder(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1+" is the remainder");
		}
		System.out.println("The Remainder when "+num1+" is divided by "+num2+" is : "+(num1%num2));
		
	}

}
