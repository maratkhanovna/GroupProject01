package com.syntax.groupproject;

public class ProjectCoding06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		
		int firstNum = 50;
		int secondNum = 100;
		
		firstNum = firstNum*secondNum;
		secondNum = firstNum/secondNum;
		firstNum = firstNum/secondNum;
		
		System.out.println("After swap: firstNum = "+firstNum+"; secondNum = "+secondNum);		
	}

}
