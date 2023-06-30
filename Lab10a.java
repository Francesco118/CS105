package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10a {

	public static void main(String[] args) {
			
		File studentScoresFile = new File("Student Assignment Scores.csv");
		Scanner ScanningFile = null;
		
		try {
			ScanningFile = new Scanner(studentScoresFile);
			
			
		} catch (FileNotFoundException e) {
			System.out.printf("The file '%s' does not exist.", studentScoresFile);
			return;
		}
		
		while (ScanningFile.hasNext()) {
			String lineText = ScanningFile.nextLine();
			//String [] lineArray = lineText.split(",");
			//System.out.printf("%-30s%-40s%-12s%-12s%-5s\n", lineArray[0], lineArray[1], lineArray[2], lineArray[3], lineArray[4], lineArray[5], lineArray[6]);
			System.out.println(lineText);
		}
		
		//System.out.println("\n\nGoodbye!");
		
		ScanningFile.close();

	}

}
