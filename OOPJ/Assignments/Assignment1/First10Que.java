import java.util.Scanner;
class First10Que
{
	
	public static void que1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("write Test1");
		int Test1 = sc.nextInt();
		System.out.println("write Test2");
		int Test2 = sc.nextInt();
		if(Test1>0 && Test2>0)
		{
			String result = (Test1>Test2)?"Test 1 is greater":
							(Test2>Test1)?"Test 2 is greater":
								"both are equal";
								
								System.out.println(result);
		}		
			else 
			{
				System.out.println("please type a positive number");
				que1();
			}
		
	
	}
	
	public static void que2()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("wite salary of eacy company\n"+"com1\n"+"com2\n"+"com3\n");
			int com1=sc.nextInt(),com2=sc.nextInt(),com3=sc.nextInt();
			if(com1>0 && com2>0 && com3>0)
			{
				String result = (com1>com2 && com1>com3)?"Company 1 offers highest salary":
								(com2>com1 && com2>com3)?"Company 2 offers highest salary":
								(com3>com1 && com3>com2)?"Company 3 offers highest salary":
								
								(com1==com2)?"Company 1 & Company 2 have same highest salary":
								(com2==com3)?"Company 2 & Company 2 have same highest salary":"Company 1 & Company 3 have same highest salary";
								
								System.out.println(result);
								
			}
			else
			{
				System.out.println("please type valide positive integer");
				que2();
			}
			
			
	}
	
	public static void que3()
	{
		Scanner sc = new Scanner(System.in);
		int currentam = 2000, trasam=sc.nextInt();
		
		if(currentam>0)
		{
			String tras = (trasam<0)?"Withdrawal transaction.":"doposite tras";
			System.out.println(tras);
		}			
	}
	
	public static void que4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter locker number: ");
		int lockernum=sc.nextInt();
		String locker = (lockernum%2==0)?"even locker number":"odd locker number";
		System.out.println(locker);
		
	}
	
	public static void que5()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a year");
			int birthdate=sc.nextInt();
			//only think about true condition then use || &&
			String ans =(birthdate%4==0 && (birthdate%100!=0 || birthdate%100==0 && birthdate%400==0))?"Its leap year":"its not leap year";
			System.out.println(ans);
			
	}
	
	public static void que6()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("write length and width");
			int l=sc.nextInt(),w = sc.nextInt();
			if(l==w)
			{
				
				System.out.println("Square garden");
			}
			else{
				System.out.println("not a square garden");
			}
			
	}
	
	public static void que7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		if(marks>=35)
		{
			System.out.println("student is pass");
		}
	}
	
	public static void que8()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a amount");
			int purchaseam = sc.nextInt(),finalam;
			if(purchaseam>=1000)
			{
				finalam=(10*purchaseam)/100;
				
				System.out.println(purchaseam-finalam);
			}
	}
	
	public static void que9()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("write salary and year of service");
		int salary=sc.nextInt(),yearofserve=sc.nextInt(),bonus,bonusam;
		if(yearofserve>5)
		{
			bonus = (5*salary)/100;
			//bonusam = salary-bonus;
			System.out.println("Bonus amount: "+bonus);
		}
		
	}
	
	
	public static void que10()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("write held classes and total attends");
		int heldclasses=sc.nextInt(), classes_attend = sc.nextInt(), studenattend;
		if((classes_attend/heldclasses)*100>75)
		{
			System.out.println("allow");
		}
		else{
			System.out.println("not allowed");
		}
	}
	
	public static void main(String args[])
	{
			//que1();
			que2();
			//que3();
			//que4();
			//que5();
			//que6();
			//que7();
			//que8();
			//que9();
			//que10();
	}

}