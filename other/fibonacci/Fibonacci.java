// java program by Eric Adamian
// program that calculates the n'th Fibonacci value

import java.math.*; 
import java.util.Scanner;
  
public class Fibonacci{ 

    public static void main(String[] args) { 

        // scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an int to calculate the n'th Fibonacci value: ");
        int n = scan.nextInt();

        System.out.println("The Fibonacci value of " + n + " is " + fibonacci(n + 1)); 
    }

    // biginteger prevents overflow error for n >= 47
    public static BigInteger fibonacci(int n){ 
        BigInteger a = BigInteger.ZERO; 
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE; 

        // for fibonacci values n >= 2
        for (int j = 2; j <= n; j++){ 
            a = b; 
            b = c; 
            c = a.add(b); 
        } 
        return a; 
    }  
} 