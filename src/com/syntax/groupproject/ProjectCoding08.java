package com.syntax.groupproject;

public class ProjectCoding08 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int first = 0;
		int second = 1;
		
		for (int i=1; i<=10; i++) {
			System.out.print(first+" ");
			int next = first+second;
			first=second;
			second=next;
		}

	}

}
