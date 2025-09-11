import java.util.*;
public class VehicleTest
{
	public static void main(String args[])
	{
		Vehicle vc = new Vehicle("honda",180);
		System.out.println("Car -> brand :- "+vc.getbrand()+", speed ->"+vc.getSpeed());
		
		Car cr = new Car("honda",200, "civie");
		System.out.println("Car -> brand :- "+cr.getbrand()+", speed ->"+cr.getSpeed()+", model type - "+cr.getcarModelType());
		
		Bike bk = new Bike("yamaha", 300, "R15");
		System.out.println("Car -> brand :- "+bk.getbrand()+", speed ->"+bk.getSpeed()+", model type - "+bk.getBikemodelType());
		
	}
}

class Vehicle{
	String brand;
	double speed;
	Vehicle(String brand, double speed)
	{
		this.brand=brand;
		this.speed=speed;
		
	}

	//setter
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setSpeed(double speed)
	{
		this.speed=speed;
	}
	
	//getter
	public String getbrand()
	{
		return brand;
	}
	public double getSpeed(){
		return speed;
	}
	
}

class Car extends Vehicle
{
	String carModelType;
	Car(String brand, double speed, String carModelType)
	{
		super(brand,speed);
		this.carModelType=carModelType;
	}
	
	//setter
	public void setcarModelType(String carModelType)
	{
		this.carModelType=carModelType;
	}
	
	//getter
	public String getcarModelType()
	{
		return carModelType;
	}
}

class Bike extends Vehicle
{
	String bikeModelType;
	Bike(String brand, double speed, String bikeModelType)
	{
		super(brand, speed);
		this.bikeModelType=bikeModelType;
		
	}
	
	public void setBikeModelType(String bikeModelType)
	{
		this.bikeModelType=bikeModelType;
	}
	
	public String getBikemodelType(){
		return bikeModelType;
	}
}
