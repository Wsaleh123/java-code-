import java.util.Scanner;

public class triangleProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("X coordinate of Point 1: ");
		int x1 = keyboard.nextInt();
		System.out.print("Y coordinate of Point 1: ");
		int y1 = keyboard.nextInt();
		System.out.print("X coordinate of Point 2: ");
		int x2 = keyboard.nextInt();
		System.out.print("Y coordinate of Point 2: ");
		int y2 = keyboard.nextInt();
		System.out.print("X coordinate of Point 3: ");
		int x3 = keyboard.nextInt();
		System.out.print("Y1 coordinate of Point 3: ");
		int y3 = keyboard.nextInt();

		triangle tri = new triangle(x1,y1,x2,y2,x3,y3);
		
		System.out.println("_______________________________________________________________________________________");
		
		System.out.println("");
		
		System.out.println("                     Value");
		
		System.out.println("");
		
		System.out.println("Side 1:         " + tri.getSide1());
		System.out.println("Side 2:         " + tri.getSide2());
		System.out.println("Side 3:         " + tri.getSide3());
		
		System.out.println("");
		
		System.out.println("Angle 1:        " + tri.getAngle1());
		System.out.println("Angle 2:        " + tri.getAngle2());
		System.out.println("Angle 3:        " + tri.getAngle3());
		
		System.out.println("");
		
		tri.triPerim();
		System.out.println("Perimeter:      " + tri.getPerimeter());
		
		System.out.println();
		
		tri.triArea();
		System.out.println("Area:           " + tri.getArea());
		
	

	}

}
