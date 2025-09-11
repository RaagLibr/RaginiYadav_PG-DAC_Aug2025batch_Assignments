class Temperature
{
	private int temperature;
	
	Temperature(int temperature)
	{
		this.temperature=temperature;
	}
	public void settemptr(int temperature)
	{
		if(temperature>0 && temperature<=100)
		this.temperature=temperature;
		else
			System.out.println("enter 1-100 temperature value..");
	}
	public int getTemp()
	{
		return temperature;
	}
	public static void main(String args[])
	{
		Temperature tmp = new Temperature(55);
	System.out.println("temperature = "+tmp.getTemp());
		
	tmp.settemptr(80);
		System.out.println("temperature = "+tmp.getTemp());
	}
}