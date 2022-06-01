package com.syntax.groupproject;

public class ProjectCoding04 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		int[][] nums = { { 14, 27, 38, 49 }, { 53, 62, 75, }, { 81, 96 }, };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] % 2 == 0) {
					System.out.println(nums[i][j] + " ");
				}
			}
		}
	}
}
