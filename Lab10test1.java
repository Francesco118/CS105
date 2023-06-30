package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //look to the keyboard and receive the input
		
		String fileName = "perfum.csv";
		
		
		File inFile = new File(fileName);
		Scanner pFile = null;
		
		try {
			new Scanner(fileName);
		} catch (FileNotFoundException e) {
			System.out.printf("The file '%s' does not exist.", fileName);
			return;
		}
		
		while (pFile.hasNext()) {
			String lineText = pFile.nextLine();
			String [] lineArray = lineText.split(",");
			System.out.printf("%-30s%-40s%-12s%-12s%-5s\n", lineArray[0], lineArray[1], lineArray[2], lineArray[3], lineArray[4], lineArray[5], lineArray[6]);
			System.out.println(lineText);
		}
		
		System.out.println("\n\nGoodbye!");
		
		pFile.close();
	}

}
