/*
Problem 8: Bank Account Initialization
Scenario:
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account
has account holder name, balance, and interest rate. Students should practice static blocks for
initialization and setters/getters to modify and access account details.
Tasks:
1. Create a BankAccount class.
2. Use a static block to initialize interest rate to 4%.
3. Create instance variables: name (String) and balance (double).
4. Create setters and getters for name and balance.
5. Print account details including interest rate.
Input Example:
Account1: Name="Rohit", Balance=5000
Account2: Name="Priya", Balance=15000
Expected Output:
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%

*/
public class BankAccount
{
	String name;
	int balance;
	static double interest_rate;
	
	public BankAccount(){}
	public BankAccount(String name, int balance)
	{
		this.name=name;
		this.balance=balance;
		
	}
	
	
	static{
		interest_rate=0.04;
		System.out.println("Bank Interest Rate Initialized: 4.0%");
	}
	

    //setter
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public int getBalance()
	{
		return balance;
	}
	
	/*
	@Override
	public String toString()
	{
		return "{name :"+this.name+" Balance : "+this.balance+"}";
	}
	*/
	public double getinterest_rate()
	{
		//System.out.println("Bank Interest Rate Initialized: "+(interest_rate*100)+"%");
		return (interest_rate*100);
	}
}
