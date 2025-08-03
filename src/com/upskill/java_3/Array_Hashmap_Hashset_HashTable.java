package com.upskill.java_3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;

//Non primative datatype

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String[] args) { 
		
		// Array store multiple data using index
		
		int age = 30;														//Variable store only one data
		int [] ageVenom = new int []{25, 32, 29, 23, 19, 18};				//Array  store multiple data
		
		//Array index 				[0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageVenom[0]);
		System.out.println("Total Student : " + ageVenom.length);
		
		
		String [] nameVenom = new String []{"Randy", "John", "Mike", "Nick", "Nate"};
		System.out.println("Stduent Name : " + nameVenom[0]);
		System.out.println("Total Student : " + nameVenom.length);
		
		
		//Multi-Dimentional Array
		int[][] ageVenom2D = {{25, 32, 29, 23, 19, 18},					//[0][0]  [0][1]  [0][2]  [0][3]  [0][4]
							 {25, 31, 27, 24}};							//[1][0]  [1][1]  [1][2]  [1][3]  
		
		System.out.println("Stduent Age 2D : " + ageVenom2D[0][0]);
		
		
		//Hashmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Siam", 18);
		Student.put("Randy", 24);
		Student.put("Jui", 23);
		Student.put("Fokrul", 25);
		
		System.out.println("HashMap Stduent Age : "+ Student.get("Randy"));
		
		//Country, Capital
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("United States", "Washington DC");
		Capital.put("United Kingdom", "London");
		Capital.put("Canada", "Ottawa");
		Capital.put("Brazil", "Brasilia");
		Capital.put("BD", "Dhaka");
		
		System.out.println("Capital City : " + Capital.get("United States"));

		
		//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified) 
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("United States", "North America");
		
		System.out.println("Region : " + Region.get("United States"));
		
		//Hashset Store unordered collection containing unique value, Implementation of Set interface  (no duplicates)
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);	
	};
}
