import java.util.Scanner;
public class mario {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		 System.out.printf("Enter a non-negative integer < 24: "); // Prompts for a value for height //
		    int height = keyboard.nextInt(); // Gets a value for height //

		    while(height < 0 || height > 23) // Accepts only a non-negative hieght that is less than 24 //
		    {
		        System.out.printf("Enter a non-negative integer < 24: ");
		        height = keyboard.nextInt();
		    }

		    for(int i = 0; i <= height - 1; i++) // Loops through and prints the spaces
		    {
		        for(int x = height - i - 2; x >= 0; x--)
		        {
		            System.out.printf("%s", " ");
		        }
		        for(int j = 0; j <= i; j++)
		        {
		            System.out.printf("%s", "#");
		        }
		        System.out.printf("  ");
		        for(int j = 0; j <= i; j++)
		        {
		            System.out.printf("%s", "#");
		        }
		        for(int x = height - i - 2; x >= 0; x--)
		        {
		            System.out.printf("%s", " ");
		        }
		        System.out.printf("\n");
		    }
	}

}
