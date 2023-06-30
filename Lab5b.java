/**
* File: Lab5b.java
* Description: The program will calculare your balance based in your monthly deposit, 
* 				annual interest rate and how long you want to hold this money.
* 
* Lessons Learned: input validation (numeric and non-numeric, for loop, while loop) 		
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 18th, 2023
*/

package week05;

import java.util.Scanner;

public class Lab5b {

	public static void main(String[] args) {
		//Ask the user the amount he/she will aport each month for the period.
				Scanner in = new Scanner(System.in);
				
				String Answer1;
				String Answer2;
				String Answer3;
				String exitAnswer;
				
				double monthlyDeposit = 0;
				double interestRate = 0;
				double monthlyInterest = 0;
				double balance = 0;
				
				int monthRange = 0;
				int i = 0; //iteration variable 
				
				boolean validDeposit = false;
				boolean validInterest = false;
				boolean validMonthRange = false;
				boolean validEndGame = false;
				boolean GameOver = false;

				System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.\r\n"
						+ "It will then show the monthly balance over the period of planned savings.");
				
				while (!GameOver) {
				validEndGame = false;
				//receive the deposit amount - numerical input validation
				do { 
					System.out.print("Enter the amount you'll deposit each month: ");
					Answer1 = in.nextLine();
					try {
						monthlyDeposit = Double.parseDouble(Answer1);
						validDeposit = true;
					}catch (Exception e){
						System.out.println("Error: Please enter a number.\n");
						validDeposit = false;
					}
				} while (!validDeposit);
				
				
				
				//receive the interest rate - numerical input validation
				do { 
					System.out.print("Enter the annual interest rate (percent): ");
					Answer2 = in.nextLine();
					try {
						interestRate = Double.parseDouble(Answer2);
						validInterest = true;
					}catch (Exception e){
						System.out.println("Error: Please enter a number.\n");
						validInterest = false;
					}
				} while (!validInterest);
				
				
				monthlyInterest = interestRate/100/12;
				//System.out.printf("The monthly interest rate is %.4f percent. \n", monthlyInterest);
					
				//receive the number of months you plan to save
				do { 
					System.out.print("Please enter the number of months you plan to save:  ");
					Answer3 = in.nextLine();
					try {
						monthRange = Integer.parseInt(Answer3);
						validMonthRange = true;
					}catch (Exception e){
						System.out.println("Error: Please enter a whole number.\n");
						validMonthRange = false;
					}
				} while (!validMonthRange);
				
				
				System.out.println("The following table shows the balance of the account for each month of the designated savings period.");
				
				
				// %-20d in printf to create space and make things clear and beautiful as a table
				//System.out.printf("After %-20d month, you'll have $%,.2f in your bank account. \n", i, balance);
				
				
				System.out.println("Month                    Balance");
				//for loop to 
				for (i = 1; i <= monthRange; i++) {
					//balance = monthlyDeposit * (1 + monthlyInterest);
					balance = (balance + monthlyDeposit) * (1 + monthlyInterest);
					System.out.printf("Month %-18d $%,.2f\n", i, balance);
				}
			
				while (!validEndGame) {
					System.out.println("\n");
					System.out.print("Do yo want to keep playing? [Y/N]");
					exitAnswer = in.nextLine(); 
					if (exitAnswer.equalsIgnoreCase("Y") || exitAnswer.equalsIgnoreCase("N")) { 
						if (exitAnswer.equalsIgnoreCase("Y")) {
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
						validEndGame = false; 
						GameOver = false;
					}
				}
			}
		}	
}
