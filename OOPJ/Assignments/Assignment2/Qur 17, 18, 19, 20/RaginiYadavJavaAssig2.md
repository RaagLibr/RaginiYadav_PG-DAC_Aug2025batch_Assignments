## Ragini Yadav.
## pgdac-kharghar august 2025 batch
-----------------------------------------------------------------------------------------------------------------
###                                               java Assignment 2

```java

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


```
```

D:\java\Assignment2\Qur 17, 18, 19, 20>javac Library.java

D:\java\Assignment2\Qur 17, 18, 19, 20>java Library.java
Add book 1 details ->
enter book id :-454
enter book title :-The six pillar of self-esteem
enter book authore :-Nathaniel
Add book 2 details ->
enter book id :-666
enter book title :-10 days to self-esteem
enter book authore :-david
 THE DETAIL OFF BOOK YOU ENTER
 Book id = > 454
book title => The six pillar of self-esteem
book authoer => Nathaniel
 THE DETAIL OFF BOOK YOU ENTER
 Book id = > 666
book title => 10 days to self-esteem
book authoer => david
total book - 2
book details -> {book id = 454 book title = The six pillar of self-esteem book authoer = Nathaniel}
book details -> {book id = 666 book title = 10 days to self-esteem book authoer = david}

```

```java
	import java.util.*;
class TicketBooking
{
	String passName;
	static int ticketNo=5001;
	
	TicketBooking(String passName)
	{
		this.passName=passName;
		ticketNo++;
	}
	
	//getter
	public String getpassName()
	{
		return passName;
	}
	
	public static TicketBooking[] getData()
	{
		Scanner sc = new Scanner(System.in);
		TicketBooking[]  tb = new TicketBooking[2];
			
		for(int i=0;i<2;i++)
		{
			System.out.print("passinger name - ");
			String passName = sc.nextLine();
			
			tb[i]= new TicketBooking(passName);
			
		}
		return tb;
	}
	public static void display(TicketBooking[] tb)
	{
		for(TicketBooking printDetails : tb)
		{
			System.out.println("Ticket No: "+TicketBooking.ticketNo+", Passenger: "+printDetails.getpassName());
		}
		
		for(int i=0;i<2;i++)
		{
				System.out.println("Ticket No: "+TicketBooking.ticketNo+", Passenger: "+tb[i].getpassName());
		}
	}
	
	public static void main(String args[])
	{
		TicketBooking[] tstoredata = TicketBooking.getData();
		TicketBooking.display(tstoredata);
		
	}
}

```

```
D:\java\Assignment2\Qur 17, 18, 19, 20>java TicketBooking.java
passinger name - ragini
passinger name - ragini
Ticket No: 5003, Passenger: ragini
Ticket No: 5003, Passenger: ragini
Ticket No: 5003, Passenger: ragini
Ticket No: 5003, Passenger: ragini
```