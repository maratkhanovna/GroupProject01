package com.syntax.groupproject;

public class ProjectCoding03 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] numbers = {
				{14, 27, 38, 49},
				{53, 62, 75, },
				{81, 96},
		};
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				sum=sum+numbers[i][j];				
			}			
		}
		System.out.println("Sum of all numbers = "+sum);
	}

}
