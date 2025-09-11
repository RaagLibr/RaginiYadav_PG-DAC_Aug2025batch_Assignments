class TestAcademicStaff
{
	public static void main(String args[])
	{
		//Staff sf = new Staff("ragini", 444.4);
		Staff tf = new TeachingStaff("ragini","Maths",444.44);
		
		tf.stafInfo();
		
		Staff ntf = new NonTeachingStaff("sindhu","sport",66.66);
		ntf.stafInfo();
	}
}

class Staff
{
	String name;
	double salary;
	Staff(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public void stafInfo()
	{
		System.out.println(this.name+" -> "+", salary="+this.salary);
	}
}

class TeachingStaff extends Staff{
	String subject;
	TeachingStaff(String subject,String name, double salary){
		super(name,salary);
	}
	
	@Override
	
	public void stafInfo()
	{
		System.out.println(this.name+" -> "+", salary="+this.salary+", salary - "+this.salary);
	}
}

class NonTeachingStaff extends Staff{
	String department;
	NonTeachingStaff(String department,String name, double salary)
	{
		super(name,salary);
		this.department=department;
	}
	public void stafInfo()
	{
		System.out.println(this.name+" -> "+", salary="+this.salary+", dipartment - "+this.department);
	}
}

