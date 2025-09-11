public class TestBonusCal{
	public static void main(String args[])
	{
		Manager mng1 = new Manager("ragini",50000);
		System.out.println("name - "+mng1.getName()+"bonus - "+mng1.calculateBonus());
		Developer dv1 = new Developer("ashish",40000);
		System.out.println("name - "+dv1.getName()+"bonus - "+dv1.calculateBonus());
		
	}

}

abstract class Employee{
	String name;
	double salary;
	
	abstract double calculateBonus();
	
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
	public double calculateBonus()
	{
		if(super.salary>1000)
			return salary*0.2;
		else
			return salary;
	}
	
	
	
}

class Developer extends Employee{
	
	Developer(String name, double salary)
	{
		super.name=name;
		super.salary=salary;
	}
		
		
	@Override
	
	public double calculateBonus()
	{
		if(super.salary>1000)
			return salary*0.1;
		else
			return salary;
	}
	
}