import java.util.*;
class Library
{
	public static void main(String args[])
	{
		
		ReadersLibrary rl = new ReadersLibrary();
		Book[] b1 = rl.addBook();    //getting books
		//Book b1= new Book();
		ReadersLibrary.totalbook();
		
		for(Book b : b1)
		{
		System.out.println("book details -> "+b.toString());
		}
	}

}

class Book{
	
	int book_id;
	String book_title, book_author;
		
		Book(){}
		Book(int book_id, String book_title, String book_author)
		{
			this.book_id=book_id;
			this.book_title=book_title;
			this.book_author=book_author;
		}
		
		//setter
		public void setbookid(int book_id)
		{
			this.book_id=book_id;
		}
		public void setbooktitle(String book_title)
		{
			this.book_title=book_title;
		}
		public void setBookauthor(String book_author)
		{
			this.book_author=book_author;
		}
		
		//getter
		public int getBookid()
		{
			return book_id;
		}
		public String getBookTitle()
		{
				return book_title;
		}
		public String getAuthor()
		{
			return book_author;
		}
		
		public String toString()
		{
			return "{book id = "+this.book_id+" book title = "+this.book_title+" book authoer = "+this.book_author+"}";
		}
}

class ReadersLibrary{
	
	static int totalbook;
	
	public static void totalbook()
	{
		System.out.println("total book - "+totalbook);
	}
	public Book[] addBook()
	{	
		Scanner sc = new Scanner(System.in);
		Book[] barray = new Book[2];
				
		for(int i=0;i<2;i++)
		{
			System.out.println("Add book "+(i+1)+" details -> ");
			
			System.out.print("enter book id :- \b");
			int book_id=sc.nextInt();
			sc.nextLine();
			
			System.out.print("enter book title :- \b");
			String book_title=sc.nextLine();
			System.out.print("enter book authore :- \b");
			String book_author=sc.nextLine();
			
			barray[i]=new Book(book_id,book_title,book_author);
			
			totalbook++;
		}
		
		
		for(int i=0;i<2;i++)
		{
			
			System.out.println(" THE DETAIL OFF BOOK YOU ENTER \n"+" Book id = > "+barray[i].getBookid()+" \nbook title => "+barray[i].getBookTitle()+"\nbook authoer => "+barray[i].getAuthor());
		}
		
		return barray;
			
	}
	
}
