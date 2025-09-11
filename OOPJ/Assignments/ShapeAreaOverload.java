class ShapeAreaOverload{

	public void calculateArea(int side)
	{
		int areaofsq = side * side;
		System.out.println("area of squ - "+areaofsq);
	}
	public void calculateArea(int l, int b)
	{
		int areaofrect=l*b;
		System.out.println("area of rectagle - "+areaofrect);
	}
	public void calculateArea(double r)
	{
		double areaCircle=2.14*r*r;
		System.out.println("area of circle - "+areaCircle);
	}
	
	public static void main(String args[])
	{
		ShapeAreaOverload sao = new ShapeAreaOverload();
		sao.calculateArea(4,3);
		sao.calculateArea(6);
		sao.calculateArea(4.4);
	}
}