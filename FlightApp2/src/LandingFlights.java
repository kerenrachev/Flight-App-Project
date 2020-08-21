
import java.time.LocalDateTime;

public class LandingFlights extends Flights {

	
	public LandingFlights(String companyName, int hour,int min, String takingOffFrom, int day, int month,int year) {
		super(companyName,hour,min,takingOffFrom,"Israel",day,month,year);
		//test
	}
	

	public LandingFlights(String companyName, String takingOffFrom, LocalDateTime dateTime) {
		super(companyName,"Israel",takingOffFrom,dateTime);
		
		
	}
}
