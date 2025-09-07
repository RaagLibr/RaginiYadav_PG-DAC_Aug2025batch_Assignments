class Vehicle
{
		int regNo=2025;
		String OwnerName, vehicleType;
		static int vehicleCount=0;
		
		static{
			System.out.println("Welcome to CDAC Vehicle Registration Portal.....");
		}
		Vehicle(int regNo)
		{
			this.regNo = regNo;
			System.out.println("MH-"+regNo+"-"+vehicleCount);
		}
		
		Vehicle(int regNo, String OwnerName, String vehicleType)
		{
			this.regNo=regNo;
			this.OwnerName=OwnerName;
			this.vehicleType=vehicleType;
		}
		
		//getter
		public int getRegNo()
		{
			return regNo;
		}	
		public String getOwnerName()
		{
			return OwnerName;
		}
		public String getVehicle()
		{
			return vehicleType;
		}
		
	public static void main(String args[])
	{
		Vehicle  vh1 = new Vehicle(343,"Ragini","TATA");
		Vehicle  vh2 = new Vehicle(664,"Ragini","suzuki");
		System.out.println("registration details -> RegNo - "+vh1.getRegNo()+", OwnerName - "+vh1.getOwnerName()+", vehicleType - "+vh1.getVehicle());
		System.out.println("registration details -> RegNo - "+vh2.getRegNo()+", OwnerName - "+vh2.getOwnerName()+", vehicleType - "+vh2.getVehicle());
		
		
	}
	
}

