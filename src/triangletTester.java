import java.util.Scanner;

public class triangletTester {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);


		triangle tri = new triangle(1,0,3,2,-4,-6);
		
		System.out.println("Expected Side 1 Value: 2.8 (about) -- Acutal Side 1 Value: " + tri.getSide1());
		System.out.println("Expected Side 2 Value: 10.6 (about) -- Acutal Side 1 Value: " + tri.getSide2());
		System.out.println("Expected Side 3 Value: 7.8 (about) -- Acutal Side 1 Value: " + tri.getSide3());
		
		System.out.println("");
		
		System.out.println("Expected Angle 1 Value: 3.8 (about) -- Actual Angle 1 Value: " + tri.getAngle1());
		System.out.println("Expected Angle 2 Value: 1.4 (about) -- Actual Angle 1 Value: " + tri.getAngle2());
		System.out.println("Expected Angle 3 Value: 174.8 (about) -- Actual Angle 1 Value: " + tri.getAngle3());

		System.out.println("");
		

		tri.triPerim();
		System.out.println("Expected Perimeter: 21.2 (about) -- Actual Perimeter: " + tri.getPerimeter());
		
		System.out.println("");

		tri.triArea();
		System.out.println("Expected Area: 1.0 (about) -- Actual Area: " + tri.getArea());

	}
	
}

/* Output for the points (1,0),(3,2), and (-4,-6) 

	Expected Side 1 Value: 2.8 (about) -- Acutal Side 1 Value: 2.8284271247461903
	Expected Side 2 Value: 10.6 (about) -- Acutal Side 1 Value: 10.63014581273465
	Expected Side 3 Value: 7.8 (about) -- Acutal Side 1 Value: 7.810249675906654
	
	Expected Angle 1 Value: 3.8 (about) -- Actual Angle 1 Value: 3.814074834290187
	Expected Angle 2 Value: 1.4 (about) -- Actual Angle 1 Value: 1.380354073444409
	Expected Angle 3 Value: 174.8 (about) -- Actual Angle 1 Value: 174.80557109226535
	
	Expected Perimeter: 21.2 (about) -- Actual Perimeter: 21.268822613387492
	
	Expected Area: 1.0 (about) -- Actual Area: 0.999999999999823
*/

//All angles add up to 180 which is further proof that the class works
