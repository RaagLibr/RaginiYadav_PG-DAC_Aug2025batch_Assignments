class Employee
{
	int id;
	String name;
	double basicSalary,netSalary;
	Employee()
	{
		this.name="Unkown";
		this.basicSalary=30000;
	}
	
	Employee(String name, double basicSalary)
	{
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	//setter
	public void setName(String name)
	{
		this.name=name;
	}
	public void setbasicSalary(double basicSalary)
	{
		this.basicSalary=basicSalary;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public double getbasicSalary()
	{
		return basicSalary;
	}
	
	public void calculateNetSalary()
	{
		
		double hra = 0.1*this.basicSalary;
		double da  = 0.05 *this.basicSalary;
		double pf = 0.2*this.basicSalary;
		 this.netSalary = hra+da-pf;
	}
	public void displaySalary()
	{
		double salary = this.basicSalary-this.netSalary;
		System.out.println("salary : "+salary);
	}
	
	public static void main(String args[])
	{
		Employee em1= new Employee("ragini",50000);
		Employee em2= new Employee("Ashish",50000);
		em1.calculateNetSalary();
		em2.calculateNetSalary();
		System.out.println("employee name: "+em1.getName()+", getbasicSalary: "+em1.getbasicSalary()+", Net Salary : "+em1.netSalary);
		System.out.println("employee name: "+em2.getName()+", getbasicSalary: "+em2.getbasicSalary()+", Net Salary : "+em1.netSalary);
		em1.displaySalary();
		em2.displaySalary();
	
		System.out.println("netSalary : "+em1.netSalary);
		System.out.println("netSalary : "+em2.netSalary);
	
	}
	
}