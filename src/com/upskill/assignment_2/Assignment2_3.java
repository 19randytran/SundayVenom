package com.upskill.assignment_2;

/*
 * Assignment 2 Problem 3: Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger 
     than other. (hints: using if..else)
 */

public class Assignment2_3 {
	

	public static void main(String[] args) {
		int a = value1();					  //local variable named a type int, calls method name value1()(which returns an int), and = -> assigns the return value (70 from value1()) to variable a
		int b = value2();
		integerValues(a, b);													//pass a and b to another method

	}
	  public static int value1() {
	        return 70;
	    }

	    public static int value2() {
	        return 40;
	    }

	    public static void integerValues(int a, int b) {                                  //parameter method use to recieve value (int a, int b)
	        if (a > b) {
	            System.out.println("1st Function is bigger than 2nd Function");
	        } else if (a < b) {
	            System.out.println("2nd Function is bigger than 1st Function");
	        } else {
	            System.out.println("Both values are equal");
	        }
	    }
}
