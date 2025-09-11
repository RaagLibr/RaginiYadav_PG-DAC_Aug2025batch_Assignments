
class BankAccountProtectionTest{
	public static void main(String args[])
	{
		BankAccountProtection bap1 = new BankAccountProtection(3000,2000,100000);
		bap1.deposit(400);
		System.out.println("deposit -> "+bap1.deposit+"widraw -> "+bap1.widraw+"details -> "+bap1.balance);
		bap1.widraw(200);
		bap1.setDeposit(2000);
		BankAccountProtection bap2 = new BankAccountProtection(3000,2000,100000);
			
		System.out.println("deposit -> "+bap1.deposit+"widraw -> "+bap1.widraw+"details -> "+bap1.balance);
		System.out.println("deposit -> "+bap2.deposit+"widraw -> "+bap2.widraw+"details -> "+bap2.balance);
	
	}
}


class BankAccountProtection
{
	int deposit, widraw;
	long balance;
	
	BankAccountProtection(int deposit, int widraw, long balance)
	{
		this.deposit=deposit;
		this.widraw=widraw;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		if(this.balance<0)
		{
			balance=this.balance+this.deposit;
		}
		
	}
	public void widraw(double amount)
	{
		if(balance>0 && balance>=balance-widraw)
		{
			this.balance=balance-widraw;
			System.out.println("current balance - "+this.balance);
		}
		else{
			System.out.println("ensuffiecient balc. ");
		}
		
	}
	
	//getter
	public long getbalance()
	{
		return balance;
	}
	public int getWidraw()
	{
		return widraw;
	}
	public int getDeposit()
	{
		return deposit;
	}
	
	
	//setter
	public void setbalance(int balance)
	{
		this.balance=balance;
	}
	public void setWidraw(int widraw)
	{
		this.widraw=widraw;
	}
	public void setDeposit(int deposit)
	{
		this.deposit=deposit;
	}
	
}
