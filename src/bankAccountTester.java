public class bankAccountTester {
	public static void main (String[] args) {
		
		BankAccount bank = new BankAccount();
		System.out.println("Expected balance: 0.0 -- Actual balance: " + bank.getBalance());
		System.out.println("Expected account: 12345 -- Actual balance: " + bank.getAccount());
		//__________________________________________________________________________________________

		System.out.println("");
		
		BankAccount bank1 = new BankAccount(500.00);
		System.out.println("Expected balance: 500.00 -- Actual balance: " + bank1.getBalance());
		System.out.println("Expected account: 12345 -- Actual balance: " + bank1.getAccount());		
		//__________________________________________________________________________________________

		System.out.println("");
		
		BankAccount bank2 = new BankAccount("MyBank", 700.00);
		System.out.println("Expected balance: 700.00 -- Actual balance: " + bank2.getBalance());
		System.out.println("Expected account: MyBank -- Actual balance: " + bank2.getAccount());		
		//__________________________________________________________________________________________
		
		System.out.println("");
		
		double intRate = bank.getInterestRate();
		System.out.println("Expected interest rate: 0.0025 -- Actual interest rate: " + intRate);
		//__________________________________________________________________________________________

		System.out.println("");
		
		bank.deposit(100);
		System.out.println("Expected Balance (after 100 deposit): 100.00 -- Actual Balance: " + bank.getBalance());
		//__________________________________________________________________________________________
		
		System.out.println("");
		
		bank.withdraw(100);
		System.out.println("Expected Balance (after 100 withdraw): 0.0 -- Actual Balance: " + bank.getBalance());
		

	}

}

/*
Expected balance: 0.0 -- Actual balance: 0.0
Expected account: 12345 -- Actual balance: 12345

Expected balance: 500.00 -- Actual balance: 500.0
Expected account: 12345 -- Actual balance: 12345

Expected balance: 700.00 -- Actual balance: 700.0
Expected account: MyBank -- Actual balance: MyBank

Expected interest rate: 0.0025 -- Actual interest rate: 0.0025

Expected Balance (after 100 deposit): 100.00 -- Actual Balance: 100.0

Expected Balance (after 100 withdraw): 0.0 -- Actual Balance: 0.0
*/