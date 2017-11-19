
public class Balloon {
	private double air;
	/**
	 * @author Wesam Saleh
	 * @version 1.0
	 * Class that allows you to fill up a balloon, then calculates the Volume, Surface Area, and Radius
	 */
	
	/**
	 * Creates an empty balloon
	 */
	public Balloon() {
		air = 0;
	}
	
	/**
	 * Allows you to fill up the balloon with air
	 * @param amount Amount of air that goes into the balloon
	 */
	public void addAir(double amount) {
		air += amount;
	}
	
	/**
	 * Returns the volume of the balloon which is the same as air
	 */
	public double getVolume() {
		return air;
	}
	
	/**
	 * Calculates and returns the surface area calculated by the formula for a sphere
	 */
	public double getSurfaceArea() {
		double surfaceArea = 4 * Math.PI * Math.pow(getRadius(), 2);
		return surfaceArea;
	}
	
	/**
	 * Calculates the radius by reversing the formula of the volume of a sphere
	 */
	public double getRadius() {
		double radius = Math.cbrt(getVolume()/(4/3)* Math.PI);
		return radius;
	}
}

/*
Initial:
Balloon Volume: 0.0
Balloon Surface Area: 0.0
Balloon Radius: 0.0
After adding initial first 100 cm^3:
Balloon Volume: 100.0
Balloon Surface Area: 580.7329203222846
Balloon Radius: 6.7980333511054285
After adding another 100 cm^3:
Balloon Volume: 200.0
Balloon Surface Area: 921.8560486321595
Balloon Radius: 8.564985316945116
*/