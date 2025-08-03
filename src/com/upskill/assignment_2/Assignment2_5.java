package com.upskill.assignment_2;

//Assignment 2 Problem 5: Write a program in Java to display the multiplication table of (eight)8.

public class Assignment2_5 {

	public static void main(String[] args) {
		multiplication();

	}
	
	public static void multiplication() {
		for (int row = 1; row <= 8; row++) {					// Outer loop (row) control which row you're on from 1 to 8
			for (int col = 1; col <= 8; col++) {				// inner loop (col) control which column you're on from 1 to 8 within that row
				int MultiplicationTable = row * col;			// calculates the value for each cell
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");				// <-- This is outside the inner loop, inside the outer loop in order for the output to be formatted as rows
		}
	}

}
