package fligh;

import java.time.LocalDateTime;

public class TakingOfFlights extends Flights {

	public TakingOfFlights( String company, int hour,int min,String landingTo, int day, int month,int year) {
		super(company,hour,min,"Israel",landingTo,day,month,year);
		
	}

	public TakingOfFlights(String compony, String landingTo, LocalDateTime dateTime) {
		super (compony,landingTo,"Israel",dateTime);
	}
}
