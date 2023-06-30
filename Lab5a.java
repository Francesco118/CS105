/**
* File: Lab5a.java
* Description: program print a series of numbers divisible by an integer specified by the user. 
* Lessons Learned: 
* 		
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 17th, 2023
*/

package week05;

import java.util.Scanner;

public class Lab5a {

	public static void main(String[] args) {
		// a variable scope is its lifetime
		//how long will be in the variable
		//In Java: just inside the block within its defined
		Scanner in = new Scanner (System.in);
		
		System.out.println("In this program, we will display a series of numbers divisible by an integer specified by the user.\r\n"
				+ "You will ask the user for the starting number, the ending number and the integer to be considered.");
		
		int startNum = 0;
		int endNum = 0;
		int testNum = 0;
		int i = 0; //iteration variable to use in for loop
		
		String startInput = "";
		String endInput = "";
		String testInput = "";
		String answer =""; 
		
		boolean validStartNum = false;
		boolean validEndNum = false;
		boolean validTestNum = false;
		boolean validEndGame = false;
		boolean GameOver = false;
		
		
		while (!GameOver) {
		do { //start number validation
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
		
		
		
		do { //end number validation
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
		
		
		
		do { //test number validation
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
		for (i = startNum; i <= endNum; i++) 
				if (i % testNum == 0) {
					System.out.println(i);
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
