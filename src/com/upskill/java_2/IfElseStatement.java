package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		
		int age = 105;
		
		if (age < 13){										//Conditional Statement
			System.out.println("You are children");
		} else if(age >=13 && age <18){
			System.out.println("You are Teenager");
		} else if (age > 60){ 								
			if (age <100){									//Nested if else, one if else you put it inside another if else
			System.out.println("You are a Senior");
			} else {
				System.out.println("You are Champion");
			}
	
		} else {
			System.out.println("You are adult");
		}
		
/*		
		if(condition){
			Statement 1
		} else {
			Statement 2
		}
*/
	}
}