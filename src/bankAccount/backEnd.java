package bankAccount;

public class backEnd {
	private int balance;
	
	public String accountName(String str) {
		String accountN = str;
		return accountN;
	}
	
	public int setBalance(int start) {
		balance = start;
		return balance;
	}
	
	public int deposit(int add) {
		balance += add;
		return balance;
	}
	
	public int withdraw(int minus) {
		balance -= minus;
		return balance;
	}
	
	public int getBalance() {
		return balance;
	}
	

}
