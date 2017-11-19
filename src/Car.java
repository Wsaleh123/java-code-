
public class Car {
	/**
	 * @author Wesam Saleh
	 * @version 1.0
	 * Class that creates a car and allows you to fill up the gas and drive 
	 */
	private int Gas;
	private int fuelEfficiency;
	
	/**
	 * Creates a Car with a specified feul efficiency (fe) and sets the amount of Gas in the tank to 0
	 * @param fe Fuel Effeciency of the car in miles/gallon
	 */
	public Car(int fe) {
		fuelEfficiency = fe;
		Gas = 0;
	}
	
	/**
	 * Allows the Car to drive and subtracts the amount of gas used to get the amount of gas left
	 * @param miles Number of miles the Car has driven
	 */
	public void drive(int miles) {
		Gas = Gas - (miles/fuelEfficiency);
	}
	
	/**
	 * Shows the amount of gas in the tank
	 */
	public int getGasInTank() {
		return Gas;
	}
	
	/**
	 * Adds an amount of gas that is specified
	 * @param amount Amount of Gas added
	 */
	public void addGas(int amount) {
		Gas = Gas + amount;
	}

}
