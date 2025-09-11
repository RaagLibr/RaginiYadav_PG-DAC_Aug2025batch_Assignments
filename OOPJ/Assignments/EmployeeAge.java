class EmployeeAge
{
	int empId,age;
	EmployeeAge(int empId, int age)
	{
		this.empId=empId;
		this.age=age;
	}
	
	//setter
	public void setEmpAge(int age)
	{
		if(age > 18)
		{
			this.age=age;
			
		}
		else
		{
			System.out.println("invalide ");
		}
	}
	
	//getter
	public int getEmpAge()
	{
		return age;
	}
	
	
	public static void main(String args[])
	{
		EmployeeAge ema  = new EmployeeAge(545,55);
		System.out.println(ema.getEmpAge());
		ema.setEmpAge(17);
		System.out.println(ema.getEmpAge());
		
	}
}