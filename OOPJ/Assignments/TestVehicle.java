public class TestVehicle
{
	public static void main(String args[])
	{
		Vehicle vh = new Car("Car",120,"farari");
		//System.out.println( vh.getcarModelType()+" speed "+vh.getSpeed() +"km/h");
		vh.displaySpeed();
		Vehicle vh1 = new Bike("bike",120,"farari");
		//System.out.println( vh1.getBikemodelType()+" speed "+vh1.getSpeed() +"km/h");
		vh1.displaySpeed();
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
	
	public void displaySpeed(){
		
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
	
	@Override
	public void displaySpeed(){
		System.out.println("Car speed "+ this.speed +"km/h");
		
		
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
	
	@Override
	public void displaySpeed(){
		System.out.println("Bike speed "+ this.speed +"km/h");
		
		
	}
	
}



