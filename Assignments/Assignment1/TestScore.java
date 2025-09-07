import java.util.Scanner;
class TestScore
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("write Test1");
		int Test1 = sc.nextInt();
		System.out.println("write Test2");
		int Test2 = sc.nextInt();
		 if(Test1>0 && Test2>0)
		 {
			String result =	(Test1>Test2)?"Test 1 is greater":
							(Test1<Test2)?"Test 2 is greater":
							"both got same marks";
			System.out.println(result);

		 }
	}	 
}