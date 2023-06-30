/**
* File: Lab2c.java
* Description: Calculating performance of an application, added with monthly deposits 
* Lessons Learned: 
* 		variables always keep the last assignment and obliterates the previous one.
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 5th, 2023
*/package week02;

import java.util.Scanner;

public class Lab2c {

	public static void main(String[] args) {
		//Ask the user the amount he/she will aport each month for the period.
		Scanner in = new Scanner(System.in);
		
		String Answer1;
		String Answer2;
		
		double monthlyDeposit;
		double interestRate;
		double monthlyInterest;
		double balance;

		System.out.println("The program will calculate your balance after 6 months, according to\n your monthly deposit and the annual interest rate. ");
		
		System.out.print("Enter the amount you'll deposit each month: ");
		Answer1 = in.nextLine();
		monthlyDeposit = Double.parseDouble(Answer1);
		
		System.out.print("Enter the annual interest rate (percent): ");
		Answer2 = in.nextLine();
		interestRate = Double.parseDouble(Answer2);
		
		monthlyInterest = interestRate/100/12;
		System.out.printf("The monthly interest rate is %.4f percent. \n", monthlyInterest);
		
		//1
		balance = monthlyDeposit * (1 + monthlyInterest);
		System.out.printf("After 1 month, you'll have $%.2f in your bank account. \n", balance);	
		
		//2
		balance = (balance + monthlyDeposit) * (1 + monthlyInterest);
		System.out.printf("After 2 month, you'll have $%.2f in your bank account. \n", balance);
		
		//3
		balance = (balance + monthlyDeposit) * (1 + monthlyInterest);
		System.out.printf("After 3 month, you'll have $%.2f in your bank account. \n ", balance);
		
		//4
		balance = (balance + monthlyDeposit) * (1 + monthlyInterest);
		System.out.printf("After 4 month, you'll have $%.2f in your bank account. \n", balance);
		
		//5
		balance = (balance + monthlyDeposit) * (1 + monthlyInterest);
		System.out.printf("After 5 month, you'll have $%.2f in your bank account. \n", balance);
		
		//6
		balance = (balance + monthlyDeposit) * (1 + monthlyInterest);
		System.out.printf("After 6 month, you'll have $%.2f in your bank account. \n", balance);

	}

}
