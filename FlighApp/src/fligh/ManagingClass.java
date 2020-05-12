package fligh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ManagingClass {
	
	public static List <LandingFlights> landingFlights= new ArrayList<>();
	public static List <TakingOfFlights> takingOfFlights= new ArrayList<>();
	
	public static void addToLandingArray(LandingFlights landingFlight) {  //compare to return -1 for less, 0 for equal,1 for greater
		if(landingFlights.size()==0) {
			landingFlights.add(landingFlight);
		}
		else {
			int size=landingFlights.size();
			int counter=0;
			for(int i=0;i<=size;i++) {
				if(i==size) {
					landingFlights.add(landingFlight);
				    break;

//eyal test
				}
				if((landingFlights.get(i).dateTime.compareTo(landingFlight.dateTime))>0) {
					landingFlights.add(i, landingFlight);
					break;
				}
				if((landingFlights.get(i).dateTime.compareTo(landingFlight.dateTime))==0) {
					landingFlights.add(i, landingFlight);
					break;
				}
				if((landingFlights.get(i).dateTime.compareTo(landingFlight.dateTime))<0) {
					continue;
					}
		    	}
			}
		}

	public static void addToTakingOfArray(TakingOfFlights takingOf) {
		if(takingOfFlights.size()==0) {
			takingOfFlights.add(takingOf);
		}
		else {
			int size=takingOfFlights.size();
			int counter=0;
			for(int i=0;i<=size;i++) {
				if(i==size) {
					takingOfFlights.add(takingOf);
				    break;
				}
				if((takingOfFlights.get(i).dateTime.compareTo(takingOf.dateTime))>0) {
					takingOfFlights.add(i, takingOf);
					break;
				}
				if((takingOfFlights.get(i).dateTime.compareTo(takingOf.dateTime))==0) {
					takingOfFlights.add(i, takingOf);
					break;
				}
				if((takingOfFlights.get(i).dateTime.compareTo(takingOf.dateTime))<0) {
					continue;
					}
		    	}
			}
		}
		
		
	

	public static String printArrayList (String string) {
		String str="";
		if(string.equalsIgnoreCase("takeOf")) {
			for(int i=0; i<takingOfFlights.size();i++) {
				str+= takingOfFlights.get(i).toString()+"\n";
			}
		}
		else {
			for(int i=0; i<landingFlights.size();i++) {
				str+= landingFlights.get(i).toString()+"\n";
			}
		}
		return str;
	}
	public static void saveAllLandings() throws FileNotFoundException {
		File file = new File ("Landings.txt");
    	PrintWriter print = new PrintWriter(file);
		for (int i = 0; i < landingFlights.size(); i++) {
			landingFlights.get(i).save(print);
		}
		print.close();
	
	}

	public static void saveAlltakeOff() throws FileNotFoundException {
		File file = new File ("takeOff.txt");
    	PrintWriter print = new PrintWriter(file);
		for (int i = 0; i < takingOfFlights.size(); i++) {
			takingOfFlights.get(i).save(print);
		}
		print.close();
	}
	
	

}
