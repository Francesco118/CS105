package week04;

import java.util.Scanner;

public class Lab4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String input = "";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean valid = false;
		
		valid = false;
		do {
			System.out.print("Hey, give me a number: ");
			input = in.nextLine();
			
			try {
				num1 = Integer.parseInt(input);
				valid = true;
				
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.\n");	
				
			} //end of try/catch
			
			
		} while (!valid); {
			
			System.out.println("If you number is " + num1);
			num2 = num1 + 100;
			System.out.println("You can add 100 and have " + num2);
			num3 = num1 * 2;
			System.out.println("Or you can multiple it by 2 and have " + num3);
			
			//valid = true;
			
		} //end of do/while
	}

}
