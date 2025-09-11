public class TestHospital{
	public static void main(String args[]){
		
		
	}
}

abstract class Staff
{
	String name;
	int staffId;
	
	Staff(String name, int staffId)
	{
		this.name=name;
		this.staffId=staffId;
	}
	public void displayDetails(String name, int staffId);
}

class Doctor extends Staff{
	
	@Override
	public void displayDetails(){
		
	}
}

class Nurses extends Staff{
	
	
	@Override
	public void displayDetails(){
		
	}
}


