public class Que23Test{
	public static void main(String args[]){
		Memeber m1 = new Students("abd",43,'A');
		m1.displayInfo();
		
		Memeber m2 = new Teachers("bbb",43,"abcd");
		m2.displayInfo();
	
		Memeber m3 = new Staff("ccc",43,"ddd");
		m3.displayInfo();
	
	
	}

}

class Memeber{
	String name;
	int Id;
	Memeber(String name, int Id)
	{
		this.name=name;
		this.Id=Id;
	}
	public void displayInfo(){
		
	}
	
}

class Students extends Memeber{
	char grade;
	Students(String name,int Id,char grade){
		super(name,Id);
		this.grade=grade;
	}
	
	@Override
	public void displayInfo(){
			System.out.println("student id - "+super.Id+", Student name - "+super.name+", student grade - "+this.grade);
	}
	
}

class Teachers extends Memeber{
	String subject;
	Teachers(String name,int Id,String subject){
		super(name,Id);
		this.subject=subject;
	}
	
	@Override
	public void displayInfo(){
			System.out.println("teacher id - "+super.Id+", teacher name - "+super.name+", teacher grade - "+this.subject);
		
		
	}
	
}

class Staff extends Memeber{
	String department;
	Staff(String name,int Id,String department){
		super(name,Id);
		this.department=department;
	}
	@Override
	public void displayInfo(){
			System.out.println("staff id - "+super.Id+", staff name - "+super.name+", staff grade - "+this.department);
		
	}
	

}	

