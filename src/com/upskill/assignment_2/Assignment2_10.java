package com.upskill.assignment_2;
import java.util.Scanner;

//Assignment 2 Problem 10: Write a Java program to convert temperature from Fahrenheit to Celsius degree. 

public class Assignment2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Degree Fahrenheit: ");
		double a = s.nextInt();
		s.close();
		tempDegree(a);
	}
	
	public static void tempDegree(double a){
		double fahrenheit = 0;
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;

		System.out.println("The Equivalent of celsius is: ");
		System.out.println(celsius);
	}


}
