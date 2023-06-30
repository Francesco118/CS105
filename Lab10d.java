package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab10d {

	public static void main(String[] args) {
				
		File studentTestScoresFile = new File("Student Test Grades.csv");
		Scanner ScanningFile = null;
		ArrayList<String[]> classRoster = new ArrayList<String[]>();
		
		try {
			ScanningFile = new Scanner(studentTestScoresFile);
			
		} catch (FileNotFoundException e) {
			System.out.printf("The file '%s' does not exist.", studentTestScoresFile);
			return;
		}
		
		String lineText = ScanningFile.nextLine();
		String [] lineArray = lineText.split(",");
		System.out.printf("%-30s%-7s%-7s%-7s\n", lineArray[0], lineArray[1], lineArray[2], lineArray[3]/* , lineArray[4], lineArray[5], lineArray[6] */);
		System.out.println("---------------------------------------------------------");
		
		while (ScanningFile.hasNext()) {
			lineText = ScanningFile.nextLine();
			lineArray = lineText.split(",");
					
			System.out.printf("%-30s%-7s%-7s%-7s\n", lineArray[0], lineArray[1], lineArray[2], lineArray[3]/*, lineArray[4], lineArray[5], lineArray[6]*/);
			//System.out.println("-------------------------------------");
			//System.out.println(lineText);
			
			for (int i = 0; i < lineArray.length(); i++) {
				if (lineArray[i] > 94) {
					lineArrray[i] = A;
				}
			}
		}
		
		//System.out.println("\n\nGoodbye!");
		
		ScanningFile.close();

	}

}