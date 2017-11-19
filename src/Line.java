/**
 * @author: Wesam Saleh
 * @version: 1.0
 * @title: Line Class
 */
public class Line {
	
	private double slope_private;
	private double y_int;
	
	/**
	 * Constructs a Line given an x and y coordinate and a slope
	 * @param x - x-coordinate
	 * @param y - y-coordinate
	 * @param m - slope
	 */
	public Line(double x, double y, double m) {
		slope_private = m;
		y_int = y - (m*x);
	}
	
	/**
	 * Constructs a Line given 2 coordinate points
	 * @param x1 - x of first coordinate
	 * @param y1 - y of first coordinate
	 * @param x2 - x of second coordinate
	 * @param y2 - y of second coordinate
	 */
	public Line(double x1, double y1, double x2, double y2) {
		slope_private = (y2-y1)/(x2-x1);
		y_int = y1 - (slope_private*x1);
	}
	
	/**
	 * Constructs a Line given a slope and y-intercept from the equation y=mx+b
	 * @param m - slope 
	 * @param b - y-intercept
	 */
	public Line(double m, double b) {
		slope_private = m;
		y_int = b;
	}
	
	/**
	 * Constructs a vertical Line given just an x intercept
	 * @param a - x-intercept
	 */
	public Line(double a) {
		slope_private = 0;
		if(a == 0.0) 
			y_int = 0;

	}
	/**
	 * Checks if two Lines intersect
	 * @param other - the second line
	 */
	boolean intersects(Line other) {
		return (slope_private != other.slope_private);
	}
	
	/**
	 * Checks if two lines are equal to each other
	 * @param other - the second line
	 */
	boolean equals(Line other) {
		return ((slope_private == other.slope_private) && (y_int == other.y_int));
	}
	
	/**
	 * Checks if two lines are parallel 
	 * @param other - the second line
	 */
	boolean isParallel(Line other) {
		return (slope_private == other.slope_private);
	}
}
