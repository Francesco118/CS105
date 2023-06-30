/**
* File: Lab5c.java
* Description: The program will multiply each number between the starting number and ending number by the multiplier.
* Lessons Learned: input validation
* 		
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 18th, 2023
*/

package week05;

import java.util.Scanner;

public class Lab5c {

	public static void main(String[] args) {
		// a variable scope is its lifetime
		//how long will be in the variable
		//In Java: just inside the block within its defined
		Scanner in = new Scanner (System.in);
		
		System.out.println("The program will multiply each number between the starting number and ending number by the multiplier.");
		
		int startNum = 0;
		int endNum = 0;
		int testNum = 0;
		int i = 0; //iteration variable to use in for loop
		int math = 0;
		
		String startInput = "";
		String endInput = "";
		String testInput = "";
		String answer =""; 
		
		boolean validStartNum = false;
		boolean validEndNum = false;
		boolean validTestNum = false;
		boolean validEndGame = false;
		boolean GameOver = false;
		
		//start number validation
		while (!GameOver) {
		do { 
			System.out.println("Enter the starting number: ");
			startInput = in.nextLine();
			try {
				startNum = Integer.parseInt(startInput);
				validStartNum = true;
			}catch (Exception e){
				System.out.println("Error: Please enter a whole number.\n");
				validStartNum = false;
			}
		} while (!validStartNum);
		
		
		//end number validation
		do { 
			System.out.println("Enter the ending number: ");
			endInput = in.nextLine();
			try {
				endNum = Integer.parseInt(endInput);
				validEndNum = true;
			}catch (Exception e){
				System.out.println("Error: Please enter a whole number.\n");
				validEndNum = false;
			}
		} while (!validEndNum);
		
		
		//test number validation
		do { 
			System.out.println("Enter the test number: ");
			testInput = in.nextLine();
			try {
				testNum = Integer.parseInt(testInput);
				validTestNum = true;
			}catch (Exception e){
				System.out.println("Error: Please enter a whole number.\n");
				validTestNum = false;
			}
		} while (!validTestNum);
		
		
		
		//for (how to start, when to do when stop, what to do after)
			//what to do till the requirement is met
		System.out.printf("Here are the numbers between %d and %d that are divisible by %d:", startNum, endNum, testNum);
		System.out.println("\n \n");
		//for that analyze the number given
		for (i = startNum; i <= endNum; i++) {
				math = (i * testNum); 
				System.out.printf("Multiplying %d by %d results in: %d \n", startNum, endNum, math);
				}
		validEndGame = false;
		//non-numeric validation to leave the game  
		//Do you want to keep playing? 
		while (!validEndGame) {
		System.out.print("Do yo want to keep playing? [Y/N]");
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
		}		 
		
	}

	}

