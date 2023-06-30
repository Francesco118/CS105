package week07;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Lab7a {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	LocalDate rightNow = LocalDate.now();
		
	boolean GameOver = false;
	boolean validEndGame = false;
	String answer =""; //variable for user input to finish game
	int year =0;
	
	while (!GameOver) {
	System.out.println("Please enter the name of a potential student: "); //ask name
	String name = in.nextLine();		
	validEndGame = false;
	
	boolean validNumb1 = false;
	do { //year input validation for year of birth
		System.out.println("Please enter the year the potential student was born: ");
		String yearInput = in.nextLine();
		try {
			year = Integer.parseInt(yearInput);
			validNumb1 = true;
		}catch (Exception e){
			System.out.println("Invalid response. Please enter a whole number for the birth year.\n");
			validNumb1 = false;
		}
	} while (!validNumb1);	//end of numeric input validation for birth year
	
	//System.out.println(year);
	//System.out.println(name);
	System.out.println(checkEligibility(name, year));
	
	
	while (!validEndGame) { //Keep playing? non-numeric validation
		System.out.println("Would you like to play again? (Y/N): ");
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
	} //end of Keep playing validation
	} //End of while loop to the game
	
	

	
	
	}// end of main
	
	public static String checkEligibility(String studentName, int birthYear) {
		//System.out.println("birthYear is: " + birthYear);
		int howOld = birthYear;
		//String ageInfo = studentName + " is " + calculateAge(howOld) + " years old.";
			if (calculateAge(howOld)<= 4) {
				return studentName + " is " + calculateAge(howOld) + " years old. " + studentName + " is not eligible to attend school";
			}
			if (calculateAge(howOld) >= 5 && calculateAge(howOld)<= 11) {
				return studentName + " is " + calculateAge(howOld) + " years old. " + studentName + " may attend Elementary School";
			}
			if (calculateAge(howOld) >= 12 && calculateAge(howOld)<= 14) {
				return studentName + " is " + calculateAge(howOld) + " years old. " + studentName + " may attend Jr. High School";
			}
			if (calculateAge(howOld)>= 15 && calculateAge(howOld) <= 17) {
				return studentName + " is " + calculateAge(howOld) + " years old. " + studentName + " may attend High School";
			}
			if (calculateAge(howOld)>= 18) {
				return studentName + " is " + calculateAge(howOld) + " years old. " + studentName + " may attend College";
				}
			return studentName;
				
		}
				
	
	
	public static int calculateAge(int yearOfBirth) {
		LocalDate timeNow = LocalDate.now(); //taking current date from the system
		//System.out.println(timeNow);
		DateTimeFormatter onlyYear = DateTimeFormatter.ofPattern("YYYY"); //formatting the new variable that will receive the year Value
		//yearOfBirth = 0;
		int currentYear = timeNow.getYear(); //take the current year from the current date 
		//System.out.println("current year is: " + currentYear);
		//System.out.println("Year of birth is: " + yearOfBirth);
		int age = currentYear - yearOfBirth; // 
		return age;
		
		
		
	}

}
