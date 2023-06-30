package week04;

import java.lang.Math;
import java.util.Scanner;

public class Lab4c {  //Guessing Game

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String userInput = "";
		String answer;
		
		int userGuess = 0;
		
		//int randNum = (int)(Math.random() * (upperLimit - lowerLimit + 1) )+ lowerLimit;
		boolean GameOver = false;
		boolean userWin = false;
		boolean validGuess = false;
		boolean valid = false;
		
		
		int max = 100;
		int min = 1;
		int range = max - min + 1;
		int randNum = (int)(Math.random() * range) + min;
		
		int guessCount = 0;
		
		System.out.print("This program is a guessing game.\r\n"
				+ "The computer will generate a random integer between 1 and 100. The user will try to guess the number.\r\n"
				+ "Let's get started!");
		
		while (!GameOver) { //Main. Game start again until player tells us to stop.
			
			while (!userWin) { // The game. Just quit when the players guesses the right answer - and win the game
				
				do {
				System.out.print("\n What is your guess?");
				userInput = in.nextLine();
				//number validation for each guess
				
				try {
					userGuess = Integer.parseInt(userInput);
					validGuess = true;
					
				}catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
					validGuess = false;
				}//end of try catch
			
				}while (!validGuess);	
			// userGuess = Integer.parseInt(userInput);
			guessCount = guessCount + 1;
					
				if (userGuess == randNum) {
					System.out.printf("Congratulations! You're right! You've tried %d times.", guessCount);
					guessCount = 0;
					randNum = (int)(Math.random() * range) + min;
					userWin = true;
					valid = false;
					}	
				else {
					if (userGuess > randNum) {
						System.out.printf("Sorry, but your guess is too HIGH. You've tried %d by now.", guessCount);
					}
					else if (userGuess < randNum){
						System.out.printf("Sorry, but your guess is too LOW. You've tried %d by now.", guessCount);
					}
				}				
			
			}
			
			while (!valid) { //Do you want to keep playing?
				System.out.print("Do yo want to keep playing? [Y/N]");
				answer = in.nextLine();
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					if (answer.equalsIgnoreCase("Y")) {
						GameOver = false;
						userWin = false;
						valid = true;
					}
					else {
						System.out.println("Thanks for playing. Bye!");
						valid = true;
						GameOver = true;
					}
				}
				else {
					System.out.println("Wrong input.");
				}
			} // non-numeric input validation (
		}//END - Game continues until player tells us to stop
	} //Main
	}
	

	
			
	
		