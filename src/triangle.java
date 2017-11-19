
public class triangle {
	/**
	 * @author Wesam Saleh
	 * @Version 1.0
	 * Class that creates a triangle and gets properties of the triangles including side and angle measures and Area/Perimeter
	 */
	private double side1;
	private double side2;
	private double side3;
	private double angle1;
	private double angle2;
	private double angle3;
	private double perimeter;
	private double area;
	
	/**
	 * Creates a triangle and calculates the angle and side measures using the law of cosines and then coordinate points passed in
	 * @param x1 First x coordinate
	 * @param y1 First y coordinate
	 * @param x2 Second x coordinate
	 * @param y2 Second y coordinate
	 * @param x3 Third x coordinate
	 * @param y3 Third y coordinate
	 */
	public triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
		side1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		side2 = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
		side3 = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
		
		angle1 = Math.acos((Math.pow(side1,2) + Math.pow(side2, 2) -Math.pow(side3, 2))/ (2*side1*side2));
		angle2 = Math.acos((Math.pow(side2,2) + Math.pow(side3, 2) -Math.pow(side1, 2))/ (2*side2*side3));
		angle3 = Math.acos((Math.pow(side3,2) + Math.pow(side1, 2) -Math.pow(side2, 2))/ (2*side3*side1));
		
		angle1 = Math.toDegrees(angle1);
		angle2 = Math.toDegrees(angle2);
		angle3 = Math.toDegrees(angle3);
	}
	
	/**
	 * Returns the measure of Angle 1
	 */
	public double getAngle1() {
		return angle1;
	}

	/**
	 * Returns the measure of Angle 2
	 */
	public double getAngle2() {
		return angle2;
	}
	
	/**
	 * Returns the measure of Angle 3
	 */
	public double getAngle3() {
		return angle3;
	}	
	
	/**
	 * Returns the measure of Side1
	 */
	public double getSide1() {
		return side1;
	}
	
	/**
	 * Returns the measure of Side2
	 */
	public double getSide2() {
		return side2;
	}
	
	/**
	 * Returns the measure of Side3
	 */
	public double getSide3() {
		return side3;
	}
	
	/**
	 * Calculates the triangle area using Heron's formula
	 */
	public void triArea() {
		double s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	
	/**
	 * Calculates the triangle perimeter by adding the sides
	 */
	public void triPerim() {
		perimeter = side1+side2+side3;
	}
	
	/**
	 * Returns the area of the triangle
	 */
	public double getArea() {
		return area;
	}
	
	/**
	 * Returns the perimeter of the triangle
	 */
	public double getPerimeter() {
		return perimeter;
	}
	
}


