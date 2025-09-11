class TestShape
{
	public static void main(String args[])
	{
		
		Circle sh1 = new Circle(4);
		sh1.draw();
		
		Rectangle sh2 = new Rectangle(5,6);
		sh2.draw();
	}
}

abstract class Shape 
{
	public abstract void draw();
	
}

class Circle extends Shape{
	
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	
	@Override
	public void draw(){
		
		System.out.println("Drawing Circle of radius "+r);
	}
	
	public void setRadius(int r)
	{
		this.r=r;
	}
}

class Rectangle extends Shape{
	int l,b;
	Rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
	
	@Override
	public void draw(){
		System.out.println("Drawing Rectangle of length "+l+" and breadth "+b);
		
	}
	
	public void setRadius(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
}