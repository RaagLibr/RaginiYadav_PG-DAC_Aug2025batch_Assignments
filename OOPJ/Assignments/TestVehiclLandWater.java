public class TestVehiclLandWater
{
	public static void main(String args[])
	{
		AmphibiousVehicle av1= new AmphibiousVehicle();
		av1.driveOnLand("hydroWater");
		
		AmphibiousVehicle av2 = new AmphibiousVehicle();
		av2.driveOnWater("sss");
	}

}

interface ILandVehicle{
	public void driveOnLand(String name);
}

interface IWaterVehicle{
	
	public void driveOnWater(String name);
	
}

class AmphibiousVehicle implements ILandVehicle,IWaterVehicle{
	
	String name;
	
	@Override
	public void driveOnLand(String name){
			this.name=name;
		System.out.println(this.name+" driving on lnad");
	}
	
	@Override
	public void driveOnWater(String name){
		this.name=name;
		System.out.println(this.name+" driving on water");
	}
	
	
}