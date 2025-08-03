package com.upskill.assignment_2;

/*
 * Assignment 2 Problem 4: Write a for loop upto 500 which will increase the value double every time.
 */

public class Assignment2_4 {

	public static void main(String[] args) {
		doubleValue();

	}

	public static void doubleValue(){
		for (int i = 1; i <= 500; i = i * 2) {
			System.out.println("Double values:" + i);
		}
	}
	
}
