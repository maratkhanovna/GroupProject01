package com.syntax.groupproject;

public class ProjectCoding09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] nums = { 238, 544, 255, 688, 422, 549, -422, 156 };

		int maxNum;
		int minNum;

		if (nums[0] > nums[1]) {
			maxNum = nums[0];
			minNum = nums[1];
		} else {
			maxNum = nums[1];
			minNum = nums[0];
		}
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] > maxNum) {
				maxNum = nums[i];
			} else if (nums[i] < minNum) {
				minNum = nums[i];
			}

		}
		System.out.println("Maximum number is " + maxNum + " and minimum number is " + minNum);
	}

}
