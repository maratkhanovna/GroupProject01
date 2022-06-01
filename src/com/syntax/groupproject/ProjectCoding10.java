package com.syntax.groupproject;

public class ProjectCoding10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] nums = { 238, 544, 255, 688, 422, 549 };

		int secondLargest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++)
				if (nums[i] > nums[j]) {
					secondLargest = nums[j];
				}
		}
		System.out.println("The second largest number is " + secondLargest);
	}
}
