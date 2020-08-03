// java program by Eric Adamian
// setters and getters for variables for main method

public class Circle{

	double radius;
	private final double pi = 3.14159;

	public Circle(){
		radius = 0.0;
	}
	
	public Circle(double r){
		radius = r;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return pi * radius * radius;
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	public double getCircumference(){
		return 2 * pi * radius;
	}
}