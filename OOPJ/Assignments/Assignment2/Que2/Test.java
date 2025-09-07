import java.util.*;
class Mobile{
	String model;
	static int totmob;
	
	Mobile(String model){
		this.model=model;
		totmob++;
	}
	
	public String getMobile()
	{
		return model;
	}
	
	public static void showTotalModel()
	{
		System.out.println("Total mobiles in stock: "+totmob);
	}
	
}

class Test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Mobile1 model=");
		Mobile m1 = new Mobile(sc.nextLine());
		
		System.out.println("Mobile2 model=");
		Mobile m2 = new Mobile(sc.nextLine());
		
		System.out.println("Mobile1 model:"+m1.getMobile());
		System.out.println("Mobile2 model:"+m2.getMobile());
		Mobile.showTotalModel();
		
	}
	
}