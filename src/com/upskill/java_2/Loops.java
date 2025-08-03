package com.upskill.java_2;

public class Loops {

/*
 	Types of Loops
 	1. For Loop
 	2. While Loop
 	3. Do While Loop
 	4. Infinite Loop
 	
 */
	public static void main(String[] args) {
		/*practiceForLoop();
		practiceForLoop2();
		practiceWhileLoop(); 
		practiceDoWhileLoop();
		practiceInfinitieLoop();*/
		practiceNestedForLoop();
		
		

	}
//For Loop
	public static void practiceForLoop(){								// For Loop - Do again and again upto upper limit
		int i;															//Initialize the variable
		for (i=1; i<=10; i++){											// Setting Lower limit, Upper limit, Increment 
			System.out.println("For Loops number = " +i);				// Statement
		}
	}
		public static void practiceForLoop2(){								// For Loop - Do again and again upto upper limit
			int i;															//Initialize the variable
			for (i=10; i>=1; i--){											// Setting Upper limit, Lower limit, Decrement
				System.out.println("For Loops number = " +i);				// Statement
			}
	}
	
	//While Loop
	public static void practiceWhileLoop(){								//While Loop - Do again and again upto condition match
		int i=1;														// Initialize the Variable
		while (i<=10){													//Setting Condition
			System.out.println("While Loops number = " +i);				//Statement
			i++;														// Increment or decrement
		}
	}
	
	//Do While Loop
	public static void practiceDoWhileLoop(){							//Do While Loop - Do action then match condition
		int i = 1;														//Initialize the variable
		do {
			System.out.println("Do While Loops number = " +i);         //Statement
			i++;														// Increment or decrement
		} while (i<=0);													// Checking condition
	}
	
	//Infinite Loop
		public static void practiceInfinitieLoop(){							// Infinite Loop - never ending loop
			int i;															//Initialize the variable
			for (i=1; ; i++){												// Setting no upper limit
				System.out.println("Infinite Loops number = " +i);			// Statement
			}
		}
		
		//Nested Loop
		public static void practiceNestedForLoop(){							//Nested Loop - loop inside another loop
			int i;															//Loop 1 - Initialize i
			int j;															//Loop 2 - Initialize j
			for (i = 1; i <= 10; i++){										// Loop 1 - Setting lower limit, Upper limit, Increment or decrement
				for (j = 1; j <= 10; j++){									//Loop 2 - Setting lower limit, Upper limit, Increment or decrement
					int multiplicationTable = i * j;						//Loop 2 - Statement	
					System.out.print(multiplicationTable + " ");
				}
				System.out.println(" ");									//Loop 1- Statement
			}
		}
}

		

