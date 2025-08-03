package com.upskill.java_1;

public class MethodTypes {
	
	/* Types of Methods
	
	1. Void Method
	2. Static Metod
	3. Return Type Metod
*/
	
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
	}
	
	public static int hourlyIncome = 65;
	
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//Return Type Method
	public int monthlyIncomeReturn(){
	int calculateMonthlyIncome = hourlyIncome * 200;
	return calculateMonthlyIncome;
	}
	
	public String name (){
		return "UpSkill";
	}
	
	public boolean isRaining(){
		return false;
	}
	
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
}