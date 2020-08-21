
import java.time.LocalDateTime;

public class TakingOffFlights extends Flights {

	public TakingOffFlights( String companyName, int hour,int min,String landingTo, int day, int month,int year) {
		super(companyName,hour,min,"Israel",landingTo,day,month,year);
		
	}

	public TakingOffFlights(String companyName, String landingTo, LocalDateTime dateTime) {
		
		super (companyName,landingTo,"Israel",dateTime);
	}
}
