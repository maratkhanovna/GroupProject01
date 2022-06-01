package com.syntax.groupproject;

public class ProjectCoding05 {

	public static void main(String[] args) {
		// Create a 2D array of integers.
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		int[][] numbers = {
				{14, 27, 38, 49},
				{53, 62, 75, },
				{81, 96},
		};
		int sumEven=0;
		int sumOdd=0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
			if (numbers[i][j]%2==0) {
				sumEven+=numbers[i][j];
			}else {
				sumOdd+=numbers[i][j];
			}
			}
		}
			System.out.println("Sum of even numbers is "+sumEven);
			System.out.println("Sum of odd numbers is "+sumOdd);

	}

}
