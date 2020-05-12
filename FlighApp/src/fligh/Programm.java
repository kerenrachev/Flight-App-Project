package fligh;

import java.io.FileNotFoundException;
import java.security.spec.MGF1ParameterSpec;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) throws FileNotFoundException {
		
		//hi its anat
		LandingFlights t1= new LandingFlights ("El-Al2",23,47,"Moscow",1,11,2020);
		TakingOfFlights t2= new TakingOfFlights ("El-Al",0,12,"New York",7,4,2021);
		TakingOfFlights t3= new TakingOfFlights ("Eourope Air",12,27,"Yemen",12,11,2022);
		ManagingClass.addToLandingArray(t1);
		ManagingClass.addToTakingOfArray(t2);

        ManagingClass.addToTakingOfArray(t3);
		
		int choise;
		Scanner s=new Scanner(System.in);
		
		do {
			do {
				System.out.println("Please enter valid choise (between 0-5 ) ");
				choise = s.nextInt();
			} while (choise < 0 || choise > 6);
			switch (choise) {

			case 1:
				CreateTakingOfFlight();

				break;

			case 2:
				CreateLandingFlight();

				break;

			case 3:
				System.out.println("All the taking of flights are: \n"
						+ ManagingClass.printArrayList("takeOf"));

				break;

			case 4:
				System.out.println("All the landing flights are: \n"
						+ ManagingClass.printArrayList("land"));

				break;

			case 5:
                      saveAllFlights();
                      System.out.println("saved");
				break;
				
			case 6:
				
				break;
			}
			
		} while (choise!=6);
		
	}

	private static void CreateLandingFlight() throws FileNotFoundException {
		System.out.println("Please fill in the following details: \n"
				+ "1)Company name: \n"
				+ "2)Flight hour: \n"
				+ "3)Flight minute: \n"
				+ "4)Takes of from....: \n"
				+ "5)day: \n"
				+ "6)Month: \n"
				+ "7)Year: \n");
		Scanner s= new Scanner(System.in);
	//	int numOfFligh=s.nextInt();

		String companyName=s.nextLine();
		int flighHour=s.nextInt();
		int flighMinutes=s.nextInt();
		s.nextLine();
		String takeOff= s.nextLine();
		int day=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		LandingFlights landings= new LandingFlights( companyName, flighHour, flighMinutes, takeOff, day, month, year);
		ManagingClass.addToLandingArray(landings);
		
		
	}
	private static void CreateTakingOfFlight() throws FileNotFoundException {
		System.out.println("Please fill in the following details: \n"
				+ "1)Company name: \n"
				+ "2)Flight hour: \n"
				+ "3)Flight minute: \n"
				+ "4)Landing at..: \n"
				+ "5)day: \n"
				+ "6)Month: \n"
				+ "7)Year: \n");
		
		Scanner s= new Scanner(System.in);
		//int numOfFligh=s.nextInt();
		String companyName=s.nextLine();
		int flighHour=s.nextInt();
		int flighMinutes=s.nextInt();
		s.nextLine();
		String landing=s.nextLine();
		int day=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		TakingOfFlights takingOf= new TakingOfFlights(companyName, flighHour, flighMinutes, landing, day, month, year);
		ManagingClass.addToTakingOfArray(takingOf);
	
		
	}
	private static void searchForFligh() {
		
		
		
	}
	
	public static void saveAllFlights() throws FileNotFoundException {
		ManagingClass.saveAllLandings();
		ManagingClass.saveAlltakeOff();
	}

}
