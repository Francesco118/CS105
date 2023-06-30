package week06;

import java.util.Scanner;

public class Lab6a {
			
		public static void main(String[] args) {
		// Declare the variables to be analyzed
		
		String input1 = "", input2 = "", input3 = "", answer ="";
			
		int numb1 = 0, numb2 = 0, numb3 = 0;
		
		boolean validNumb1 = false, validNumb2 = false, validNumb3 = false, validEndGame = false, GameOver = false;
		
		Scanner in = new Scanner(System.in);
		System.out.println("This program will ask the user for three numbers and determine which of the three is the largest.");
		//numeric input validation
		//largest = validNumber(numb1, numb2, numb3);
		do {
			
		do { //Numb1 validation
			System.out.println("Enter the first number: ");
			input1 = in.nextLine();
			try {
				numb1 = Integer.parseInt(input1);
				validNumb1 = true;
			}catch (Exception e){
				System.out.println("Error: Please enter a whole number.\n");
				validNumb1 = false;
			}
		} while (!validNumb1);
		
		do { //Numb2 validation
			System.out.println("Enter the second number: ");
			input2 = in.nextLine();
			try {
				numb2 = Integer.parseInt(input2);
				validNumb2 = true;
			}catch (Exception e){
				System.out.println("Error: Please enter a whole number.\n");
				validNumb2 = false;
			}
		} while (!validNumb2);
		
		do { //Numb3 validation
			System.out.println("Enter the third number: ");
			input3 = in.nextLine();
			try {
				numb3 = Integer.parseInt(input3);
				validNumb3 = true;
			}catch (Exception e){
				System.out.println("Error: Please enter a whole number.\n");
				validNumb3 = false;
			}
		} while (!validNumb3);
		 
		
		System.out.printf("The largest number is: %d", largestNumber(numb1, numb2, numb3));
		System.out.println("\n");
		validEndGame = false;
		
		while (!validEndGame) {
			System.out.println("Do yo want to keep playing? [Y/N]");
			answer = in.nextLine(); 
			if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) { 
				if (answer.equalsIgnoreCase("Y")) {
					validEndGame = true; 
					GameOver = false; 
				} 
				else {
					System.out.println("Thanks for playing. Bye!"); 
					validEndGame = true; 
					GameOver = true; 
					} 
			} 
			else { 
				System.out.println("Wrong input."); 
			} 
			}
		} while (!GameOver);
		}
		
		
		  public static int largestNumber(int number1, int number2, int number3) { 
			  
			  if (number1 > number2 && number1 > number3) {
				  return number1;
			  } else if (number2 > number1 && number2 > number3){
				  return number2;
			  } else {
				  return number3;
			  }
			  
		  }
		 

}
