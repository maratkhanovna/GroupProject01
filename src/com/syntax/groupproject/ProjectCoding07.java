package com.syntax.groupproject;

import java.util.Scanner;

public class ProjectCoding07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		boolean isPrime=true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int givenNumber = input.nextInt();

		for (int i = 2; i <= givenNumber / 2; i++) {
			if (givenNumber%2 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(givenNumber+" is a prime number");
		}else {
			System.out.println(givenNumber+ " is not a prime number");
		}
		input.close();
	}

}
