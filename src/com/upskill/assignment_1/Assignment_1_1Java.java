// Assignment 01: 1. A triangle three arms are: 5, 7 and 11 inches. Write a method to display the perimeter of triangle in console output.

package com.upskill.assignment_1;

public class Assignment_1_1Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trianglePerimeter();
	}
	public static void trianglePerimeter() {
		int a = 5;
		int b = 7;
		int c = 11;
		int perimeter = a+b+c;
		System.out.println("The Perimeter of Triangle with arms 5, 7, 11 is " + perimeter);
	}

}
