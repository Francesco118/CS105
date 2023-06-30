/**
* File: Lab2b.java
* Description: A program to calculate area of a square and a rectangle, using input data from the user.
* Lessons Learned: How to deal with variables and use them to make math.
* 		A variable holds a value I'll assign to it. 
* 		The value is received as a string.
* 		We need to use ParseInt to transform that variable into a integer, so we can make math with it.
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 5th, 2023
*/
package week02;

import java.util.Scanner;

public class Lab2b {

	public static void main(String[] args) {

		/*declare scanner. the instrument that will make possible for the variable to receive 
		 * the input.
		 * 
		 * declare variable that will receive the value
		 * 
		 * variable =(receive)Scanner(input)
		 * 
		 * receive the input as string, and convert it to double (so we can use math on it)
		 *
		 * Double.parseDouble(variable)
		 * 
		 * printf (and use some placeholders
		*/		
		Scanner in = new Scanner(System.in);
		
		String UserAnswer1;
		String UserAnswer2;
		String UserAnswer3;
		
		double sqWidth;
		double sqArea;
		double rcHeight;
		double rcWidth;
		double rcArea;
		
		//receive square side
		System.out.print("Please enter the side of the square: ");
		UserAnswer1 = in.nextLine();
		sqWidth = Double.parseDouble(UserAnswer1);
		
		sqArea = sqWidth * sqWidth;
		System.out.printf("With a width of %.1f, your square has an area of %.1f. ", sqWidth, sqArea);

		//receive rectangle height
		System.out.println("Plese enter the Height of a rectangle: ");
		UserAnswer2 = in.nextLine();
		rcHeight = Double.parseDouble(UserAnswer2);
		
		//receive recgtangle width
		System.out.println("Please enter the Width of a rectangle: ");
		UserAnswer3 = in.nextLine();
		rcWidth = Double.parseDouble(UserAnswer3);
		
		rcArea = rcWidth * rcHeight;
		System.out.printf("With a Height of %.1f and a width of %.1f, your rectangle has an area of %.1f. ", rcHeight, rcWidth, rcArea);

		
	}

}
