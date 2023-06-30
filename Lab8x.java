package week08;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Lab8x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(9);
		numbersList.add(3);
		numbersList.add(7);
		numbersList.add(6);
		numbersList.add(8);
		numbersList.add(5);
		numbersList.add(4);
		
		System.out.println(numbersList);
		
		ArrayList<Integer> someNumbers = new ArrayList<Integer>(numbersList.subList(0, numbersList.size()));
		
		System.out.println(someNumbers);
		
		String name = "Francesco";
		String nome = "francesco1";
		
		if (name == nome) {
			System.out.println("Igual");
		}
		else {
				System.out.println("diferente");
			}
		
		int age = 22;
		//String name = "francesco";
		System.out.printf("%s is %d years old.", name, age);
		
		
		System.out.println(Arrays.toString(args));
		
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		wordList.add("one");
		wordList.add("two");
		wordList.add("three");
		wordList.add("Four");
		wordList.add("Five");
		wordList.add("six");
		wordList.add("seven");
		//print list before removal
		System.out.println(wordList);
		//remove some items
		wordList.remove("Four");
		wordList.remove("six");
		//print list after removal
		System.out.println(wordList);
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add(name);
		nameList.add("Carlos");
		nameList.add("Alberto");
		nameList.add("Bruno");
		nameList.add("Diego");
		System.out.println("Unsorted list: " + nameList);
		Collections.sort(nameList);
		System.out.println("Sorted (alphabetized) list: " + nameList);
		
		System.out.println("Unsorted number list " + numbersList);
		Collections.sort(numbersList);
		System.out.println("Sorted list of numbers: " + numbersList);
		}
	

}
