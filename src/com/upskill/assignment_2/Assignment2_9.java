package com.upskill.assignment_2;

//Assignment 2 Problem 9: Write a program to swap two string variables (Talen, Tech) and display result on the screen.

public class Assignment2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapVar();
	}
	
	public static void swapVar(){
		String a = "Talen";
		String b = "Tech";
		
		String swap = a;
		a = b;
		b = swap;
		
		System.out.println("Swap value a: "+a);
		System.out.println("Swap Value b: "+b);
	}


}
