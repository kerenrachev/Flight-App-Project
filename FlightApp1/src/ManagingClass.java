
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagingClass {

	public static List<LandingFlights> landingFlights = new ArrayList<>();
	public static int numOflandingFlights = 1;
	public static int numOfTakeOffFlights = 2;
	public static List<TakingOffFlights> takingOfFlights = new ArrayList<>();

	public static boolean addToLandingArray(LandingFlights landingFlight) { // compare to return -1 for less, 0 for
																			// equal,1 for greater
		boolean isOk = true;
		try {
			if (landingFlights.size() == 0) {
				landingFlights.add(landingFlight);
				return isOk = true;
			} else {
				int size = landingFlights.size();
				int counter = 0;
				for (int i = 0; i <= size; i++) {
					if (i == size) {
						landingFlights.add(landingFlight);
						break;

					}
					if ((landingFlights.get(i).dateTime.compareTo(landingFlight.dateTime)) > 0) {
						landingFlights.add(i, landingFlight);
						break;
					}
					if ((landingFlights.get(i).dateTime.compareTo(landingFlight.dateTime)) == 0) {
						landingFlights.add(i, landingFlight);
						break;
					}
					if ((landingFlights.get(i).dateTime.compareTo(landingFlight.dateTime)) < 0) {
						continue;
					}
				}
			}
			numOflandingFlights++;
			return isOk = true;
		} catch (Exception e) {
			return isOk = false;
		}
	}

	public void setCurrenTakinfOff(int num) {
		this.numOfTakeOffFlights = num;
	}

	public void setCurrentLanding(int num) {
		this.numOflandingFlights = num;
	}

	public static boolean addToTakingOfArray(TakingOffFlights takingOf) {
		boolean isOk = true;
		try {
			if (takingOfFlights.size() == 0) {
				takingOfFlights.add(takingOf);
				return isOk = true;
			} else {
				int size = takingOfFlights.size();
				int counter = 0;
				for (int i = 0; i <= size; i++) {
					if (i == size) {
						takingOfFlights.add(takingOf);
						break;
					}
					if ((takingOfFlights.get(i).dateTime.compareTo(takingOf.dateTime)) > 0) {
						takingOfFlights.add(i, takingOf);
						break;
					}
					if ((takingOfFlights.get(i).dateTime.compareTo(takingOf.dateTime)) == 0) {
						takingOfFlights.add(i, takingOf);
						break;
					}
					if ((takingOfFlights.get(i).dateTime.compareTo(takingOf.dateTime)) < 0) {
						continue;
					}
					
				}
			}
			numOfTakeOffFlights++;
			return isOk = true;
		} catch (Exception e) {
			return isOk = false;
		}
	}

	public static String printArrayList(String string) {
		String str = "";
		if (string.equalsIgnoreCase("takeOf")) {
			for (int i = 0; i < takingOfFlights.size(); i++) {
				str += takingOfFlights.get(i).toString() + "\n";
			}
		} else {
			for (int i = 0; i < landingFlights.size(); i++) {
				str += landingFlights.get(i).toString() + "\n";
			}
		}
		return str;
	}

	public static void saveAllLandings() throws FileNotFoundException {
		File file = new File("Landings.txt");
		PrintWriter print = new PrintWriter(file);
		for (int i = 0; i < landingFlights.size(); i++) {
			landingFlights.get(i).save(print);
		}
		print.close();

	}

	public static void saveAlltakeOff() throws FileNotFoundException {
		File file = new File("takeOff.txt");
		PrintWriter print = new PrintWriter(file);
		for (int i = 0; i < takingOfFlights.size(); i++) {
			takingOfFlights.get(i).save(print);
		}
		print.close();
	}

	// 1=landing,2=takeoff,3=both
	public static boolean findFlight(LocalDateTime searchDate, int typeOfFlight) throws FileNotFoundException {
		updateFlightsFromFile();
		boolean hasFoundFlights = false;
		if (typeOfFlight == 1 || typeOfFlight == 3) {
			for (int i = 0; i < landingFlights.size(); i++) {
				if (landingFlights.get(i).dateTime.compareTo(searchDate) == 0) {
					hasFoundFlights = true;
					System.out.println(landingFlights.get(i));
				}
			}
		}
		if (typeOfFlight == 2 || typeOfFlight == 3) {
			for (int i = 0; i < takingOfFlights.size(); i++) {
				if (takingOfFlights.get(i).dateTime.compareTo(searchDate) == 0) {
					hasFoundFlights = true;
					System.out.println(takingOfFlights.get(i));
				}
			}
		}

		return hasFoundFlights;
	}

	// 1=landing,2=takeoff,3=both
	public static boolean findFlight(String destanation, int typeOfFlight) throws FileNotFoundException {
		updateFlightsFromFile();
		boolean hasFoundFlights = false;
		if (typeOfFlight == 1 || typeOfFlight == 3) {
			for (int i = 0; i < landingFlights.size(); i++) {
				if (landingFlights.get(i).takeOffFrom.equalsIgnoreCase(destanation)) {
					hasFoundFlights = true;
					System.out.println(landingFlights.get(i));
				}
			}
		}
		if (typeOfFlight == 2 || typeOfFlight == 3) {
			for (int i = 0; i < takingOfFlights.size(); i++) {
				if (takingOfFlights.get(i).landingTo.equalsIgnoreCase(destanation)) {
					hasFoundFlights = true;
					System.out.println(takingOfFlights.get(i));
				}
			}
		}

		return hasFoundFlights;
	}

	public static boolean findFlight(LocalDateTime localDate, String destanation, int typeOfFlight)
			throws FileNotFoundException {
		updateFlightsFromFile();
		boolean hasFoundFlights = false;
		if (typeOfFlight == 1 || typeOfFlight == 3) {
			for (int i = 0; i < landingFlights.size(); i++) {
				if ((landingFlights.get(i).takeOffFrom.equalsIgnoreCase(destanation))
						&& (landingFlights.get(i).getDateTime().compareTo(localDate)) == 0) {
					hasFoundFlights = true;
					System.out.println(landingFlights.get(i));
				}
			}
		}
		if (typeOfFlight == 2 || typeOfFlight == 3) {
			for (int i = 0; i < takingOfFlights.size(); i++) {
				if ((takingOfFlights.get(i).landingTo.equalsIgnoreCase(destanation))
						&& (takingOfFlights.get(i).getDateTime().compareTo(localDate)) == 0) {
					hasFoundFlights = true;
					System.out.println(takingOfFlights.get(i));
				}
			}
		}
		

		return hasFoundFlights;
	}

	private static void updateFlightsFromFile() throws FileNotFoundException {
		File file = new File("takeOff.txt");
		Scanner s = new Scanner(file);
		takingOfFlights.removeAll(takingOfFlights);
		landingFlights.removeAll(landingFlights);
		for (int i = 0; i < numOfTakeOffFlights; i++) {
			String compony = s.nextLine();
			String from = s.nextLine();
			String to = s.nextLine();
			String str = s.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
			LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
			TakingOffFlights takeOff = new TakingOffFlights(compony, to, dateTime);
			takingOfFlights.add(takeOff);
		}
		file = new File("Landings.txt");
		s = new Scanner(file);
		for (int i = 0; i < numOflandingFlights; i++) {
			String compony = s.nextLine();
			String from = s.nextLine();
			String to = s.nextLine();
			String str = s.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
			LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
			LandingFlights landing = new LandingFlights(compony, from, dateTime);
			landingFlights.add(landing);

		}

	}

}