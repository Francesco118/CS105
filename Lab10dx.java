package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab10dx {
    public static void main(String[] args) {
        String filePath = "Student Test Grades.csv";
        List<String[]> tableData = new ArrayList<>();
        String[] header = null;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            
            if (scanner.hasNextLine()) {
                String headerLine = scanner.nextLine();
                header = headerLine.split(",");
            }
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] rowData = line.split(",");
                tableData.add(rowData);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Print the header
        if (header != null) {
            System.out.println("Header: " + Arrays.toString(header));
        }	
        
        // Print the data from the ArrayList
        for (String[] row : tableData) {
            System.out.println(Arrays.toString(row));
        }
    }
}
