import java.lang.Math;
import java.util.Scanner;

public class triangleArea {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double side1 = keyboard.nextDouble();
		double side2 = keyboard.nextDouble();
		double side3 = keyboard.nextDouble();

		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
		
		System.out.println(area);
	
	}
}

