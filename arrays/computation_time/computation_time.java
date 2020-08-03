// java program by Eric Adamian
// stores random array/arraylist of 8000 integers (random values from 1 to 1000)
// calculate computation time from 10 runs

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList; 

public class computation_time{
	public static void main(String[] args){

		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>(8000);
		int array[] = new int[8000];
		int arraylist[] = new int[8000];

		// ***************************************************************
		// array
		double time1 = 0;
		
		// start time
		long startTime1 = System.nanoTime();

		// looping through array
		for(int i = 0; i < array.length; i++){
			array[i] = random.nextInt(999);
		}

		// end time
		long endTime1 = System.nanoTime();

		// calculating average computation time for 10 runs
		for(int i = 0; i < 10; i++){
			time1 = (endTime1 - startTime1); 
		}

		// calculating time (nanoseconds to milliseconds)
        time1 = (double)(endTime1 - startTime1) / 1000000;

		System.out.println("\nArray computation time: " + time1 + " ms");

		// ***************************************************************
		// arraylist

		double time2 = 0;

		// start time
		long startTime2 = System.nanoTime();

		// looping through arraylist
		for(int i = 0; i < arraylist.length; i++){
			list.add(random.nextInt(999));
		}

		// end time
		long endTime2 = System.nanoTime();

		// calculating average computation time for 10 runs
		for(int i = 0; i < 10; i++){
			time2 = (endTime2 - startTime2); 
		}

		// calculating time (nanoseconds to milliseconds)
        time2 = (double)(endTime2 - startTime2) / 1000000;
		
		System.out.println("Arraylist computation time: " + time2 + " ms");

		// ***************************************************************
		// final results

		if(time1 < time2){
			System.out.println("\nArray computation is faster than arraylist.\n");
		}else{
			System.out.println("\nArraylist computation is faster than array.\n");
		}
	}
}