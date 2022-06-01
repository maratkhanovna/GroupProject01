package com.syntax.groupproject;

public class ProjectCoding11 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?
		String[] furniture = {"Sofa", "Chair", "Table", "Bed", "Chair"};
		
		for (int i =0; i<furniture.length; i++) {
			for (int j=i+1; j<furniture.length; j++) {
				if (furniture[i]==furniture[j])
					System.out.println("The duplicate element is "+furniture[j]);
			}
		}
	}

}
