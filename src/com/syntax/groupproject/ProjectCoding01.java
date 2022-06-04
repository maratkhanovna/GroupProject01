package com.syntax.groupproject;

import java.util.Arrays;
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
		System.out.println("Enter "+elements+" different numbers");
		int sum = 0;
		for (int i = 0; i < elements; i++) {
			numbers[i] = input.nextInt();
			sum += numbers[i];
		}
		System.out.println("The sum of all stored elements in that array = " + sum);
		
		System.out.println("-----------Another Way---------");
		
		System.out.println("Please Enter the size of the array that you want to create");
		int arraySize=input.nextInt();
		
		System.out.println("the size of the arrays is "+ arraySize);
		int [] integerArray=new int[arraySize];
		//we can't use enhanced for loop for inserting or updating the values of an array
		System.out.println("Please enter "+arraySize+" elements");
		for(int i=0;i<integerArray.length;i++) {
			integerArray[i]=input.nextInt();
		}
		
		System.out.println(Arrays.toString(integerArray));
		
		sum=0;
		for(int element:integerArray) {
			sum=sum+element;
		}
		
		System.out.println("The sum of all the elemnts is "+sum);	
		
		input.close();
	}
}
