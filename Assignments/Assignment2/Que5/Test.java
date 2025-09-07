
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Student1: Name: ,Marks");
		String name1=sc.nextLine();
		int marks1 = sc.nextInt();
		sc.nextLine();                      // consume leftover newline
		Student std1 = new Student(name1,marks1);
		
		System.out.println("Student1: Name: ,Marks");
		String name2=sc.nextLine();
		int marks2 = sc.nextInt();
		sc.nextLine();                      // consume leftover newline
		Student std2 = new Student(name2,marks2);
		
		System.out.println("Student1: Name: ,Marks");
		String name3=sc.nextLine();
		int marks3 = sc.nextInt();
		sc.nextLine();                      // consume leftover newline
		Student std3 = new Student(name3,marks3);
		
		
		System.out.println("Student Rahul Passed? "+std1.isPassed());
		System.out.println("Student Rahul Passed? "+std2.isPassed());
		System.out.println("Student Rahul Passed? "+std3.isPassed());
		
		Student.showTotalStudents();
	}
}