package com.syntax.groupproject;

import java.util.Scanner;

public class ProjectCoding02AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of elements in array");
		int elements = input.nextInt();
		String[] country = new String[elements];
		System.out.println("Please enter any country");

		for (int i = 0; i < elements; i++) {
			country[i] = input.next();
		}
		for (String element : country) {
			if (element.equalsIgnoreCase("USA")) {
				System.out.println("Washington DC");
			} else if (element.equalsIgnoreCase("Turiye")) {
				System.out.println("Ankara");
			} else if (element.equalsIgnoreCase("Thailand")) {
				System.out.println("Bangkok");
			} else {
				System.out.println("Country not supported by My Great java program version 1.0");
			}
		}
		input.close();

	}

}
