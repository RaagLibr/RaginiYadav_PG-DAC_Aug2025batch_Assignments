import java.util.*;

class Passenger
{
	String name;
	int age;
	String seat_Type;
	static int tot_pass_book;
	
	public Passenger(String name, int age)
	{
		this.name=name;
		this.age=age;
		tot_pass_book++;
	}
	public Passenger(String name, int age, String seat_Type)
	{
		this.name=name;
		this.age=age;
		this.seat_Type=seat_Type;
		tot_pass_book++;
	}
	
	//getter
	public String getName()
	{
			return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getSeat_Type()
	{
		return seat_Type;
	}
	
	//setter
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public static void totPassengers()
	{
			System.out.println("Total Passengers Booked: "+tot_pass_book);
	}
	
	
	

}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Passenger :");
		String name1=sc.nextLine();
		System.out.println("age :");
		int age1= sc.nextInt();
		sc.nextLine();
		System.out.println("Seat_Type :");
		String seat_Type1=sc.nextLine();
		Passenger ps1 = new Passenger(name1,age1,seat_Type1);
		
			System.out.println("Passenger :");
		String name2=sc.nextLine();
		System.out.println("age :");
		int age2= sc.nextInt();
		sc.nextLine();
		System.out.println("Seat_Type :");
		String seat_Type2=sc.nextLine();
		Passenger ps2 = new Passenger(name2,age2,seat_Type2);
		
		System.out.println("Passenger :");
		String name3=sc.nextLine();
		System.out.println("age :");
		int age3= sc.nextInt();
		System.out.println("Seat_Type :");
		sc.nextLine();
		String seat_Type3=sc.nextLine();
		Passenger ps3 = new Passenger(name3,age3,seat_Type3);
		
		System.out.println("Passenger1: "+ps1.getName()+", Age1: "+ps1.getAge()+", Seat: "+ps1.getSeat_Type());
		System.out.println("Passenger2: "+ps2.getName()+", Age1: "+ps2.getAge()+", Seat: "+ps2.getSeat_Type());
		System.out.println("Passenger3: "+ps3.getName()+", Age1: "+ps3.getAge()+", Seat: "+ps3.getSeat_Type());
		ps3.totPassengers();
		
		
	}

}