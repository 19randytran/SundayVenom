//Assignment 1: Problem 3. A function which returns the multiply value of a and b where a = 9 and b = 11.  Write a program which will display addition of a +b + function returns value.

package com.upskill.assignment_1;

public class Assignment_1_3Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnValue();
		int a=9;
		int b=11;
		int c=returnValue();
		System.out.println("This is the return value after multiplying the two values and adding after " + (a+b+c));

	}

	public static int returnValue(){
		int a=9;
		int b=11;
		int c=a*b;
		return c; 
	}

}
