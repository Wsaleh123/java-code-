import java.util.Scanner;

public class QuadraticTester {
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter the A coefficient: ");
		double a = keyboard.nextDouble();
		System.out.print("Enter the B coefficient: ");
		double b = keyboard.nextDouble();
		System.out.print("Enter the C constant: ");
		double c = keyboard.nextDouble();
		
		Quadratic porabola = new Quadratic(a,b,c);
		
		System.out.println("");
		
		System.out.println("Actual Boolean: " +porabola.hasSolution());
		System.out.println("Actual Solution1: " + porabola.getSolution1());
		System.out.println("Actual Solution2: " +porabola.getSolution2());

		
		/* 
		 	// x^2 + 4x +4

		 	 	Expected Boolean: true
		 	 	Expected Solution 1 = -2.0
		 	 	Expected Solution 2 = -2.0
		 	 	
		 	 	Output:
		 	 		Enter the A coefficient: 1
					Enter the B coefficient: 4
					Enter the C constant: 4
					
					Actual Boolean: true
					Actual Solution1: -2.0
					Actual Solution2: -2.0
_______________________________________________________________________________________________________________________________________________________

			// -4.9x^2 + 20x
				
				Expected Boolean: True
				Expected Solution 1: 0
				Expected Solution 2: about 4.8
				
				Output:
					Enter the A coefficient: -4.9
					Enter the B coefficient: 20
					Enter the C constant: 0
					
					Actual Boolean: true
					Actual Solution1: 0.0
					Actual Solution2: 4.081632653061225

_______________________________________________________________________________________________________________________________________________________

			// x^2 + 5
			 	
			 	Expected Boolean: False
			 	Expected Solution 1 = 0.0
			 	Expected Solution 2 = 0.0
			 	
			 	Output:
			 		Enter the A coefficient: 1
					Enter the B coefficient: 0
					Enter the C constant: 5
					
					Actual Boolean: false
					Actual Solution1: 0.0
					Actual Solution2: 0.0
					
_______________________________________________________________________________________________________________________________________________________
			
			// x^2 + 2x - 8 
			 	
			 	Expected Boolean: True
			 	Expected Solution 1 = -4.0
			 	Expected Solution 2 = 2.0
			 	
			 	Output:
			 		Enter the A coefficient: 1
					Enter the B coefficient: 2
					Enter the C constant: -8
					
					Actual Boolean: true
					Actual Solution1: -4.0
					Actual Solution2: 2.0
		 	 		
		 */
		
		
		
		
	}

}
