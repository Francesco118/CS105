package week04;
import java.util.*;
public class Lab4_test {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean done = false;
	int numb1;
	int numb2;
	
	System.out.println("You'll give me two numbers, and I'll divide the first by the second.");
	
	do {
		try {
			System.out.println("Tell me de First number: ");
			numb1 = input.nextInt();
			System.out.println("Tell me de Second number: ");
			numb2 = input.nextInt();
			
			int numbDiv = numb1/numb2;
			int numbRest = numb1 % numb2;
			
			System.out.println("The result for this division is: ");
			System.out.println(numbDiv);
			
			System.out.println("The rest of this division is: ");
			System.out.println(numbRest);
			
			if (numb1.equals(1) || numb2.equals(2)) 
		}
		catch (Exception e) {
			System.out.println("Sorry. I just accept small values;");
		}
	} while (x < 5);

	}

}
