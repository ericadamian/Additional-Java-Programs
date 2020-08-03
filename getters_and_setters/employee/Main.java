// java program by Eric Adamian
// provides raises to employees based on current salaries

import java.util.Scanner;

public class Main{

   public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		Employee[] employ = new Employee[5];

		// program description
		System.out.println();
		System.out.println("********************************************************");
		System.out.println("Program to compare and raise salaries for 5 employees.");
		System.out.println();
		System.out.println("Employees with salaries: ");
		System.out.println("\t1) under $30,000 will see a $5,000 increase.");
		System.out.println("\t2) between $30,000 and $45,000 will see a $3,000 increase.");
		System.out.println("\t3) over $45,000 will see a 5% increase.");
		System.out.println();

		// user input for employee data
		for(int i = 0; i < employ.length; i++){
			System.out.printf("Employee #%d: \n", i+1);

			System.out.print("Enter 4-digit SSN: ");
			String ssn = scan.next();
				
			if(ssn.length() != 4){
				System.out.println("Error: SSN must be 4 digits, try again.");
				System.exit(0);
			}
			scan.nextLine();
		
			System.out.print("Enter name: ");
			String name = scan.nextLine();
		
			System.out.print("Enter position: ");
			String position = scan.nextLine();
		
			System.out.print("Enter annual salary: $");
			int salary = scan.nextInt();
			
			System.out.println();
         
         	// comparing salaries and deciding on type of raise
			employ[i] = new Employee(ssn, name, position, salary);

			if(employ[i].getSalary() < 30000){
				employ[i].raise3();
			} else if (employ[i].getSalary() >= 30000 && employ[i].getSalary() < 45000){
				employ[i].raise2(3000);
			} else{
				employ[i].raise1(5);
			}
		}

		// printing final results
		System.out.println("********************************************************");
		System.out.println("Your final results for each employee's salary: ");
		System.out.println(); 

      	for (int i = 0; i < employ.length; i++){
            System.out.println(employ[i]);
      	}

        // conditions for employees with the same salaries
      	for(int i = 0; i < (employ.length - 1); i++){
         	for(int j = (i + 1); j < employ.length; j++){
             	if (employ[i].equals(employ[j])){
             		System.out.println();
             		System.out.println("********************************************************");
               		System.out.println("The following employees have the same salary (based on SSN): ");
               		System.out.println(employ[i].getSSN()+" : " + employ[j].getSSN());
             	}
        	}
        }   	
    }
}