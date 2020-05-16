package fligh;

import java.time.LocalDateTime;

public class LandingFlights extends Flights {

	
	public LandingFlights(String name, int hour,int min, String takeOff, int day, int month,int year) {
		super(name,hour,min,takeOff,"Israel",day,month,year);
		//test
	}

	public LandingFlights(String compony, String from, LocalDateTime dateTime) {
		super(compony,from,"Israel",dateTime);
	}
}
