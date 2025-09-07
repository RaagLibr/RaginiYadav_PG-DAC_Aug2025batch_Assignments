
import java.util.Scanner;
class Second10Que
{
	public static void que11()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter percnt :");
		int percnt=sc.nextInt();
		if(percnt>90)
		{
			System.out.println("A+");
		}
		if(percnt>76 && percnt<89)
		{
			System.out.println("A");
		}
		if(percnt>66 && percnt<75)
		{
			System.out.println("B+");
		}
		if(percnt>51 && percnt<65)
		{
			System.out.println("B");
		}
		if(percnt>36 && percnt<50)
		{
			System.out.println("C");
		}
		if(percnt<35)
		{
			System.out.println("fail");
		}
		
	}
	
	public static void que12()
	{
		int fd1,fd2,fd3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of Friend 1:");
		fd1=sc.nextInt();
		System.out.println("Enter age of Friend 2:");
		fd2=sc.nextInt();
		System.out.println("Enter age of Friend 3:");
		fd3=sc.nextInt();
		if(fd1>0 && fd2>0 && fd3>0)
		{
			
			if(fd1>fd2 && fd1>fd3)
			{
				System.out.println("Oldest : Friend 1");
				if(fd2<fd3)
				System.out.println("Youngest : Friedn 2");
				else
				System.out.println("Youngest : Friedn 3");
				
			}
			if(fd2>fd3 && fd2>fd1)
			{
				System.out.println("Oldest : Friend 2");
				if(fd3<fd1)
					System.out.println("Youngest : Friedn 3");
				else
					System.out.println("Youngest : Friedn 1");
				
			}
			if(fd3>fd1 && fd3>fd2)
			{
				System.out.println("Oldest : Friend 3");
				if(fd2<fd1)
					System.out.println("Youngest : Friedns 2");
				else
					System.out.println("Youngest : Friedn 1");
				
			}
			
			
		}
	}
	
		public static void que13()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Write a total held classes :");
			int heldclasses=sc.nextInt();
			System.out.println("Total attended classes :");
			int totattend=sc.nextInt();
			System.out.println("medical cause (Y/N):");
			char medical=sc.next().charAt(0);
			if((totattend/heldclasses)*100>75)
			{
					System.out.println("Student is allowed to sit for the exam");
				
			}
			if((totattend/heldclasses)*100<75)
			{
				
				if(medical=='y' || medical=='Y')
				{
					System.out.println("Student is allowed to sit for the exam");
				}
				if(medical=='n' || medical=='N')
				{
					System.out.println("Student is  not allowed to sit for the exam");
				}
			}
		}
		
		public static void que14()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a 4 digit number :");
			int num=sc.nextInt();
			for(int i=0;i<=num;i++)
			{
				int lastdigit=num%10;
				System.out.print(lastdigit);
				num=num/10;
				
			}		
		}
		
		public static void que15()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a 4 digit number :");
			String num = sc.nextLine();
			if((num.charAt(0)+num.charAt(1))==(num.charAt(2)+num.charAt(3)))
				{
					System.out.println("lucky num");
				}
				
				if((num.charAt(0)+num.charAt(1))!=(num.charAt(2)+num.charAt(3)))
				{
					System.out.println("not lucky num");
				}		
			
		}
		
		public static void que16()
		{
			if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
			{
				System.out.println("vowels");
			}
			else{
				System.out.println("consonant");
			}
			
			
		}
		public static void que17()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("write a number : ");
			int num=sc.nextInt();
			if(num%2==0 && num%3==0 && num%5==0)
			{
				System.out.println("divisible by 2 ");
				System.out.println("divisible by 3 ");
				System.out.println("divisible by 5 ");
			
			}
		}
		public static void que18()
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter day number: ");
				int num=sc.nextInt();
				switch(num)
				{
					case 1:
					System.out.println("mon");
					break;
					case 2:
					System.out.println("tue");
					break;
					case 3:
					System.out.println("wed");
					break;
					case 4:
					System.out.println("thu");
					break;
					case 5:
					System.out.println("fri");
					break;
					case 6:
					System.out.println("sat");
					break;
					case 7:
					System.out.println("sun");
					break;
					default:
					System.out.println("enter valid number");
					
				}
		}
		
		public static void que19()
		{
					Scanner sc = new Scanner(System.in);
				System.out.println("Enter day number: ");
				int num=sc.nextInt();
				switch(num)
				{
					case 1:
					System.out.println("31");
					break;
					case 2:
					System.out.println("28 & 29");
					break;
					case 3:
					System.out.println("31");
					break;
					case 4:
					System.out.println("30");
					break;
					case 5:
					System.out.println("31");
					break;
					case 6:
					System.out.println("30");
					break;
					case 7:
					System.out.println("31");
					break;
					case 8:
					System.out.println("30");
					break;
					case 9:
					System.out.println("31");
					break;
					case 10:
					System.out.println("30");
					break;
					case 11:
					System.out.println("31");
					break;
					case 12:
					System.out.println("30");
					break;
					default:
					System.out.println("enter valid number");
					
				}
		}
		
		public static void que20()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("num 1");
			int num1=sc.nextInt();
			System.out.println("num 2");
			int num2=sc.nextInt();
			System.out.println("enter operator *, /, +, -");
			char opert = sc.next().charAt(0);
			int result;
			if(opert=='*')
			{
				result = num1*num2;
				System.out.println(result);
			}
			else if(opert=='/')
			{
				result = num1/num2;
				System.out.println(result);
			}
			else if(opert=='+')
			{
				result=num1+num2;
				System.out.println(result);
			}
			else if(opert=='-')
			{
				result=num1-num2;
				System.out.println(result);
			}
			
		}
		
		public static void que21()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a day number : ");
			int num = sc.nextInt();
			String result = (num==1)?"mon":
							(num==2)?"tue":
							(num==3)?"wed":
							(num==4)?"thu":
							(num==5)?"fri":
							(num==6)?"sat":
							(num==7)?"sun":"enter valide number";
			System.out.println(result);
		}
		
		public static void que22()
		{
				Scanner sc = new Scanner(System.in);
			System.out.println("Enter a day number : ");
			int num = sc.nextInt();
			String result = (num==1)?"jan":
							(num==2)?"feb":
							(num==3)?"march":
							(num==4)?"april":
							(num==5)?"may":
							(num==6)?"june":
							(num==7)?"july":
							(num==8)?"Aug":
							(num==9)?"sep":
							(num==10)?"oct":
							(num==11)?"nov":
							(num==12)?"dec":"enter valide number";
			System.out.println(result);
		
		}
		
		public static void que23()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("num 1");
			int num1=sc.nextInt();
			System.out.println("num 2");
			int num2=sc.nextInt();
			System.out.println("enter operator *, /, +, -");
			char opert = sc.next().charAt(0);
			int result;
			switch(opert)
			{
				case '+':
				System.out.println(num1+num2);
				break;
				case '*':
				System.out.println(num1*num2);
				break;
				case '-':
				System.out.println(num1-num2);
				break;
				case '/':
				System.out.println(num1/num2);
				break;
				default:
				System.out.println("enter valid number");
			}
			
		}
	/*	
		public static void que24()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter marks : ");
			int num=sc.nextInt();
			switch(num)
			{
				case 0 ... 24:
				System.out.println("F");
				break;
				case 25 ... 44:
				System.out.println("E");
				break;
				case 45 ... 54:
				System.out.println("D");
				break;
				case 55 ... 69:
				System.out.println("C");
				break;
				case 70 ... 84:
				System.out.println("B");
				break;
				case 85 ... 100:
				System.out.println("A");
				break;
				default:
				System.out.println("enter valid number ");
			}
			
		}
	*/	
		public static void que25()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter marks : ");
			int num=sc.nextInt();
			switch(num)
			{
				case 1:
				System.out.println("u entered number 1");
				break;
				case 2:
				System.out.println("u entered number 2");
				break;
				case 3:
				System.out.println("u entered number 3");
				break;
				case 4:
				System.out.println("u entered number 4");
				break;
				case 5:
				System.out.println("u entered number 5");
				break;
				default:
				System.out.println("enter a valide number");
			}
		}
		
		public static void que26()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter month number: ");
			int num=sc.nextInt();
			if(num==1 || num==2 || num==12)
			{
				System.out.println("winter");
			}
			else if(num==3 || num==4 || num==5)
			{
				System.out.println("Summer");
			}
			else if(num==6 || num==7 || num==8)
			{
				System.out.println("Monsoon");
			}
			else if(num==9 || num==10 || num==11)
			{
				System.out.println("Autumn");
			}
		}
		public static void que27()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a character: ");
			char ch = sc.next().charAt(0);
			
			switch(ch)
			{
				case 'A':
				System.out.println("u selected A ");
				break;
				case 'B':
				System.out.println("u selected B ");
				break;
				case 'C':
				System.out.println("u selected C ");
				break;
				case 'D':
				System.out.println("u selected D ");
				break;
				case 'E':
				System.out.println("u selected E ");
				break;
				case 'F':
				System.out.println("u selected F ");
				break;
				default:
				System.out.println("enter a valide character");
			}
		}
		
		public static void que28()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter traffic light color:  ");
			String st = sc.next();
			switch(st)
			{
				case "red":
				System.out.println("Stop");
				break;
				case "green":
				System.out.println("Go");
				break;
				case "yellow":
				System.out.println("Ready");
				break;
				
			}
			
		}
		
		public static void que29()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter day type (1–Workday, 2–Weekend): ");
			int num=sc.nextInt();
			if(num==1 || num==2)
			{	
				if(num==1)
				{
					System.out.println("It’s work today. No weekend.");
					
				}
				if(num==2)
				{
					System.out.println("It’s weekend. No work today.");
				}
			}
			else{
				System.out.println("enter a valid num");
			}
		}
		
		public static void que30()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter (1–addition, 2–substraction): ");
			int num=sc.nextInt();
			System.out.println("enter first number");
			int num1=sc.nextInt();
			System.out.println("enter second number ");
			int num2=sc.nextInt();
			
			if(num==1 || num==2)
			{	
				if(num==1)
				{
					int add = num1+num2;
					System.out.println(add);
					
				}
				if(num==2)
				{
					int sub = num1-num2;
					System.out.println(sub);
				}
			}
			else{
				System.out.println("enter a valid num");
			}
		}
	public static void main(String args[])
	{
		//que11();
		//que12();
		//que13();
		//que14();
		//que15();
		//que16();
		//que17();
		//que18();
		//que19();
		//que20();
		//que21();
		//que22();
		//que23();
		//que24();
		 //que25();
		 //que26();
		 //que27();
		 //que28();
		 //que29();
		 //que30();
	}
	
}