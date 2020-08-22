
import java.io.FileNotFoundException;
import java.security.spec.MGF1ParameterSpec;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.html.HTML;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
        if (args.length==0) {
			System.out.println("<!DOCTYPE html>\r\n" + "				<html>\r\n" + "				<head>\r\n"
					+ "				<meta charset='windows-1255'>\r\n"
					+ "				<title>Flight With Us</title>\r\n" + "				</head>\r\n"
					+ "				<style>\r\n" + "				h1 {\r\n" + "				  color: white;\r\n"
					+ "				  text-align: center;\r\n" + "				}\r\n" + "				h2{\r\n"
					+ "				  text-align: center;\r\n" + "				  font-size: small;\r\n"
					+ "				}\r\n" + "				body{\r\n"
					+ "				   background-image: url('https://monroeaerospace.com/blog/wp-content/uploads/2019/08/airplane-landing-lights-874x452.jpg') ;\r\n"
					+ "				   background-size: cover;\r\n" + "				}\r\n" + "				div{\r\n"
					+ "				   background-color: rgba(5,4,2,0.5);\r\n" + "				   width:850px;\r\n"
					+ "				   height: 500px;\r\n" + "				   margin-left:auto;\r\n"
					+ "				   margin-right:auto;\r\n" + "				   padding: 15px; \r\n"
					+ "				   align-content: center;\r\n" + "				   }\r\n"
					+ "				</style>\r\n" + "				<body>\r\n"
					+ "				<h1> Flight app </h1>\r\n" + "				<div>\r\n" + "				<p>\r\n"
					+ "				<button onclick=\"window.location.href='addTakingOffFlight'\" type=\"button\" value=\"CreateTakingOffFlight\" >Create takingoff flight</button>\r\n" + 
					"				<button onclick=\"window.location.href='addLandingFlight'\" type=\"button\" value=\"CreateLandingFlight\" >Create landing flight</button>\r\n" + 
					"				<button onclick=\"window.location.href='showTakeOfFlight'\" type=\"button\" value=\"ShowTakeOffFlights\" >Show takingoff flights</button>\r\n" + 
					"				<button onclick=\"window.location.href='showLandingFlight'\" type=\"button\" value=\"ShowLandingFlights\" >Show landing flights</button>\r\n" + 
					"                <button type='Button'>Find flight</button> "
					+ "				</p>\r\n" + "				</div>\r\n" + "\r\n" + "				</body>\r\n"
					+ "				</html>");
		}
        if(args.length>0&&args[0].equals("1")) {
        	System.out.println("landings");
        	System.out.println("<!DOCTYPE html>\r\n" + 
        			"				<html>\r\n" + 
        			"				<head>\r\n" + 
        			"				<meta charset='windows-1255'>\r\n" + 
        			"				<title>Flight With Us</title>\r\n" + 
        			"				</head>\r\n" + 
        			"				<style>\r\n" + 
                    "               list  p {\r\n" + 
                    "                    font: arial;\r\n" + 
                    "                    font-size: 14px;\r\n" + 
                    "                    background-color: yellow ;\r\n" + 
                    "                }"+
        			"				h1 {\r\n" + 
        			"				  color: white;\r\n" + 
        			"				  text-align: center;\r\n" + 
        			"				}\r\n" + 
        			"				h2{\r\n" + 
        			"				  text-align: center;\r\n" + 
        			"				  font-size: small;\r\n"
        			+ "               color:white;\r\n       " + 
        			"				}\r\n" + 
        			"				body{\r\n" + 
        			"				   background-image: url('https://monroeaerospace.com/blog/wp-content/uploads/2019/08/airplane-landing-lights-874x452.jpg') ;\r\n" + 
        			"				   background-size: cover;\r\n" + 
        			"				}\r\n" + 
        			"				div{\r\n" + 
        			"				   background-color: rgba(5,4,2,0.5);\r\n" + 
        			"				   width:850px;\r\n" + 
        			"				   height: 500px;\r\n" + 
        			"				   margin-left:auto;\r\n" + 
        			"				   margin-right:auto;\r\n" + 
        			"				   padding: 15px; \r\n" + 
        			"				   align-content: center;\r\n" + 
        			"				   }\r\n" + 
        			"				</style>\r\n" + 
        			"				<body>\r\n" + 
        			"				<h1> Flight app </h1>\r\n" + 
        			"				<div>\r\n" + 
        			"				<p>\r\n" + 
          			"				<button onclick=\"window.location.href='addTakingOffFlight'\" type=\"button\" value=\"CreateTakingOffFlight\" >Create takingoff flight</button>\r\n" + 
          			"				<button onclick=\"window.location.href='addLandingFlight'\" type=\"button\" value=\"CreateLandingFlight\" >Create landing flight</button>\r\n" + 
          			"				<button onclick=\"window.location.href='showTakeOfFlight'\" type=\"button\" value=\"ShowTakeOffFlights\" >Show takingoff flights</button>\r\n" + 
          			"				<button onclick=\"window.location.href='showLandingFlight'\" type=\"button\" value=\"ShowLandingFlights\" >Show landing flights</button>\r\n" + 
          			"                <button type='Button'>Find flight</button>"+ 
        			"               <p>&nbsp;</p>\r\n" + 
        			"               <p>takeOff.txt</p>\r\n" + 
        			"               <p>&nbsp;</p>\r\n" + 
        			"               <div id=\'list'\">\r\n" + 
        			"               <p><iframe src=\'C:/Users/User/Documents/GitHub/FlighWithUs/FlightApp2/src/takeOff.txt\' frameborder=\'1\' height=\'400\'\r\n" + 
        			"               width='95%''></iframe></p>\r\n" + 
        			"               </div>"+
        			"				</p>\r\n" + 
        			"				</div>\r\n" + 
        			"               \r\n" + 
        			"				</body>\r\n" + 
        			"				</html>");
        }
        if(args.length>0&&args[0].equals("2")) {
        	System.out.println("Show taking off flights!!");
        }
       
        if(args.length>0&&args[0].equals("4")) {
        	
        	System.out.println("<!DOCTYPE html>\r\n" + 
        			"				<html>\r\n" + 
        			"				<head>\r\n" + 
        			"				<meta charset='windows-1255'>\r\n" + 
        			"				<title>Flight With Us</title>\r\n" + 
        			"				</head>\r\n" + 
        			"				<style>\r\n" + 
        			"				h1 {\r\n" + 
        			"				  color: white;\r\n" + 
        			"				  text-align: center;\r\n" + 
        			"				}\r\n" + 
        			"				h2{\r\n" + 
        			"				  text-align: center;\r\n" + 
        			"				  font-size: small;\r\n" + 
        			"				}\r\n" + 
        			"               h3{ color:white }"+
        			"				body{\r\n" + 
        			"             background-image: url('https://monroeaerospace.com/blog/wp-content/uploads/2019/08/airplane-landing-lights-874x452.jpg') ;\r\n"
 					+ "				   background-size: cover;\r\n" + "				}\r\n" + "				div{\r\n"
 					+ "				   background-color: rgba(5,4,2,0.5);\r\n" + "				   width:850px;\r\n"
 					+ "				   height: 500px;\r\n" + "				   margin-left:auto;\r\n"
 					+ "				   margin-right:auto;\r\n" + "				   padding: 15px; \r\n"
 					+ "				   align-content: center; }</style>"+
        			"				<body>\r\n" + 
        			"				<h1> Flight app </h1>\r\n" + 
        			"				<div>\r\n" + 
        			"				<p>\r\n" + 
        			"				<button onclick=\"window.location.href='addTakingOffFlight'\" type=\"button\" value=\"CreateTakingOffFlight\" >Create takingoff flight</button>\r\n" + 
        			"				<button onclick=\"window.location.href='addLandingFlight'\" type=\"button\" value=\"CreateLandingFlight\" >Create landing flight</button>\r\n" + 
        			"				<button onclick=\"window.location.href='showTakeOfFlight'\" type=\"button\" value=\"ShowTakeOffFlights\" >Show takingoff flights</button>\r\n" + 
        			"				<button onclick=\"window.location.href='showLandingFlight'\" type=\"button\" value=\"ShowLandingFlights\" >Show landing flights</button>\r\n" + 
        			"                <button type='Button'>Find flight</button>" + 
        			"                <form method=\"POST\"> \r\n" + 
        			"                <h3>Please fill 'company' , 'Arrives from' , and 'Time' by this order and than press submit! </h3>\r\n" + 
        			"                <textarea name=\"Company\"></textarea><br>" + 
        			"                <textarea name=\"Destination\"></textarea><br>" + 
        			"                <textarea name=\"Time\"></textarea><br>" + 
        			"                <button type=\"submit\" name=\"submit\">Submit</button>\r\n" + 
        			"                </form>\r\n" + 
        			"\r\n" + 
        			"				<h2> </h2>\r\n" + 
        			"				</p>\r\n" + 
        			"				</div>\r\n" + 
        			"\r\n" + 
        			"				</body>\r\n" + 
        			"				</html>");
        }
        if(args.length>0&&args[0].equals("5")){
        	// company, destination,time,date
        	CreateTakingOfFlight(args[1],args[2],args[3],args[4]);
        	System.out.println("<!DOCTYPE html>\r\n" + 
        			"<html lang=\"en\">\r\n" + 
        			"<head>\r\n" + 
        			"				<meta charset='windows-1255'>\r\n" + 
        			"				<title>Flight With Us</title>\r\n" + 
        			"				</head>\r\n" + 
        			"				<style>\r\n" + 
        			"				h1 {\r\n" + 
        			"				  color: white;\r\n" + 
        			"				  text-align: center;\r\n" + 
        			"				}\r\n" + 
        			"				h2{\r\n" + 
        			"				  text-align: center;\r\n" + 
        			"				  font-size: big;\r\n" + 
        			"				  color: white;\r\n" + 
        			"				}\r\n" + 
        			"				h3 {color: white}\r\n" + 
        			"				body{\r\n" + 
        			"				   background-image: url('https://monroeaerospace.com/blog/wp-content/uploads/2019/08/airplane-landing-lights-874x452.jpg') ;\r\n" + 
        			"				   background-size: cover;\r\n" + 
        			"				}\r\n" + 
        			"				div{\r\n" + 
        			"				   background-color: rgba(5,4,2,0.5);\r\n" + 
        			"				    width:850px;\r\n" + 
        			"					height: 500px;\r\n" + 
        			"					margin-left:auto;\r\n" + 
        			"				    margin-right:auto;\r\n" + 
        			"				    padding: 15px;\r\n" + 
        			"					align-content: center;\r\n" + 
        			"				}\r\n" + 
        			"\r\n" + 
        			"				</style>\r\n" + 
        			"				<body>\r\n" + 
        			"				<h1> Flight app </h1>\r\n" + 
        			"				<div>\r\n" + 
        			"				<p>\r\n" + 
        			"				<button onclick=\"window.location.href='addTakingOffFlight'\" type=\"button\" value=\"CreateTakingOffFlight\" >Create takingoff flight</button>\r\n" + 
        			"				<button onclick=\"window.location.href='addLandingFlight'\" type=\"button\" value=\"CreateLandingFlight\" >Create landing flight</button>\r\n" + 
        			"				<button onclick=\"window.location.href='showTakeOfFlight'\" type=\"button\" value=\"ShowTakeOffFlights\" >Show takingoff flights</button>\r\n" + 
        			"				<button onclick=\"window.location.href='showLandingFlight'\" type=\"button\" value=\"ShowLandingFlights\" >Show landing flights</button>\r\n" + 
        			"                <button type='Button'>Find flight</button>\r\n" + 
        			"\r\n" + 
        			"\r\n" + 
        			"				<h2> File created successfully! </h2>\r\n" + 
        			"				</p>\r\n" + 
        			"				</div>\r\n" + 
        			"\r\n" + 
        			"				</body>\r\n" + 
        			"</html>");
        }
				
		
		
/*
		LandingFlights t1= new LandingFlights ("El-Al2",23,47,"Moscow",1,11,2020);
		TakingOffFlights t2= new TakingOffFlights ("El-Al",0,12,"New York",7,4,2021);
		TakingOffFlights t3= new TakingOffFlights ("Eourope Air",12,27,"Yemen",12,11,2022);
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
			
		} while (choise!=7);   */
		
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
	
	private static void CreateTakingOfFlight(String name, String destination , String time, String date) throws FileNotFoundException {
		boolean isOk=true;
		do {
			TakingOffFlights takingOf = new TakingOffFlights(name, destination, time, date);
			isOk=ManagingClass.addToTakingOfArray(takingOf);
			saveAllFlights();
		} while (!isOk);
	
		
	}
	
	public static void saveAllFlights() throws FileNotFoundException {
	//	ManagingClass.saveAllLandings();
		ManagingClass.saveAlltakeOff();
	}

}