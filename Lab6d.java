package week06;

import java.util.Scanner;
public class Lab6d {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean validEndGame = false, GameOver = false;
		
		do {
		
		String answer ="";	
		validEndGame = false;
		
		String nameFor ="", nameWhile="";
		System.out.println("Please enter something: ");
		nameFor = in.nextLine();
		nameWhile = nameFor;
		System.out.println("Using the For Loop: The reverse of " + nameFor + " is: " + reverseWithForLoop(nameFor));
		System.out.println("Using the While Loop: The reverse of " + nameWhile + " is: " + reverseWithWhileLoop(nameWhile));
		
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
		} while (!GameOver);
	}
		//Using the for Loop
		public static String reverseWithForLoop(String normalName) {
		String reverseNamef="";
		for (int i = normalName.length()-1; i >= 0; i--) {;
			reverseNamef = reverseNamef + normalName.charAt(i);
		}
		return reverseNamef;
		}
		
		//Using while loop
		public static String reverseWithWhileLoop(String normalName) {
		String reverseNameW="";
		int i = normalName.length() - 1;
		do {
			reverseNameW = reverseNameW + normalName.charAt(i);
			//i =-1; 
			i--;
			
		} while (i >= 0); 
		return reverseNameW;
		}
		
	
	}
	


