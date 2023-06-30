package week07;

import java.util.Scanner;

public class Lab7c {

	public static void main(String[] args) {
		// Play the game until the user says they don't want to play again.
		Scanner in = new Scanner(System.in);
		String playAgain = "Y";

		while (playAgain.equalsIgnoreCase("Y")) {
			// Get an integer from the user
			int intNum = getValidInt("Please enter a whole number: ",
					"Invalid response. Only whole numbers are acceptable.", in);
			System.out.printf("The whole number your entered was: %d.\n", intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
			System.out.println();

			// Get a floating-point from the user
			double doubleNum = getValidDouble("Please enter a decimal-point number: ",
					"Invalid response. Only decimal-point numbers are acceptable.", in);
			System.out.printf("The float your entered was: %f.\n", doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
			System.out.println();

			// Get a 'Y' or 'N' from the user
			playAgain = getValidYN("Would you like to play again? (Y/N): ",
					"Invalid response.  Please answer with a 'Y' or 'N'", in);
			System.out.println();
		} // end of while (playAgain.equalsIgnoreCase("y"))
		System.out.println("Goodbye!");
		in.close();
	}// end of Main()

	public static int getValidInt(String question, String warning, Scanner in) {
		boolean validInt = false;
		int intNumber = 0;
//		Scanner in = new Scanner(System.in);

		while (!validInt) {

			System.out.println(question);
			String answer = in.nextLine();
			try {
				intNumber = Integer.parseInt(answer);
				validInt = true;
			} catch (Exception e) {
				System.out.println(warning);

			}
		}
		return intNumber;

	}

	public static Double getValidDouble(String question, String warning, Scanner in) {
		boolean validDouble = false;
		double doubleNumber = 0.0;
		// Scanner in = new Scanner(System.in);
		String answer2 = "";

		while (!validDouble) {
			try {
				System.out.println(question);
				answer2 = in.nextLine();
				doubleNumber = Double.parseDouble(answer2);
				validDouble = true;
			} catch (Exception e) {
				System.out.println(warning);
			}

		}

		return doubleNumber;
	}

	public static String getValidYN(String question, String warning, Scanner in) {
		boolean validYN = false;
		// double doubleNumber = 0;
		// Scanner in = new Scanner(System.in);
		

		while (!validYN) {
			System.out.println(question);
			String answer3 = in.nextLine();
			if (answer3.equalsIgnoreCase("Y") || answer3.equalsIgnoreCase("N")) {
				if (answer3.equalsIgnoreCase("Y")) {
					validYN = true;
					// GameOver = false;
					return answer3;
				} else {
					return answer3;
				}

			} else {
				System.out.println(warning);
			}
		}
		return warning;

		//return answer3;
	}
}