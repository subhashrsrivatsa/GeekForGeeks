/**
 * 
 */
package com.subhash.geeksforgeekssolutions.school;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Given an array Arr of size N, print second largest element from an array.

	Example 1:
	
	Input: 
	N = 6
	Arr[] = {12, 35, 1, 10, 34, 1}
	Output: 34
	Explanation: The largest element of the 
	array is 35 and the second largest element
	is 34.
	Example 2:
	
	Input: 
	N = 3
	Arr[] = {10, 5, 10}
	Output: 5
	Explanation: The largest element of 
	the array is 10 and the second 
	largest element is 5.
 *
 */
public class SecondLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the Array");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the Array");
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
				
		SecondLargest.print2largest(arr, size);
		s.close();
	}

	private static void print2largest(int arr[], int size) {
		Arrays.sort(arr);
		System.out.println(arr[size-2]+" is the 2nd largest number");
	}

}
