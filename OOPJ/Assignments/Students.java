class Students
{
	int stdId, marks;
	
	Students(int stdId, int marks)
	{
		this.stdId=stdId;
		this.marks=marks;
	}
	
	//setter
	public void setMarks(int marks)
	{
		if(marks>0)
		{
			this.marks=marks;
		}
		if(marks<0)
		{
			System.out.println("fail..");
		}
	}
	
	//getter
	public int getMarks()
	{
		return marks;
	}
	public static void main(String args[])
	{
		Students std1= new Students(020,85);
		System.out.println("marks = "+std1.getMarks());
		std1.setMarks(99);
		System.out.println("updated marks = "+std1.getMarks());
		
	}
}