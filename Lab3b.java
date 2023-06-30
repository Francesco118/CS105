/**
* File: Lab3b.java
* Description: Calculating BMI after converting the input from imperial system to metric system.
* Lessons Learned: 
* 
*     ...
* Instructor's Name: Jeff Light
*
* @author: Johannes Castellano
* @since: May 2nd, 2023
*/
package week03;

import java.util.Scanner;

public class Lab3b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * Asks a user for a person's height in inches and their weight in pounds
		 * Converts this data into kilograms and meters Calculates the person's BMI
		 * Outputs the person's BMI and the corresponding interpretation as shown in the
		 * table above.
		 */
		
		String heightInput;
		String weightInput;
		
		double heightImperial;
		double weightImperial;
		
		double heightMetric;
		double weightMetric;
		
		double BMI;
		System.out.println("In this program we will calculate a person's BMI.");
		
		//Asks a user for a person's height in inches 
		System.out.print("Please enter a person's height in inches: ");
		heightInput = in.nextLine();
		heightImperial = Double.parseDouble(heightInput);
		
		//Asks a user for a person's weight in pounds
		System.out.print("Please enter a person's wheight in pounds: ");
		weightInput = in.nextLine();
		weightImperial = Double.parseDouble(weightInput);
		
		//Converts this data into meters
		heightMetric = (heightImperial * 0.0254);
		//System.out.println(heightMetric);
		//System.out.printf("Your height in the Metric system is: %f");
		
		//Converts this data into kilograms
		weightMetric = (weightImperial * 0.45359237);
		//System.out.println(weightMetric);
		
		BMI = (weightMetric/(heightMetric*heightMetric));
		//System.out.println(BMI);

		if (BMI < 18.5) {
			System.out.printf("The person's BMI is: %f. The person has a BMI classification of: Underweight", BMI);
		}
			else if (BMI >= 18.5 && BMI < 24.9) {
			System.out.printf("The person's BMI is: %f. The person has a BMI classification of: Normal", BMI);
			}
	
			else if (BMI >= 25 && BMI <= 29.9) {
			System.out.printf("The person's BMI is: %f. The person has a BMI classification of: Overweight", BMI);
			}

			else { 
			System.out.printf("The person's BMI is: %f. The person has a BMI classification of: Obese", BMI);
			}
		
		
		}
	}

