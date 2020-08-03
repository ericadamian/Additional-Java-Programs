// java program by Eric Adamian
// calculates a circle's area, diameter, and circumference based on user input of radius

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the circle's radius in inches: ");
		double input = scan.nextDouble();

		Circle circle = new Circle(input);
		
		System.out.println("Area of the circle: " + circle.getArea() + " inches.");
		System.out.println("Diameter of the circle: " + circle.getDiameter() + " inches.");
		System.out.println("Circumference of the circle: " + circle.getCircumference() + " inches.");
	}
}