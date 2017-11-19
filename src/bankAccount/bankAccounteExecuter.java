package bankAccount;

import bankAccount.backEnd;
import java.util.Scanner;

public class bankAccounteExecuter {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		backEnd bank = new backEnd();
		
		System.out.println("Would you like to start a bank account?");
		String start_ = keyboard.nextLine();
		
		if(start_.equals("Y")) {
			System.out.println("How much do you want to put in");
			int d = keyboard.nextInt();
			bank.setBalance(d);
		
		}
		
		System.out.println("Your current balance: $" + bank.getBalance());
		
		bank.deposit(1000);
		
		bank.withdraw(50);
		
		
		System.out.println("Your current balance: $" + bank.getBalance());
		
		
		
	}
}
