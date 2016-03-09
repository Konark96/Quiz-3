package base;

/*
Design a class named Triangle that extends GeometricObject (attached to question). The class contains: 
Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
A no-arg constructor that creates a default triangle.
A constructor that creates a triangle with the specified side1, side2, and side3.
The accessor methods for all three data fields.
A method named getArea() that returns the area of this triangle.
A method named getPerimeter() that returns the perimeter of this triangle.
A method named toString() that returns a string description for the triangle.
Junit test cases (test Area, Perimeter calculations)


Deliverables:

Java Project using JDK 1.8 and Maven (build is dependent on the successful test cases)
Encapsulated class with private attributes, public methods
JUnit 4 test cases implemented.
Methods should be well-documented, and javadocs created for project
Make sure to submit a .zip file (not jar, not .war, not .rar)

 */

/*
 * @Author Konark Christian
 * @Version 1.1
 */
public class Triangle extends GeometricObject{
	private double side1, side2, side3, defaultSide = 1.0; //3 Sides of the triangle and the default size of the sides
	public Triangle(){
		side1 = defaultSide; 
		side2 = defaultSide;
		side3 = defaultSide;
	}
	public Triangle(double a, double b, double c){
		side1= a;
		side2= b;
		side3= c;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea(){
		double avgSide = (side1 + side2 + side3)/3;
		return avgSide*avgSide;
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}	
	public String toString(){
		return "Side 1 is " + side1 + " long.\n"
				+ "Side 2 is " + side2 + " long\n"
				+ "Side 3 is " + side3 + " long";
	}
	
}
