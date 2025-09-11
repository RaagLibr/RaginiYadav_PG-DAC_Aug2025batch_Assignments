class TestCompany
{
	public static void main(String args[])
	{
		CreditCardPayment ccp1 = new CreditCardPayment(6699,66.66);
		ccp1.pay();
		UPIPayment upt = new UPIPayment("ragini342434",555.55);
		upt.pay();
		CreditCardPayment ccp = new CreditCardPayment(987654399,666.55);
		ccp.pay();
	}
}

abstract class Pay{
	abstract void pay();

}

class CreditCardPayment extends Pay{
	
	long cardNo;
	double amount;
	CreditCardPayment(long cardNo, double amount){
		this.cardNo=cardNo;
		this.amount=amount;
	}
	public void pay()
	{
		System.out.println("Payment via Credit Card "+cardNo+"→ Rs. "+amount+" Paid");
	}
}

class UPIPayment extends Pay{
	String UPI_Id;
	double amount;
	
	UPIPayment(String UPI_Id, double amount)
	{
		this.UPI_Id=UPI_Id;
		this.amount=amount;
		
	}
	
	public void pay()
	{
		System.out.println("Payment via UPI "+UPI_Id+" → Rs. "+amount+"Paid");
	}
}