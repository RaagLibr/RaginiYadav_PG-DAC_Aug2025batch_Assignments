

public class Anonymous
{
	public static void main(String args[])
	{
		Book b1= new Book()
		{
			@Override
			public void readbook()
			{
				System.out.println("hey");
			}
		};
		
		b1.readbook();
	}
}

interface Book
{
	void readbook();
}
