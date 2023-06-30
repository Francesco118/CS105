package week04;
import java.util.Scanner;
public class Lab4b {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String userInput = "";
	boolean valid = false;
	
	while (!valid) {
		System.out.print("Do you like to code in Java?");
		userInput = in.nextLine();
		
		if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N")) {
			valid = true;
		}
		else {
			System.out.println("Error: Please answer with a 'Y' or 'N'.");
		} // end of if/else statement to validate input
		
	}//end of while loop
	
	if (userInput.equalsIgnoreCase("Y")) {
		System.out.println("That's great! I do too!");
	}
	else {
		System.out.println("That's ok. There are many other wonderful things in life to learn.");
	}
	
	}

}
