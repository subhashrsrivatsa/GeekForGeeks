/**
 * 
 */
package com.subhash.geeksforgeekssolutions.school;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

	Example 1:
	
	Input:
	N = 4
	A[] = {1, 2, 3, 4}
	Output:
	1 3
	
	Example 2:
	
	Input:
	N = 5
	A[] = {1, 2, 3, 4, 5}
	Output:
	1 3 5
 *
 */
public class AlternateElementsOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the Array");
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		AlternateElementsOfArray.printaltarray(arr, size);
		s.close();
	}

	private static void printaltarray(int[] arr, int size) {
		for(int i=0;i<size;i+=2) {
			System.out.println(arr[i]);
		}
	}

}
