package com.syntax.groupproject;

import java.util.Arrays;

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
		
		System.out.println("-------------AnotherWay-------");
		
		Arrays.sort(nums);// it will sort and print array in right order
		System.out.println(Arrays.toString(nums)); 
		System.out.println(nums[0]);
		System.out.println(nums[nums.length-1]); // last index is always size-1
		System.out.println(nums[nums.length-2]);
		
		System.out.println("-------------Another Way----------");
		
		int maxNum=nums[0];
		secondLargest=nums[0];
		for (int num:nums) {
			if(num>maxNum) {
				secondLargest=maxNum;
				maxNum=num;				
			}
			if(num>secondLargest && secondLargest<maxNum && num<maxNum) {
				secondLargest=num;
			}
		}
		System.out.println(maxNum);
		System.out.println(secondLargest);
	}
}
