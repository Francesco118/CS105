package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10c {

	public static void main(String[] args) {
				
		File studentScoresFile = new File("Student Assignment Scores.csv");
		Scanner ScanningFile = null;
		
		try {
			ScanningFile = new Scanner(studentScoresFile);
			
		} catch (FileNotFoundException e) {
			System.out.printf("The file '%s' does not exist.", studentScoresFile);
			return;
		}
		
		String lineText = ScanningFile.nextLine();
		String [] lineArray = lineText.split(",");
		//System.out.printf("%-30s%-7s%-7s%-7s%-7s\n", lineArray[0], lineArray[1], lineArray[2], lineArray[3], lineArray[4], lineArray[5], lineArray[6]);
		
		//HEADER
		System.out.println("Student               Assignment with 0");
		System.out.println("---------------------------------------");
		//END OF HEADER
		
		
		while (ScanningFile.hasNext()) {
			lineText = ScanningFile.nextLine();
			lineArray = lineText.split(",");
					
			for (int i = 0; i < lineArray.length; i++) {
				
				
				if  (lineArray[i].equals("0")) {
					//System.out.print(lineArray[0] + "        " + i);
					System.out.printf("%-30s%-7s\n", lineArray[0], i);
				//System.out.println(i);
				}
				
			
			}
			
			//System.out.println("-------------------------------------");
			//System.out.println(lineText);
		}
		
		//System.out.println("\n\nGoodbye!");
		
		ScanningFile.close();

	}

}
