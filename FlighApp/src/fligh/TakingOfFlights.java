package fligh;

import java.time.LocalDateTime;

public class TakingOfFlights extends Flights {

	public TakingOfFlights( String name, int hour,int min,String landing, int day, int month,int year) {
		super(name,hour,min,"Israel",landing,day,month,year);
		
	}

	public TakingOfFlights(String compony, String to, LocalDateTime dateTime) {
		super (compony,"Israel",to,dateTime);
	}
}
