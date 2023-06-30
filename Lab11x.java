package week11;
import java.util.Scanner;
public class Lab11x {

	public static void main(String[] args) {
		boolean playAgain  = true;
		String answer = "";
		Scanner in = new Scanner(System.in);
		while (playAgain) {
			System.out.println("This program will show the name of an apostle based on the order they were called with President Nelson as #1\r\n"
					+ "Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit):");
			answer = in.nextLine();
			answer.toLowerCase();
			
			switch (answer) {
				case "":
					playAgain = false;
				case "1":
					System.out.println("Russell M. Nelson");
					break;
				case "2":
					System.out.println("Dallin H. Oaks");
					break;
				case 3:
					System.out.println("M. Russell Ballard");
					break;
				case 4:
					System.out.println("Jeffrey R. Holland");
				case 5:
					System.out.println("M. Russell Ballard");
					break;	
				case 6:
					System.out.println("M. Russell Ballard");
					break;
				case 7:
					System.out.println("M. Russell Ballard");
					break;
				case 8:
					System.out.println("M. Russell Ballard");
					break;
				case 9:
					System.out.println("M. Russell Ballard");
					break;
				case 10:
					System.out.println("M. Russell Ballard");
					break;
				case 11:
					System.out.println("M. Russell Ballard");
					break;
				case 12:
					System.out.println("M. Russell Ballard");
					break;
				case 13:
					System.out.println("M. Russell Ballard");
					break
				case 14:
					System.out.println("M. Russell Ballard");
					break;
				case 15:
					System.out.println("M. Russell Ballard");
					break;	
				case default:
					System.out.println("I don't know what is that.");
					break;
					//empty array (length = 0)
					//int[] arrayRange = {1, 100} /////{min, max}
			}
			
		}
	}

}
