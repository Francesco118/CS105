package week06;

import java.util.Scanner;

public class Lab6b {

	public static void main(String[] args) {
		// user input for two whole number
		//input validation
		//
		Scanner in = new Scanner(System.in);
		String input1 = "", input2 = "", answer = "";
		int numb1 = 0, numb2 = 0, numb3 = 0;
		boolean validNumb1 = false, validNumb2 = false, validEndGame = false, GameOver = false;
		
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
		
		numb3 = power(numb1, numb2);

		System.out.println(numb1 + " raised to the power of " + numb2 + " is: " + numb3 + ".");
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
	
	public static int power(int number1, int number2) {
		int product = number1;
		for (int i = 2; i <= number2; i++) {
			product = product * number1;
		}
		return product;
	}
		
		
	}


