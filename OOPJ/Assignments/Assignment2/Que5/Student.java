public class Student
{
	String name;
	int marks;
	static int totStudents=0;
	
	public Student(String name, int marks)
	{
		this.name=name;
		this.marks=marks;
		totStudents++;
		
	}
	
	//getter
	public int getMarks()
	{
		return marks;
	}
	
	//setter
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	public boolean isPassed()
	{
		
		if(this.marks>=35)
			return true;
		return false;
		
	}
	
	public static void showTotalStudents()
	{
		System.out.println("Total students: "+totStudents);
	}
	
}