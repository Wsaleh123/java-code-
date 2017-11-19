import java.util.Scanner;
public class NumSort {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Please enter three numbers separated by spaces.");
		String answer = keyboard.nextLine();

		Scanner parser = new Scanner(answer);
		double num1 = parser.nextDouble();
		double num2 = parser.nextDouble();
		double num3 = parser.nextDouble();

		double firstNum = 0.0;
		double secondNum = 0.0;
		double thirdNum = 0.0;
		
		if(num1 >= num2 && num1 >= num3)
			thirdNum = num1;
		else if(num2 >= num1 && num2 >= num3)
			thirdNum = num2;
		else if(num3 >= num1 && num3 >= num2)
			thirdNum = num3;
		else
			System.out.println("Error");
		
		if(num1 <= num2 && num1 <= num3)
			firstNum = num1;
		else if(num2 <= num1 && num2 <= num3)
			firstNum = num2;
		else if(num3 <= num1 && num3 <= num2)
			firstNum = num3;
		else
			System.out.println("Error");
		

		if((num1 >= num2 && num1<= num3) || (num1 <= num2 && num1 >= num3))
			secondNum = num1;
		else if((num2 >= num1 && num2<= num3) || (num2 <= num1 && num2 >= num3))
			secondNum = num2;
		else if((num3 >= num2 && num3<= num1) || (num3 <= num2 && num3 >= num1))
			secondNum = num3;
		else
			System.out.println("Error");

		System.out.println("First Number: " + firstNum);
		System.out.println("Second Number: " + secondNum);
		System.out.println("Third Number: " + thirdNum);

	}
}
/* Tester 

	// 3 2 1 (1 random test just to see if it works)
	 
	 Expected output: 
	 	Please enter three numbers separated by spaces.
	 	3 2 1
	 	First Number: 1.0
	 	Second Number: 2.0
	 	Third Number: 3.0
	 	
	 Actual Output:
	 	Please enter three numbers separated by spaces.
		3 2 1
		First Number: 1.0
		Second Number: 2.0
		Third Number: 3.0

	 // -123 1.457 100023 (1 extreme test to see if it works with any double (+ or -))
	  
	  	Expected output:
	  		Please enter three numbers separated by spaces.
			-123 1.457 100023
			First Number: -123.0
			Second Number: 1.457
			Third Number: 100023.0
		
		Actual output:
	  		Please enter three numbers separated by spaces.
			-123 1.457 100023
			First Number: -123.0
			Second Number: 1.457
			Third Number: 100023.0
			
	 // 5 4 6 (1 test to see if it can sort numbers that are not already in order)
	  	
	  	Expected Output:
	  		Please enter three numbers separated by spaces.
			5 4 6
			First Number: 4.0
			Second Number: 5.0
			Third Number: 6.0
		
		Actual Output:
			Please enter three numbers separated by spaces.
			5 4 6
			First Number: 4.0
			Second Number: 5.0
			Third Number: 6.0


 */
