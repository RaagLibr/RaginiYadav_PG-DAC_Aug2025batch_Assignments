class BookLab
{
	private int copiesAvailable;
	
	BookLab(int copiesAvailable)
	{
		this.copiesAvailable=copiesAvailable;
	}
	
	public void setcopiesAva(int copiesAvailable)
	{
		this.copiesAvailable=copiesAvailable;
	}
	
	public int getcopies()
	{
		return copiesAvailable;
	}
	//methods
	public void addCopy(int n)
	{
		if(n>0)
		{
			this.copiesAvailable=copiesAvailable+n;
		}
		if(n<0)
		{
			System.out.println("enter a valide num ..");
		}
	}
	
	public void removeCopy(int n)
	{
		if(copiesAvailable>=n || copiesAvailable>0)
		{
			copiesAvailable=copiesAvailable-n;
		}
		else
		{
			System.out.println("availabele copies = "+this.copiesAvailable);
		}
	}
	public static void main(String args[])
	{
		BookLab bl1= new BookLab(8);
		System.out.println(bl1.getcopies());
		bl1.addCopy(5);
		System.out.println(bl1.getcopies());
		bl1.removeCopy(3);
		System.out.println(bl1.getcopies());
		
	
	}
}