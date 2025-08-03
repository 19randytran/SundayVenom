// Assignment 1: Problem 4 A function returns 30, another function returns 50. Write a java program which will display subtraction value from bigger number to smaller.

package com.upskill.assignment_1;

public class Assignment_1_4Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallerValue(); 
		biggerValue();
		int a=smallerValue();
		int b=biggerValue();
		System.out.println("This is the subtraction value from bigger to smaller " + (b-a));

	}
	public static int smallerValue(){
		return 30;
	}
	public static int biggerValue(){
		return 50;
	}

}
