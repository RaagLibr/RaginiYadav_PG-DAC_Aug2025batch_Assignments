
## Ragini Yadav.
## pgdac-kharghar august 2025 batch
-----------------------------------------------------------------------------------------------------------------
###                                               java Assignment 2
### Question 3


```java

import java.util.Scanner;


class Test
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		Book[] book = new Book[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("enter a title "+(i+1)+":");
			String title = sc.nextLine();
			
			System.out.println("Enter author for Book" + (i + 1) + ":");
            String author = sc.nextLine();
			
			 System.out.println("Is Book" + (i + 1) + " issued? (true/false):");
            String issuedInput = sc.nextLine().trim().toLowerCase();
            boolean issued = Boolean.parseBoolean(issuedInput);
            book[i] = new Book(title, author, issued);
		}
		// Print issued status of each book
        for (int i = 0; i < 3; i++) {
            System.out.println("Book" + (i + 1) + " issued? " + book[i].isissue());
        }
        // Show total issued books
        Book.showTotalIssued();
        sc.close();
	}
}
class Book{
	String title,authour;
	Boolean issue;
	static int totalIssuedBooks;
	
	Scanner sc= new Scanner(System.in);
	Book(String title, String authour, Boolean issue)
	{
		this.title=title;
		this.authour=authour;
		this.issue=issue;
		if(issue)
		{
			totalIssuedBooks++;
		}
		
	}
	
	//getter
	public String gettitle()
	{
		return title;
	}
	public String getauthor()
	{
		return authour;
	}
	public boolean isissue()
	{
		return issue;
	}
	
	//setter
	public void settitle(String title)
	{
		this.title=title;
	}
	public void setauthor(String authour)
	{
		this.authour=authour;
	}
	public void setissue(boolean issue)
	{
		//update totalIssuedBooks count if issue status change
		
		if(!this.issue && issue )
		{
			totalIssuedBooks++;
		}
		else if(this.issue && !issue)
		{
			totalIssuedBooks--;
		}
		this.issue=issue;
	}
	
	//show total issue books
	public static void showTotalIssued(){
		System.out.println("Total books issued: "+totalIssuedBooks);
	}
	
}


```