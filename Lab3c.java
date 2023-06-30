package week03;

import java.util.Scanner;

public class Lab3c {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday.");
	
	String answer;
	double age;
	String gender;
	
	System.out.print("Please enter the member's age: ");
	answer = in.nextLine();
	age = Double.parseDouble(answer);
	
	if (age < 18) {
		if (age < 12) {
			if (age < 3) {
				if (age < 1) {
					System.out.println("The member is a babe in arms");
				}
				else {
					System.out.println("The member should be in Nursery.");
				}
			}
			else {
				System.out.println("The member should attend Primary.");
				}
			}
		else {
			System.out.println("Please enter the member's gender: ");
			gender = in.nextLine();
			if (gender.equalsIgnoreCase("m")) {
				System.out.println("The member should attend Young Men's.");
			}
			else {
				if (gender.equalsIgnoreCase("f")) {
					System.out.println("The member should attend Young Women's.");
				}
				else {
					System.out.println("wrong answer. Use f or m.");
				}
			}
		}
	}
	else System.out.println("Please enter the member's gender: ");
		gender = in.nextLine();
		if (gender.equalsIgnoreCase("m")) {
			System.out.println("The member should attend Priesthood.");
		}
		else {
			if (gender.equalsIgnoreCase("f")) {
				System.out.println("The member should attend Relief Society");
			}
			else {
				System.out.println("wrong answer. Use f or m.");
			}
	}
}
	}

	
	
	
	//ASk age
	//If >= 3: primary 
	//if >= 1: Nursery
	//if < 1: babe in arms
	
	
	//
	//if >= 12: ask gender:
	//if gender = male ->young men
	//if gender = female ->young women
	
	//if >= 18: ask gender:
	//if gender = male ->Priesthood
	//if gender = female ->Relief Society

