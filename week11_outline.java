package week11;
import java.util.Scanner;
public class week11_outline {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//6th sample code
		/*
		 * System.out.println("Enter a number (1-7): "); String weekDay = in.nextLine();
		 * 
		 * int weekDayNumber = Integer.parseInt(weekDay);
		 * 
		 * switch(weekDayNumber) { case 1:
		 * System.out.println("First day of the week is Sunday."); //break; case 2:
		 * System.out.println("Second day of the week is Monday."); //break; case 3:
		 * System.out.println("Third day of the week is Tuesday."); //break; case 4:
		 * System.out.println("Fourth day of the week is Wednesday."); //break; case 5:
		 * System.out.println("Fifth day of the week is Thursday."); //break; }
		 */
		
		String firstColor = "blue";
		String secondColor = "purple";

		
		switch(firstColor) {
			case("red"):
				System.out.println("first color is not red");
				switch(secondColor) {
					case("orange"):
						System.out.println("second color is not orange");
					case("purple"):
						System.out.println("second color is not purple");
					case("green"):
						System.out.println("You are right! green is the second color");
				}
			break;
			
			case("yellow"):
				System.out.println("first color is not yellow");
				switch(secondColor) {
					case("orange"):
						System.out.println("second color is not orange");
					break;
					case("purple"):
						System.out.println("second color is not purple");
					break;
					case("green"):
						System.out.println("You are right! green is the second color");
					break;
				}
			break;
			
			case("blue"):
				System.out.println("You are right! Blue is the first color");
				switch(secondColor) {
					case("orange"):
						System.out.println("second color is not orange");
					break;
					
					case("purple"):
						System.out.println("second color is not purple");
					break;
					
					case("green"):
						System.out.println("You are right! green is the second color");
					break;
				}
			break;
			
				}
	}
}
