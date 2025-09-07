
public class Movie
{
	String name;
	String ticket_type;
	static int ticketSold;
	public Movie(String name, String ticket_type)
	{
		this.name=name;
		this.ticket_type=ticket_type;
		ticketSold++;
	}
	
	//setter
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTicket_type(String ticket_type)
	{
		this.ticket_type=ticket_type;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public String getTicket_type()
	{
		return ticket_type;
	}
	
	public static void ticketSold()
	{
		System.out.println("Total Tickets Sold: "+Movie.ticketSold);
	}

	@Override
	public String toString()
	{
		return "Test{Customer:+ Name:"+name+", Ticket: "+ticket_type+"}";
	}

}
