// java program by Eric Adamian
// dynamically adjusting and comparing 3 arrays

public class Main{
	public static void main(String[] args){

		// Array1 object for DynamicArray class
		DynamicArray Array1 = new DynamicArray(20);

		System.out.println("***********************************************");
		System.out.println("Program to dynamically adjust 3 arrays: ");
		System.out.println();
		System.out.println("Array1 created.");

		// testing methods for array (adding/removing elements)
		Array1.add(7);
		Array1.add(-4);
		Array1.add(8);
		Array1.add(-6);
		Array1.add(-5);
		Array1.add(4);
		Array1.delete();
		Array1.delete();
		Array1.add(11);
		Array1.add(14);
		Array1.add(6);

		System.out.println("Elements added/removed from Array1.");
		System.out.println();

		// creates a copy of Array1 as Array2/Array3 through copy method
		DynamicArray Array2 = new DynamicArray(Array1.copy());
		DynamicArray Array3 = new DynamicArray(Array1.copy());
		System.out.println("Array2 and Array3 created.");
		System.out.println();

		// calls method equals to compare Array1 to Array2
		System.out.println("Is Array1 equal to Array 2?");
		if(Array1.equals(Array2)){
			System.out.println("Array1 is equal to Array2.");
		}else{
			System.out.println("Array 1 is not equal to Array2.");
		}
		System.out.println();	


		// dynamically adjusting Array2 with add/delete methods
		Array2.delete();
		Array2.add(4);
		Array2.add(9);

		System.out.println("Elements added/removed from Array2.");

		// dynamically adjusting Array3 with add/delete methods
		Array3.add(9);
		Array3.add(8);
		Array3.delete();	

		System.out.println("Elements added/removed from Array3.");
		System.out.println();

		// calls method equals to compare Array1 to Array2
		System.out.println("Is Array1 equal to Array 2 now?");
		if(Array1.equals(Array2)){
			System.out.println("Array1 is equal to Array2.");
		} else{
			System.out.println("Array 1 is not equal to Array2.");
		}
		System.out.println();


		// calls method equals to compare Array1 to Array3
		System.out.println("Is Array1 equal to Array 3 now?");	
		if(Array1.equals(Array3)){
			System.out.println("Array1 is equal to Array3.");
		}else{
			System.out.println("Array 1 is not equal to Array3.");
		}
		System.out.println();	

		// prints current arrays
		System.out.println("Your current dynamically adjusted arrays: ");
		System.out.println("Array 1: " + Array1);
		System.out.println("Array 2: " + Array2);	
		System.out.println("Array 3: " + Array3);	
		System.out.println();

		// NPNN = number positive, number negative
		// creates array NPNN for each of the 3 arrays
		// prints return value based on index
		int[] NPNN = Array1.NPNN();
		System.out.println("Array1 number of positive integers: " + NPNN[0]);
		System.out.println("Array1 number of negative integers: " + NPNN[1]);
		System.out.println();

		NPNN = Array2.NPNN();
		System.out.println("Array2 number of positive integers: " + NPNN[0]);
		System.out.println("Array2 number of negative integers: " + NPNN[1]);
		System.out.println();

		NPNN = Array3.NPNN();
		System.out.println("Array3 number of positive integers: " + NPNN[0]);
		System.out.println("Array3 number of negative integers: " + NPNN[1]);
		System.out.println("***********************************************");
	}
}