public class Employee
{
	public static void main(String args[])
	{
		Employee1 emp1 = new Employee1("ragini1",1000.0);
		System.out.println(emp1.getSalary());
		emp1.setSalary(2000.0);
		System.out.println(emp1.getSalary());
		
		RegularEmployee empr1 = new RegularEmployee("ragini", 20000.0);
		System.out.println(empr1.getSalary());
		empr1.setSalary(500.0);
		System.out.println(empr1.getSalary());
		
		
		ConstractEmployee empc1= new ConstractEmployee("ashish", 300000.0);
		System.out.println(empc1.getSalary());
		empc1.setSalary(1000.0);
		System.out.println(empc1.getSalary());
		
	}
}

class Employee1
{
		String empName;
		double basicSalary;
		Employee1(String empName, double basicSalary)
		{
			this.empName=empName;
			this.basicSalary=basicSalary;
		}
		
		
	void setSalary(double basicSalary)
	{
		this.basicSalary=basicSalary;
	}
	
	double getSalary()
	{
		return basicSalary;
	}
}

//RegularEmployee → HRA 10%
class RegularEmployee extends Employee1
{
	RegularEmployee(String RegEmpName, double salary)
	{
		super(RegEmpName, salary);
		
	}	

		public double getSalary()
		{
			
		if(basicSalary>5000)
			{
				basicSalary = super.basicSalary + (super.basicSalary * 0.10); // for RegularEmployee
				return basicSalary;
			}
			else
			{
				System.out.println("cannot deduct..");
				return basicSalary;
			}
		}
}

//ContractEmployee → allowance 5%
class ConstractEmployee extends Employee1
{
	ConstractEmployee(String conEmpname, double basicSalary)
	{
		super(conEmpname, basicSalary);
		
	}
	
	public double getSalary()
	{
		if(basicSalary>5000)
			{
				basicSalary = super.basicSalary + (super.basicSalary * 0.05); 
				return basicSalary;
			}
			else
			{
				System.out.println("cannot deduct..");
				return basicSalary;
			}
		
	}

	
}




