// java program by Eric Adamian
// array calls methods to search set of values to find given data

import java.util.Scanner;

public class ArraySearch{

	public static void main(String[] args){

		// scanner
		Scanner input = new Scanner(System.in);

		// prompt
		System.out.println("*****************************************************************");
		System.out.println("Please enter 10 ints; prompt will ask for an int to search for.");
		System.out.println("\nFollowing this, prompt will show:");
		System.out.println("\t 1) the number of positive integers in the array");
		System.out.println("\t 2) show the second smallest integer in the array");
		System.out.println("\t 3) the number of even integers in the array\n");

		// initializing array of size 10
		int[] array = new int[10];

		// user input for array
		for (int i = 0; i < 10; i++){
			System.out.print((i + 1) + ") Please enter a number: ");
			array[i] = input.nextInt();
		}

		// user input for int to search for
		System.out.print("\nPlease enter an int to search for in our array: ");
		int userInput = input.nextInt();
		System.out.println(search(array, userInput));

		// calling 3 methods for positive, second smallest, and even int
		int numPos = numberPositive(array);
		int secSmall = secondSmallest(array);
		int numEven = numberEven(array);

		// final results
		System.out.println("The number of positive integers: " + numPos);
		System.out.println("The second smallest integer: " + secSmall);
		System.out.println("The number of even integers: " + numEven);
		
	}

	//*********************************************************************

	// searching through array
	public static String search(int[] array, int userInput){

		for (int i = 0; i < array.length; i++){
			if(array[i]== userInput){
		 		return "Search result: Found!\n";
			}
		}
		return "Search result: Not found!\n";
	}

	// checks if array item is greater than 0
	public static int numberPositive(int[] array){

		int counter = 0;

		for(int i = 0; i < array.length; i++){
			if(array[i] > 0){
				counter++;
			}
		}
		return counter;
	}

	// i = smallest int, j = second smallest int
	// if i > j, store j into returned value
	public static int secondSmallest(int[] array){

		int value = array[0];

		for(int i = 0; i < array.length;i++){
			for(int j = 0; j < array.length; j++){
				if(array[i] > array[j]){
					value = array[i];
					array[i] = array[j];
					array[j] = value;
				}
			}
		}
		return value;
	}

	// checks if array item can be mod by 2
	public static int numberEven(int[] array){
		int count = 0;

		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				count++;
			}
		}
		return count;
	}
}		