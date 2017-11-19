import java.util.Scanner;
public class readLine {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String line = keyboard.nextLine();
		
		for(int i = 0; i<line.length(); i++) {
			System.out.println(line.charAt(i));
			
		}
	}
}


/* After inputing Mr Cohen
Enter a string: 
Mr Cohen
M
r
 
C
o
h
e
n
*/