package com.upskill.java_4;

import com.upskill.java_1.MethodTypes;

public class Polymorphism extends MethodTypes {
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car(7);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rent = 2500;
		int bonus = 13000;
		int sideHussle = 24000;
		int newIncome = calculateAnnualIncome + rent + bonus + sideHussle;
		System.out.println("My Annual Income = " + newIncome);
	}
	
	//Method Overloading - Compile time Polymorphism - Static binding 
	//Same method name with different signature to overload
	
	public static void car(){
		System.out.println("My car is Tesla !");
	}
	
	public static void car(int seat){
		System.out.println("My car has Seat : " + seat);
	}
	
	public static void car(String color){
		System.out.println("My car has color : " + color);
	}
	
	public static void car(int door, String hp){
		System.out.println("My car has door : " + door + " It has hp : " + hp);
	}

	
}
