/*
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All
payments must implement a pay() method.
Problem Statement:
● Create an interface Payment → method pay(double amount)
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay()
implementation
● In main(), take payment amount and process payment using both methods
Sample Input:
CreditCardPayment → amount=2500
PayPalPayment → amount=1500
Sample Output:
Processing Credit Card Payment of 2500
Processing PayPal Payment of 1500

*/

public class TestPayment{
	
	public static void main(String args[]){
			IPayment ip = new PayPalPayment(777.7);
			ip.Pay(555.00);
	}
}

interface IPayment
{
	
	public void Pay(double amount);
}

class PayPalPayment implements IPayment
{
	double amount;
	PayPalPayment(double amount)
	{
		this.amount=amount;
	}
	@Override
	public void Pay(double amount){
		if(this.amount>0)
			System.out.println("current credit card payment of - "+amount);
		else
			System.out.println("invalide ammount");
	}
}

class CreditCardPayment implements IPayment{
	
	double amount;
		CreditCardPayment(double amount){
			this.amount=amount;
		}
		
	@Override	
	public void Pay(double amount){
		if(this.amount>0)
			System.out.println("payment done");
		else
			System.out.println("invalide ammount");
	
	}
}

