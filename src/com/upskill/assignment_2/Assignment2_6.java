package com.upskill.assignment_2;

// Assignment 2 Problem 6: Write a java program to find the prime number from 1 to 100 and print them.

public class Assignment2_6 {

	public static void main(String[] args) {
		primeNumber();
	}
	public static void primeNumber(){
		int upperbound = 100;
		for (int number = 2; number <= upperbound; ++number) {

			int maxFactor = (int) Math.sqrt(number);
			boolean isPrime = true;
			int factor = 2;								// Start checking for factors from 2
			while (isPrime && factor <= maxFactor) {
				if (number % factor == 0) {				// // If number is divisible by factor, and ==0 is the remainder 0 when I divide
					isPrime = false;
				}
				++factor;						// Move to the next possible factor increase factor by 1
			}

			if (isPrime)
				System.out.println(number + " is a prime");
		}
	}
}

