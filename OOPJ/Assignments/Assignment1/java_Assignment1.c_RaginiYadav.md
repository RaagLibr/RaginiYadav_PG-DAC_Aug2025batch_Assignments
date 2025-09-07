
## Ragini Yadav.
## pgdac-kharghar august 2025 batch
-----------------------------------------------------------------------------------------------------------------
###                                               java Assignment 1.a

```java

import java.util.Scanner;
import java.util.Arrays;
class FromLast
{
	
	public static void que50()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		if(num%2==0 || num%3==0 || num%5==0)
		{
			System.out.println("Divisible by 2");
			System.out.println("Divisible by 3");
			System.out.println("Divisible by 5");
		}
		
	}
	
	public static void que49()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
		System.out.println("Enter month number:");
		int month = sc.nextInt();
        switch(month)
				{
					case 1:
					System.out.println("jan");
					break;
					case 2:
						
						if(year%4==0 && (year%100!=0 || year%100==0 && year%400==0))
						{
							System.out.println("29 days");
						}
						else
						{
							System.out.println("29 days");
						}
					break;
					case 3:
					System.out.println("march");
					break;
					case 4:
					System.out.println("april");
					break;
					case 5:
					System.out.println("may");
					break;
					case 6:
					System.out.println("june");
					break;
					case 7:
					System.out.println("july");
					break;
					case 8:
					System.out.println("august");
					break;
					case 9:
					System.out.println("september");
					break;
					case 10:
					System.out.println("oct");
					break;
					case 11:
					System.out.println("nov");
					break;
					case 12:
					System.out.println("dec");
					break;
					default:
					System.out.println("enter valid number");
					
				}		
	}
	
	public static void que48()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		if(marks==85)
		{
			System.out.println("A");
		}
		if(marks==78)
		{
			System.out.println("-A");
		}
	}
	
	public static void que47()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		if(num1%2==0 && num2%2==0)
		{
			System.out.println("both even");
		}
		else if(num1%2!=0 && num2%2!=0)
		{
			System.out.println("both odd");
		}
		else if(num1%2==0 && num2%2!=0)
		{
			System.out.println("num1 is even\n"+"num2 is odd");
		}
		else if(num1%2!=0 && num2%2==0)
		{
			System.out.println("num1 is odd\n"+"num2 is even");
		}
	}
	
	public static void que46()
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		if(ch>=1 && ch<=9)
		{			
			System.out.println("its digit "+ch);
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("its lowercase "+ch);
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("its uppercase  "+ch);
		}
		else
		{
			System.out.println("standard character.");
		}
		
	}
	
	public static void que45()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3-digit number: ");
		
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int n : arr)
		{
			System.out.println(n);
		}
			
	}
	
	public static void que44()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4-digit number: ");
		int num = sc.nextInt(),lastdigit=0,reversed=0;
		int original =num;
		for(int i=0;i<=num;i++)
		{
			lastdigit=num%10;
			reversed = reversed*10+lastdigit;
			System.out.print(reversed);
			num=num/10;	
		}
			
		System.out.println("\nReversed number:"+reversed);
		if(original==reversed)
			System.out.println("its palindrome : ");
		else
			System.out.println("its not palindrome");
			
	}
	
	public static void que43()
	{
		//Sum of Digits of a Number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt(), lastdigit=0,sum=0;
		for(int i=0;i<=num;i++)
		{
			lastdigit=num%10;
			num=num/10;
			sum+=lastdigit;
			
		}
		
		System.out.println("sum of digits "+sum);
	}
	public static void que42()
	{
		Scanner sc = new Scanner(System.in);
		
		for (int i = 100; i <= 500; i++) {
			int num = i;   // store original number
			int sum = 0;   // reset sum for each number

			while (num > 0) {
				int ld = num % 10;       // last digit
				sum += ld * ld * ld;     // cube of digit
				num = num / 10;          // remove last digit
			}

			if (sum == i) {
				System.out.println(i);
			}
		}
	}
	
	public static void que41()
	{
		int n=153,temp=n,sum=0,lastdigit=0;
		while(n>0)
		{
			lastdigit=n%10;
			sum+=lastdigit*lastdigit*lastdigit;
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println(sum+"armstrong");
		}
		else
		{
			System.out.println(sum+"not armstrong");
		}
	}

	public static void que40()
	{
		Scanner sc = new Scanner(System.in);
		int pamount=sc.nextInt(),finalam=0;
		int result = (pamount>1000)?finalam=(10*pamount)/100:pamount;
		
		System.out.println(pamount-finalam);
	
	}
	
	public static void que39()
	{
		
	}
	public static void que38()
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		String st = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?"Vowel":"Consonant";
		System.out.println(st);
		
	}
	
	public static void que37()
	{
		
	}
	public static void main(String args[])
	{
			//que50();
			//que49();
			//que48();
			//que47();
			//que46();
			//que45();
			//que44();
			//que43();
			//que42();
			//que41();
			//que40();
			//que39();
			//que38();
			que37();
	}
}

```