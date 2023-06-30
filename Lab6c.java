package week06;
import java.util.Scanner;
public class Lab6c {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will ask the user for 3 numbers and determine if the second number "
				+ "lies between the first and the third.");
		
		//Declarations
		String input1 ="", input2 ="", input3="", answer = "";
		Integer numb1 = 0, numb2 = 0, numb3 = 0;
		boolean validNumb1 = false, validNumb2 = false, validNumb3 = false;
		boolean validEndGame = false, GameOver = false;
		
		//Ask for the numbers
		
		
		while (!GameOver) {
		validEndGame = false;
		do { //Numb1 validation
			System.out.println("Please enter the low number: ");
			input1 = in.nextLine();
			try {
				numb1 = Integer.parseInt(input1);
				validNumb1 = true;
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.\n");
				validNumb1 = false;
			}
		} while (!validNumb1);
		
		do { //Numb2 validation
			System.out.println("Please enter the number to be tested (the between number): ");
			input2 = in.nextLine();
			try {
				numb2 = Integer.parseInt(input2);
				validNumb2 = true;
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.\n");
				validNumb2 = false;
			}
		} while (!validNumb2);
		
		do { //Numb3 validation
			System.out.println("Please enter the high number: ");
			input3 = in.nextLine();
			try {
				numb3 = Integer.parseInt(input3);
				validNumb3 = true;
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.\n");
				validNumb3 = false;
			}
		} while (!validNumb3);
		
		
		boolean intermediario = isBetween(numb1, numb2, numb3);
		
		if (intermediario == true) {
			System.out.printf("%d lies between the numbers %d and %d.", numb2, numb1, numb3);
			System.out.println("\n");
		}else {
			System.out.printf("%d DOES NOT lie between the numbers %d and %d.", numb2, numb1, numb3);
			System.out.println("\n");
		}
		
		
		while (!validEndGame) { //yes or no validation
			System.out.println("Do yo want to keep playing? [Y/N]");
			answer = in.nextLine();
			if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
				if (answer.equalsIgnoreCase("Y")) {
					validEndGame = true;
					GameOver = false;
				} else {
					System.out.println("Thanks for playing. Bye!");
					validEndGame = true;
					GameOver = true;
				}
			} else {
				System.out.println("Wrong input.");
			}
		}
	}
		
	}
	
	public static boolean isBetween(int number1, int number2, int number3) {
		
		if (number2 > number1 && number2 < number3) {
			return true;
		}
		/*
		 * if (number2 < number1 && number2 > number3) { return true; }
		 */
		return false;
		}
		
	}

