package fligh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ManagingClass {
	//anatTest123
	
	public static List <LandingFlights> landingFlights= new ArrayList<>();
	public static List <TakingOfFlights> takingOfFlights= new ArrayList<>();
	
	public static void addToLandingArray(LandingFlights landingFlight) {
		landingFlights.add(landingFlight);
	}

	public static void addToTakingOfArray(TakingOfFlights takingOf) {
		takingOfFlights.add(takingOf);
		
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
