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