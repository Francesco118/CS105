/**
* File: Lab2a.java
* Description: A short description of the project.  This does not need to be long.  One sentence will suffice.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     Construct 1
*     Construct 2
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: 4/25/2023
*/
// Check the work with the TA's 4th opposite corner	
package week02;
import java.util.Scanner;
public class Lab2a {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);

	     //Ask the user's name
	     System.out.println("Please enter your name: ");
	     String name = in.nextLine();
	     System.out.println("Hello " + name + "!");
	     System.out.println();

	     //0 Favorite dessert
	     System.out.println("What is your favorite dessert? ");
	     String dessert = in.nextLine();
	     System.out.println("Wow! " + dessert + " looks nice!");
	     System.out.println();
	     
	     //1  color
	     System.out.println("And how about your favorite color? ");
	     String color = in.nextLine();
	     System.out.println("Awesome! I like " + color + " too!");
	     System.out.println();
	     
	     //2  animal
	     System.out.println("I have some more questions to you...");
	     
	     System.out.println("Choose an animal... ");
	     String animal = in.nextLine();
	     System.out.println("Interesting! A " + animal + " is awesome!");
	     System.out.println();
	     
	     //3  piece of cloth
	     System.out.println("Now a piece of cloth... ");
	     String cloth = in.nextLine();
	     System.out.println("Cool! " + cloth + " seems elegant!");
	     System.out.println();
	     
	     //4 Another color2
	     System.out.println("Can you name another color? ");
	     String color2 = in.nextLine();
	     System.out.println("Great. " + color2 + " looks nice!");
	     System.out.println();
	     
	     //5 place
	     System.out.println("Tell me a nice place! ");
	     String place = in.nextLine();
	     System.out.println("I wish to travel to " + place + " someday...");
	     System.out.println();
	     
	     // Would you eat a (dessert) at (place) with a (color)(animal) at your side while wearing a (color2) (cloth)?

	     System.out.printf("Would you eat a %s at %s with a %s %s \n at your side while wearing a %s %s?", dessert, place, color, animal, color2, cloth);
	     
	     
	     } //end of main()

	} // end of class Lab2a