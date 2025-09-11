class TestBank
{
	public static void main(String args[])
	{
		Account ac = new Account(505,444.55);
		ac.accountDetails();
		
		Account ac1= new SavingAccount(404,555.55,5.5);
		ac1.accountDetails();
	
		Account ac2= new CurrentAccount(303,665.55,5.5);
		ac2.accountDetails();
	
	}
}

class Account
{
	int accountNo;
	double balance;
	Account(int accountNo, double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public void accountDetails()
	{
		System.out.println("Saving → "+accountNo+", Balance="+5000+", Interest="+5+"%");
	}
}

class SavingAccount extends Account
{
	double intrestRate=5;
	SavingAccount(int accountNo, double balance,double intrestRate)
	{
		super(accountNo,balance);
		
	}
	
	@Override
	public void accountDetails()
	{
		System.out.println("Saving → "+accountNo+", Balance="+balance+", InterestRate="+intrestRate+"%");
	
	}
}

class CurrentAccount extends Account
{
	double overdraftLimit=2000.0;
	CurrentAccount(int accountNo, double balance, double overdraftLimit){
		super(accountNo,balance);
		
	}
	
	@Override
	public void accountDetails()
	{
		System.out.println("Saving → "+accountNo+", Balance="+balance+", overdraftLimit="+overdraftLimit+"%");
	
	}
}