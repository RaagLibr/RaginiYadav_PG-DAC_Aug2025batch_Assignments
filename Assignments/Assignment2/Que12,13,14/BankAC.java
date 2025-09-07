class BankAC
{
	int acNo;
	double balance;
	String acHolder;
	static String bankName="CDAC bank";
	BankAC(int acNo, int balance, String acHolder)
	{
		this.acNo=acNo;
		this.balance=balance;
		this.acHolder=acHolder;
	}
	
	//getter
	public double getBalance()
	{
		return balance;
	}
	//setter
	public void setACno(int balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		if(balance>0)
		{
				this.balance+=amount;
				System.out.println("Deposited: " + amount + " | New Balance: " + balance);
				
		}
		else 
		{
			System.out.println("invalide deposit.");
		}
	}
	
	public void verifyAC(int acNo)
	{
		if(this.acNo==acNo)
		{
			System.out.println("this account is verified");
		}
		else
		{
				System.out.println("this is not verified account.");
		
		}
	}
	public static void main(String args[])
	{
			BankAC ab = new BankAC(33,3000,"ragini");
			System.out.println("Account Holder : "+ab.acHolder+", account no. : "+ab.acNo+", Account Balance : "+ab.balance);					//02227565303210
			ab.deposit(2000);
			ab.verifyAC(33);
			
			System.out.println("Updated Balance: " + ab.getBalance());
	}	
}