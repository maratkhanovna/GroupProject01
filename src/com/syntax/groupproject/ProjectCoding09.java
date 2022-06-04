package com.syntax.groupproject;

public class ProjectCoding09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] nums = { 238, 544, 255, 688, 422, 549, -422, 156 };

		int maxNum=nums[0];
		int minNum=nums[1];

		
		for (int num:nums) {
			if (num > maxNum) {
				maxNum = num;
			}
			if (num<minNum) {
				minNum=num;
			}

		}
		System.out.println("Maximum number is " + maxNum + " and minimum number is " + minNum);
	}

}
