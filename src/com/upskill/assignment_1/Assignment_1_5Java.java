// Assignment 1: Problem 5. Write a java program which will display name and guestimated age of every students in your class.(write separate method for every student).

package com.upskill.assignment_1;

public class Assignment_1_5Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_1_5Java myObject = new Assignment_1_5Java();
		myObject.guestimateAge1();
		
		guestimateAge2();
		
		int a= guestimateAge3();
		System.out.println("Age of Class 3 is "+a);

	}
	
	public void guestimateAge1(){
		int a=24;
		System.out.println("Age of Class 1 is "+a);
	}
	public static void guestimateAge2(){
		int a=25;
		System.out.println("Age of Class 2 is "+a);
	}
	public static int guestimateAge3(){
		int a=26;
		return a;
	}



}
