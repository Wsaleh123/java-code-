
public class BankAccount {
	/**
	 * @author Haim Cohen
	 * @version 1.0
	 * Class that creates a Bank Account and allows for simple interactions, such as depositing, withdrawing, and getting the variable values
	 */
	    private double balance;
	    private String account;
	    private double apr = .0025 ;

	    /**
	     * Creates a bank account with default name 12345, and sets the initial balance to the value that was passed in
	     * @param initialBalance - The initial balance of the bank account 
	     */
	    public BankAccount(double initialBalance){
	        balance = initialBalance;
	        account = "12345";

	    }

	    /**
	     * Creates a bank account and sets the account variable to the name that was passed in, and the intitial balance to the value that was passed in
	     * @param n - The name of the account
	     * @param initialBalance - The initial balance of the account
	     */
	    public BankAccount(String n, double initialBalance ){
	        balance = initialBalance;
	        account = n;
	    }

	    /**
	     * Creates a bank account and sets with no parameters and sets the default balance to 0 and the default account name to 12345
	     */
	    public BankAccount() {
	        balance = 0;
	        account = "12345";
	    }

	    /**
	     * Returns the balance at any given moment
	     *
	     *
	     */
	    public double getBalance(){
	    	return balance; 
	    }

	    /**
	     * Returns the account name at any given moment
	     *
	     */
	    public String getAccount(){
	    	return account; 
	    }

	    /**
	     * Returns the interest rate at any given moment 
	     *
	     */
	    public double getInterestRate(){
	    	return apr;
	    }

	    /**
	     * Adds a given amount that is passed in, to the balance
	     * @param amount - Amount deposited that is passed as a parameter
	     */
	    public void deposit(double amount){
	    	balance = balance + amount;
	    }

	    /**
	     * Subtracts a given amount that is passed in, to the balance
	     * @param amount - Amount withdrawn that is passed as a parameter
	     */
	    public void withdraw (double amount){
	    	balance = balance - amount;

	    }

	}

