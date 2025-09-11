class TestEmployeeSalary{
	
	public static void main(String args[])
	{
	Manager mn1 = new Manager("ragini",40000);
	System.out.println(mn1.getName()+" total salary - "+mn1.getSalary());
	Developer dv1 = new Developer("ashish",60000);
	System.out.println(dv1.getName()+" total salary - "+dv1.getSalary());
	}
}


abstract class Employee{
	String name;
	double salary;
	
	abstract double displaySalary();
	
	
	//getter
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
}

class Manager extends Employee{
	
	Manager(String name, double salary)
	{
		super.name=name;
		super.salary=salary;
		
	}
	
	@Override
	public double displaySalary()
	{
		if(super.salary>1000)
		{
			salary=salary*0.2;
			return salary;
		}
		else
		{
			return salary;
		}
	}
		
}

class Developer extends Employee{
	
	Developer(String name, double salary)
	{
		super.name=name;
		super.salary=salary;
	}
		
		
	@Override
	public double displaySalary()
	{
		if(super.salary>1000)
		{
			salary=salary*0.1;
			return salary;
		}
		else
		{
			return salary;
		}
	}
	
}