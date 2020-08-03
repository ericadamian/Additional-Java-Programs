// java program by Eric Adamian
// program takes in input file, creates upper case characters for output/append files

import java.io.*;
import java.util.Scanner;

public class FileIO{
	public static void main(String[] args) throws IOException{

		// scanner
		Scanner scan = new Scanner(System.in);

		// input file
		System.out.print("Please enter an input filename: ");
		String input = scan.nextLine();

		// reads through input file
		File read = new File(input);
		Scanner inputFile = new Scanner(read);

		//********************************************************
		
		// output file
		System.out.print("Please enter an output filename: ");
		String output = scan.nextLine();

		// print text to output file
		PrintWriter outputPrint = new PrintWriter(output);

		//********************************************************

		// append file
		System.out.print("Please enter another output filename (append): ");
		String append = scan.nextLine();

		// create and write to appended file
		FileWriter write = new FileWriter(append);
		PrintWriter appendPrint = new PrintWriter(write);

		//********************************************************

		// prints uppercase to output and append files
		while(inputFile.hasNext()){
			String line = inputFile.nextLine();
			outputPrint.println(line.toUpperCase());
			appendPrint.println(line.toUpperCase());
		}

		// results
		System.out.println();
		System.out.println("New output/append files created: characters changed to uppercase. ");

		//closing each file
		outputPrint.close();
		appendPrint.close();
	}
}