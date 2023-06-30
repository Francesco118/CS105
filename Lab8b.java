package week08;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Lab8b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program will ask the user to enter a series of numbers.\r\n"
				+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
				+ "The program will then display the array of numbers and the sum total of those numbers.");
		
		boolean GameOver = false, InputOver = false, validInput = false, validEndGame = false;
		
		String UserStringInput = "", answer = "";
		
		int UserNumberInput = 0;
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		
		//System.out.println(numbersList); //Check if it's empty
		
		while(!GameOver) {//Operation begins
			validEndGame = false;
			InputOver = false;
			numbersList.clear();
			
			while (!InputOver) { //Input Loop
				System.out.println("Enter a number! (Hit <enter> to finish):");
				UserStringInput = in.nextLine();
				
				if (UserStringInput.equalsIgnoreCase("")) {
					InputOver = true;
				}
				else { //Numeric input-validation
					try {
						UserNumberInput = Integer.parseInt(UserStringInput);
						validInput = true;
						numbersList.add(UserNumberInput);
					} catch (Exception e) {
						System.out.println("Invalid response. Please enter a valid whole number.");
						validInput = false;
					}
				
					
				
				} //end numeric-validation
				
			} //End Input Loop
			
			
			//Print the table
			//System.out.println(numbersList); //Check which elements are in the ArrayList
			System.out.println("Index     Item");
			System.out.println("---------------");
			for(int i = 0; i < numbersList.size(); i++) {
				System.out.printf("%-10d%s\n", i, numbersList.get(i));
			}
			
			//How many items are in the list
			System.out.printf("There are %d items in the ArrayList.", numbersList.size());
			
			//The sum of all the items - call the sumValues method
			System.out.println("\nThe sum total of numbers in the ArrayList is " + sumValues(numbersList) + ".");
			
			System.out.println("The following numbers were duplicated in the ArrayList: " + dups(numbersList));
			
			//non-numeric validation (wish to play again?)
			while (!validEndGame) {
				System.out.println("Do you wish to play again? (Y/N): ");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					if (answer.equalsIgnoreCase("Y")) {
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
					System.out.println("Invalid response. Please enter either a 'Y' or 'N'.");
				}
			}
			// GameOver = true;
			
		} //Operation Ends
	}
	
	
	public static int sumValues(ArrayList<Integer> numbersList2) {
		int sum = 0;
		for (int i = 0; i < numbersList2.size(); i++) {
			sum = sum + numbersList2.get(i);
		}
		return sum;
		
	}
	
	public static ArrayList<Integer> dups(ArrayList<Integer> originalList) {
		
		ArrayList<Integer> duplicateList = new ArrayList<Integer>();
			for (int i = 0; i < originalList.size(); i++) {
				if (originalList.subList(i+1, originalList.size()).contains(originalList.get(i)) && !duplicateList.contains(originalList.get(i))) {
					duplicateList.add(originalList.get(i));
				}
			}
		
		return duplicateList;
		
	}

}
