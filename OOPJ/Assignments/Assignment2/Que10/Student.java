class Student
{
	int rollno;
	int marks;
	String name;
	
	
	Student(String name,int rollno,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	//setter
	public void setmarks(int marks)
	{
		this.marks=marks;
	}
	
	//getter
	public int getmarks()
	{
		return marks;
	}
	
	public String calculateGrade()
	{
		if(marks>=80){return "A";}
		else if(marks>=60){return "B";}
		else if(marks>=40){return "C";}
		return "Fail";
		
	}
	public static void main(String args[])
	{
		Student std1 = new Student("Ashish",33,81);
		Student std2 = new Student("Ragini",33,60);
		
		//std1.setmarks(999);
		System.out.println("name : "+std1.name+",roll no : "+std1.rollno+",marks : "+std1.getmarks()+", Grade : "+std1.calculateGrade());
		System.out.println("name : "+std2.name+",roll no : "+std2.rollno+",marks : "+std2.getmarks()+", Grade : "+std2.calculateGrade());
	
	}	
	
}

