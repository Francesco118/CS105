package week10;

import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class week10_outline {

	public static void main(String[] args) {

	      File studentsData = new File("studentsData.csv");
	      //Scanner in = new Scanner(in.System);
	      if (studentsData.exists()) { //return true
	    	 System.out.println("The file exists");
	      }
	      
	      if (studentsData.canRead()) { //return true
		    	 System.out.println("I can read  the file");
		      }
	   //   in.close();
	    //  System.out.println("Readable " + myObj.canRead());
	    
	      
	      ArrayList<String> Countries = new ArrayList<String>();
	      Countries.add("Brazil");
	      Countries.add("Russia");
	      Countries.add("India");
	      Countries.add("China");
	      Countries.add("South Africa");
	      
	      if (Countries.contains("United States")) {
	    	  System.out.println("United States is part of the BRICS");
	      }
	      else {
	    	  System.out.println("United States is not in the BRICS");
	      }
	      
	} 
	

	}


