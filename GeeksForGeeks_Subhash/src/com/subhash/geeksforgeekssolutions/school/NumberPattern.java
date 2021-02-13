/**
 * 
 */
package com.subhash.geeksforgeekssolutions.school;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * You a given a number N. You need to print the pattern for the given value of N. 
	for N = 2 the pattern will be 
	2 2 1 1
	2 1
	for N = 3 the pattern will be 
	3 3 3 2 2 2 1 1 1
	3 3 2 2 1 1
	3 2 1
	
	Example 1:
	
	Input: 2
	Output:
	2 2 1 1 
	2 1 
	
	Example 2:
	
	Input: 3
	Output:
	3 3 3 2 2 2 1 1 1 
	3 3 2 2 1 1 
	3 2 1 
 *
 */
public class NumberPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int n = s.nextInt();
		System.out.println("The pattern is : ");
		while(n!=0)
		{
			for(int i=n; i>0; i--) {
				System.out.print(n);
			}
			System.out.println();
			n--;
		}
		s.close();
	}

}
