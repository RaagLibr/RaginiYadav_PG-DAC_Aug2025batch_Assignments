import java.util.*;

public class Test
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
	   BankAccount[] ba= new BankAccount[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Account"+(i+1)+": Name :");
			String name = sc.nextLine();
			
			System.out.println("Balance : ");
			int balance = sc.nextInt();
			sc.nextLine();
			
			ba[i]=new BankAccount(name,balance);
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Account : Name :"+ba[i].getName()+", Balance: "+ba[i].getBalance()+" Interest Rate= "+b1.getinterest_rate()+"%");
			//System.out.println("Bank Interest Rate Initialized: "+(BankAccount.interest_rate*100)+"%");
			//b1.getinterest_rate();
		}
	}

}