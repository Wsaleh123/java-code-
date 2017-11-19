
public class LineTester {
	public static void main(String[] args) {
		
		Line line = new Line(5);
		Line line2 = new Line(2, 0);
		Line line3 = new Line(3, 1, 1, 0);
		Line line4 = new Line(2, 4 , 2);
		Line line5 = new Line(2,8);
		
		
		System.out.println("		Line line = new Line(5);\r\n" + 
				"		Line line2 = new Line(2, 0);\r\n" + 
				"		Line line3 = new Line(3, 1, 1, 0);\r\n" + 
				"		Line line4 = new Line(2, 4 , 2);\r\n" + 
				"		Line line5 = new Line(2,8);");
		
		System.out.println("");
		System.out.println("Line2: Expected Results: Actual Results");
		
		System.out.println("");
		
		System.out.println("Intersects line: True: " + line2.intersects(line));
		System.out.println("Equals line: False: " + line2.equals(line));
		System.out.println("isParallel to line: False: " + line2.isParallel(line));

		System.out.println("");

		System.out.println("Intersects line3: True: " + line2.intersects(line3));
		System.out.println("Equals line3: False: " + line2.equals(line3));
		System.out.println("isParallel to line3: False: " + line2.isParallel(line3));

		System.out.println("");

		System.out.println("Intersects line4: False: " + line2.intersects(line4));
		System.out.println("Equals line4: True: " + line2.equals(line4));
		System.out.println("isParallel to line4: True: " + line2.isParallel(line4));
		
		System.out.println("");

		System.out.println("Intersects line5: False: " + line2.intersects(line5));
		System.out.println("Equals line5: False: " + line2.equals(line5));
		System.out.println("isParallel to line5: True: " + line2.isParallel(line5));


	}
}

/*		Line line = new Line(5);
Line line2 = new Line(2, 0);
Line line3 = new Line(3, 1, 1, 0);
Line line4 = new Line(2, 4 , 2);
Line line5 = new Line(2,8);

Line2: Expected Results: Actual Results

Intersects line: True: true
Equals line: False: false
isParallel to line: False: false

Intersects line3: True: true
Equals line3: False: false
isParallel to line3: False: false

Intersects line4: False: false
Equals line4: True: true
isParallel to line4: True: true

Intersects line5: False: false
Equals line5: False: false
isParallel to line5: True: true
*/