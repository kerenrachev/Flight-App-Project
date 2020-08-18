package fligh;

import java.io.FileNotFoundException;
import java.security.spec.MGF1ParameterSpec;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) throws FileNotFoundException {
		
		LandingFlights t1= new LandingFlights ("El-Al2",23,47,"Moscow",1,11,2020);
		TakingOfFlights t2= new TakingOfFlights ("El-Al",0,12,"New York",7,4,2021);
		TakingOfFlights t3= new TakingOfFlights ("Eourope Air",12,27,"Yemen",12,11,2022);
		ManagingClass.landingFlights.add(t1);
		ManagingClass.takingOfFlights.add(t2);
        ManagingClass.takingOfFlights.add(t3);
		
		int choise;
		Scanner s=new Scanner(System.in);
		
		do {
			do {
				System.out.println("Please enter valid choise (between 0-6 ) ");
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
				System.out.println("Please save all your flights before searching for one, to save write 'SAVE' ,else,type anything else.");
				s.nextLine();
				String answer=s.nextLine();
				if(answer.equalsIgnoreCase("save")) {
					System.out.println();
					System.out.println("Saved, thank you. Now you can search for a flight in your updates list");
					saveAllFlights();
					System.out.println("Choose your searcing options,\nType the number of the chosen option:\n"
							+ "1)Date and Hour\n"
							+ "2)Destanation\n"
							+ "3)Date, hour and destanation.\n");
					int choice = s.nextInt();
					switch (choice) {
					case 1:
						findFlighByDateAndHour();
						break;

					case 2:
						findFlighByDestanation();
						break;
					case 3:
						findFlighByDateAndHourAndDestanation();
						break;
					}
					
					
				}
				else 
				{
					findFlighByDateAndHour();
				}
				break;
			case 7:
				System.out.println("Bye Bye!!");
			}
			
		} while (choise!=7);
		
	}

	private static void findFlighByDateAndHourAndDestanation() throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please fill in the following details: \n" + "1)Flight hour: \n"
				+ "2)Flight minute: \n" + "3)day: \n" + "4)Month: \n" + "5)Year: \n");

		int flighHour = s.nextInt();
		int flighMinutes = s.nextInt();
		int day = s.nextInt();
		int month = s.nextInt();
		int year = s.nextInt();
		System.out.println("Please type the number of your choice:\n" 
								+ "1)I want to see landing flights from this destanation.\n" 
								+ "2)I want to see takeoff flights to this destanation.\n" 
								+ "3)I want to see both landing flights and takeoff flights to this destantion\n");
		int typeOfFlight = s.nextInt();
		LocalDateTime localDate= LocalDateTime.of(year,month,day,flighHour,flighMinutes);
		
		System.out.println("Please type the wanted destanation:\n");
		s.nextLine();
		String destanation = s.nextLine();
		if (!ManagingClass.findFlight(localDate,destanation,typeOfFlight)) {
			System.out.println("No flights to this destanation.");
		}
	}

	private static void findFlighByDestanation() throws FileNotFoundException {
		Scanner s =new Scanner(System.in);
		System.out.println("Please type the wanted destanation:\n");
		//s.nextLine();
		String destanation = s.nextLine();
		System.out.println("Please type the number of your choice:\n"
				+ "1)I want to see landing flights from this destanation.\n"
				+ "2)I want to see takeoff flights to this destanation.\n"
				+ "3)I want to see both landing flights and takeoff flights to this destantion\n");
		int typeOfFlight = s.nextInt();
		if (!ManagingClass.findFlight(destanation,typeOfFlight)) {
			System.out.println("No flights to this destanation.");
		}
	}

	private static void findFlighByDateAndHour() throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please fill in the following details: \n" + "1)Flight hour: \n"
				+ "2)Flight minute: \n" + "3)day: \n" + "4)Month: \n" + "5)Year: \n");

		int flighHour = s.nextInt();
		int flighMinutes = s.nextInt();
		int day = s.nextInt();
		int month = s.nextInt();
		int year = s.nextInt();
		System.out.println("Please type the number of your choice:\n" 
								+ "1)I want to see landing flights from this destanation.\n" 
								+ "2)I want to see takeoff flights to this destanation.\n" 
								+ "3)I want to see both landing flights and takeoff flights to this destantion\n");
		int typeOfFlight = s.nextInt();
		LocalDateTime localDate= LocalDateTime.of(year,month,day,flighHour,flighMinutes);
		if(!ManagingClass.findFlight(localDate,typeOfFlight)) {
			System.out.println("No flights in this date.");
		}
		
	}

	private static void CreateLandingFlight() throws FileNotFoundException {
		boolean isOk = true;
		do {
			System.out.println("Please fill in the following details: \n" + "1)Company name: \n" + "2)Flight hour: \n"
					+ "3)Flight minute: \n" + "4)Takes of from....: \n" + "5)day: \n" + "6)Month: \n" + "7)Year: \n");
			Scanner s = new Scanner(System.in);
			//	int numOfFligh=s.nextInt();
			String companyName = s.nextLine();
			int flighHour = s.nextInt();
			int flighMinutes = s.nextInt();
			s.nextLine();
			String takeOff = s.nextLine();
			int day = s.nextInt();
			int month = s.nextInt();
			int year = s.nextInt();
			LandingFlights landings = new LandingFlights(companyName, flighHour, flighMinutes, takeOff, day, month,
					year);
			isOk = ManagingClass.addToLandingArray(landings);
		} while (!isOk);	
	}
	private static void CreateTakingOfFlight() throws FileNotFoundException {
		boolean isOk=true;
		do {
			System.out.println("Please fill in the following details: \n" + "1)Company name: \n" + "2)Flight hour: \n"
					+ "3)Flight minute: \n" + "4)Landing at..: \n" + "5)day: \n" + "6)Month: \n" + "7)Year: \n");
			Scanner s = new Scanner(System.in);
			//int numOfFligh=s.nextInt();
			String companyName = s.nextLine();
			int flighHour = s.nextInt();
			int flighMinutes = s.nextInt();
			s.nextLine();
			String landing = s.nextLine();
			int day = s.nextInt();
			int month = s.nextInt();
			int year = s.nextInt();
			TakingOfFlights takingOf = new TakingOfFlights(companyName, flighHour, flighMinutes, landing, day, month,
					year);
			isOk=ManagingClass.addToTakingOfArray(takingOf);
		} while (!isOk);
	
		
	}
	
	public static void saveAllFlights() throws FileNotFoundException {
		ManagingClass.saveAllLandings();
		ManagingClass.saveAlltakeOff();
	}

}
