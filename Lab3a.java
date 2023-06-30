/**
* File: Lab3a.java
* Description: A program to determine the size of a shirt, according to the size of the chest given in the input.
* Lessons Learned: 
* 
* ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 2th, 2023
*/
package week03;

import java.util.Scanner;

public class Lab3a {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String Answer;
		
		double chestSize;
		
		System.out.println("Enter the customer chest size (in inches): ");
		Answer = in.nextLine();
		chestSize = Double.parseDouble(Answer);
		
		if (chestSize < 38) {
			System.out.println("Your size is S (small).");
		}
			else if (chestSize >= 38 && chestSize < 40) {
				System.out.println("Your size is M (medium).");
			}
			
			else if (chestSize >= 40 && chestSize < 43) {
				System.out.println("Your size is L (large).");
			}
			
			else if (chestSize >= 43 && chestSize < 46) {
				System.out.println("Your size is XL (extra-large).");
			}
			
			
			else {
			System.out.println("Your size is XXL (extra-extra-large)."); }
			 
	
		
	}
}


