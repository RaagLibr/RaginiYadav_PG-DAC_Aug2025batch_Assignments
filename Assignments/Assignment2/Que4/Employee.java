//Employee Salary Manager

import java.util.*;
public class Employee{
	
	String name;
	double salary;
	int yearOfService;
	static int totEmployees;
	
	Employee(){}
	
	Employee(String name, double salary, int yearOfService)
	{
		this.name=name;
		this.salary=salary;
		this.yearOfService=yearOfService;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public double getsalary()
	{
		return salary;
	}
	public int getyearOfService()
	{
		return yearOfService;
	}
	
	//setter
	public void setname(String name)
	{
		this.name = name;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	public void setyearOfSalary(int yearOfService)
	{
		this.yearOfService=yearOfService;
	}
	
	public double calculateBonus()
	{
		if(yearOfService>5)
		{
			return (5*salary)/100;
		}
		return 0;
	}
	
	// Override toString method
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", yearOfService=" + yearOfService + "}";
    }
}
