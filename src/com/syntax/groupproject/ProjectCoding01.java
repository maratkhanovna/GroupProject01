package com.syntax.groupproject;

import java.util.Scanner;

public class ProjectCoding01 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of elements in array");
		int elements = input.nextInt();
		int[] numbers = new int[elements];
		System.out.println("Enter different numbers starting with zero");
		input.nextInt();
		int sum = 0;
		for (int i = 1; i < elements; i++) {
			numbers[i] = input.nextInt();
			sum += numbers[i];
		}
		System.out.println("The sum of all stored elements in that array = " + sum);
		input.close();
	}
}
