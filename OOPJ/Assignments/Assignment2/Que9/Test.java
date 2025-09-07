import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of entries of students : ");
		int n = sc.nextInt();
		sc.nextLine();
			
		School[] sl = new School[n];
		
		for(int i=0;i<sl.length;i++)
		{
			System.out.println("Student"+(i+1)+": Name=");
			String name=sc.nextLine();
			
			System.out.println("class = ");
			int class_=sc.nextInt();
			
			sc.nextLine();
			sl[i] = new School(name,class_);
		}
		
		for(int i=0;i<sl.length;i++)
		{
			System.out.println("Student"+(i+1)+": Name="+sl[i].getName()+", Class="+sl[i].getclass()+", Tuition Fee="+sl[i].getFees());
		}
	}
}