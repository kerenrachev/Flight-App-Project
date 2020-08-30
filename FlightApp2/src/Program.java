
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws FileNotFoundException {
		ManagingClass.updateFlightsFromFile();
        System.out.println("HI");
        if(args.length>0&&args[0].equals("4")) {
        	CreateLandingFlight(args[1],args[2],args[3],args[4]);
        	
        }
        if(args.length>0&&args[0].equals("5")){
        	CreateTakingOfFlight(args[1],args[2],args[3],args[4]);
         }		
        if(args.length>0&&args[0].equalsIgnoreCase("10")) {
        	ManagingClass.findFlights(args[1],args[2],args[3],args[4],args[5]);
        }

	}
	private static void CreateLandingFlight(String company, String takesOffFrom, String time, String date) throws FileNotFoundException {
		boolean isOk = true;
		do {
			LandingFlights landings = new LandingFlights(company , takesOffFrom , "Israel", time,date);
			isOk = ManagingClass.addToLandingArray(landings);
			ManagingClass.sortLandingFlights();
			saveAllFlights();
		} while (!isOk);	
		
	}
	
	private static void CreateTakingOfFlight(String name, String destination , String time, String date) throws FileNotFoundException {
		boolean isOk=true;
		do {
			TakingOffFlights takingOf = new TakingOffFlights(name, "Israel",destination, time, date);
			isOk=ManagingClass.addToTakingOfArray(takingOf);
			ManagingClass.sortTakingOfFlights();
			saveAllFlights();
		} while (!isOk);
	
		
	}
	
	public static void saveAllFlights() throws FileNotFoundException {
		ManagingClass.saveAllLandings();
		ManagingClass.saveAlltakeOff();
	}

}