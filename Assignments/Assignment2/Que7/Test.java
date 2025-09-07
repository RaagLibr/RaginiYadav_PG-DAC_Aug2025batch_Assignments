
import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			Movie[] mv= new Movie[3];
			for(int i=0;i<3;i++)
			{
				System.out.println("Customer"+(i+1)+": name");
				String name=sc.nextLine();

				System.out.println(" Ticket type: ");
				String ticket_type=sc.nextLine();
				
				//sc.nextLine();		//consume the left over
				mv[i]= new Movie(name,ticket_type);
				
			}
			
			for(int i=0;i<3;i++)
			{
				System.out.println("Customer name "+(i+1)+" : "+mv[i].getName()+", ticket : "+mv[i].getTicket_type());
				//System.out.println("customer details Details :"+mv[i]);
			}
			
			//Movie.toString();
			Movie.ticketSold();
	}
}