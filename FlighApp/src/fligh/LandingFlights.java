package fligh;

import java.time.LocalDateTime;

public class LandingFlights extends Flights {

	
	public LandingFlights(String company, int hour,int min, String takingOffFrom, int day, int month,int year) {
		super(company,hour,min,takingOffFrom,"Israel",day,month,year);
		//test
	}

	public LandingFlights(String compony, String takingOffFrom, LocalDateTime dateTime) {
		super(compony,"Israel",takingOffFrom,dateTime);
		
	}
}
