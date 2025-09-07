public class School
{
	String name;
	int class_;
	static int tution_fees;
	
	static{
		tution_fees=30000;
		System.out.println("School Tuition Fee Initialized: "+tution_fees);
	}
	
	public School(String name, int class_)
	{
		this.name=name;
		this.class_=class_;
	}
	
	//setter
	public void setName(String name)
	{
		this.name=name;
	}
	public void setClass(int class_)
	{
		this.class_=class_;
	}
	
	
	//getter
	public String getName()
	{
		return name;
	}
	public int getclass()
	{
			return class_;
	}
	
	public int getFees()
	{
			return tution_fees;
	}
	

}