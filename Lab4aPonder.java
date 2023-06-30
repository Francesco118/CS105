package week04;
import java.util.Scanner;
public class Lab4aPonder {

	public static void main(String[] args) {
			
		// Use Scanner for getting Input from user
		Scanner in = new Scanner(System.in);          //Input Scanner

		System.out.print("Please enter a number: ");
		String input = in.nextLine();

		int num1 = Integer.parseInt(input);

		System.out.printf("You entered the number " + num1);

		}//end of method main()

	}


