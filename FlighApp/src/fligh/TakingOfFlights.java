package fligh;

import java.time.LocalDateTime;

public class TakingOfFlights extends Flights {

	public TakingOfFlights( String companyName, int hour,int min,String landingTo, int day, int month,int year) {
		super(companyName,hour,min,"Israel",landingTo,day,month,year);
		
	}

	public TakingOfFlights(String companyName, String landingTo, LocalDateTime dateTime) {
		super (companyName,landingTo,"Israel",dateTime);
	}
}
