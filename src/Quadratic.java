
public class Quadratic {

	private double a;
	private double b;
	private double c;
	
	/**
	 * Constructs a Quadratic Equation using an A and B coeffecient and a C constant
	 * @param ax2: The A coeffecient 
	 * @param bx: The B coeffecient
	 * @param cx0: The C coeffecient 
	 */
	public Quadratic(double ax2, double bx, double cx0) {
		a = ax2;
		b = bx;
		c = cx0;
	}
	
	/**
	 * Calculates the Discriminant by using the equation b^2-4ac
	 */
	public double calcDiscriminant() {
		double discriminant = (b*b) - (4*(a)*(c));
		return discriminant;

	}
	
	/**
	 * Checks to see if there is a solution by checking if the discriminant is a negative number
	 */
	public boolean hasSolution() {
		if (calcDiscriminant() < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Calculates the first Solution by using the Quadratic Equation (ONLY calculates -b plus ... NOT -b minus ...)
	 */
	public double calcSolution1(){
		if (hasSolution() == true) {
			double k = ((-1*b) + Math.sqrt(calcDiscriminant()))/ (2*a);
			if(k == 0){
				k = Math.abs(k);
			}
			return k;
		}
		else {
			double k = 0;
			return k;
		}
		
	}
	
	/**
	 * Calculates the second Solution by using the Quadratic Equation (ONLY calculates -b minus ... NOT -b plus ...)
	 */
	public double calcSolution2() {
		if (hasSolution() == true) {
			double k = ((-1*b) - Math.sqrt(calcDiscriminant()))/ (2*a);
			if(k == 0){
				k = Math.abs(k);
			}
			return k;
		}
		else {
			double k = 0;
			return k;
		}

	}
	
	/**
	 * Checks to see which of the two solutions is smaller and returns that one 
	 */
	public double getSolution1() {
		if(calcSolution1() < calcSolution2())
			return calcSolution1();
		else
			return calcSolution2();
	}
	
	/**
	 * Checks to see which of the two solutions is bigger and returns that one 
	 */
	public double getSolution2() {
		if(calcSolution2() > calcSolution1())
			return calcSolution2();
		else
			return calcSolution1();
	}

	

}
