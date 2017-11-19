import java.util.Scanner;
public class NumSOrt2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 3 numbers.");
		
		String answer = keyboard.nextLine();
		
		Scanner parser = new Scanner(answer);
		double num1 = parser.nextDouble();
		double num2 = parser.nextDouble();
		double num3 = parser.nextDouble();

		double[] x = {num1, num2, num3};
		
		double min = num1;
		double mid = num2;
		double max = num3;
		
		while(!(min < mid && mid < max)) {
			for(int i=0; i<3; i++) {
				if(x[i] <= min) {
					min = x[i];
				}
				if(x[i]>= max) {
					max = x[i];
				}
				if(x[i] <= max && x[i] >= min) {
					mid = x[i];
				}
			}
		}
		
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		
	}
}
	
