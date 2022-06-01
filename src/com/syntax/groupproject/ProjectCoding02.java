package com.syntax.groupproject;

import java.util.Scanner;

public class ProjectCoding02 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */
		Scanner input = new Scanner(System.in);
		String capital = null;
		System.out.println("Enter the numbers of elements in array");
		int elements = input.nextInt();
		String[] country = new String[elements];
		System.out.println("Please enter any country");
		input.nextLine();
		for (int i = 0; i < elements; i++) {
			country[i] = input.nextLine();
			switch (country[i].toLowerCase()) {
			case "kazakhstan":
				capital = "Astana";
				break;
			case "malaysia":
				capital = "Kuala-Lumpur";
				break;
			case "china":
				capital = "Beijing";
				break;
			case "france":
				capital = "Paris";
				break;
			case "japan":
				capital = "Tokyo";
				break;
			case "italy":
				capital = "Rome";
				break;
			}
			System.out.println("The capital of " + country[i] + " is " + capital);
		}
		input.close();
	}

}
