package fligh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Flights {
 
	private boolean ifLanding=false;
	private int numOfFligh;
	private String companyName;
	private int flighHour;
	private int flighMinutes;
	private String takeOff;
	private String landing;
	private int day;
	private int month;
	private int year;
	                            //TO DO DTATIC SERIEL NUM OF FLIGHT ******&&&&&&&&&&&&&&&&
    public Flights() {
		
		this("NoName",0,0,"none","none",0,0,0);
	}
	public Flights(String name, int hour,int min, String takeOff,String landing, int day, int month,int year) {
	//	this.numOfFligh=num;
		this.companyName=name;
		this.flighHour=hour;
		this.flighMinutes=min;
		this.takeOff= takeOff;
		this.landing=landing;
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public Flights(Scanner s) {
	    System.out.println("Please enter the following details with ENTER between them:  ");
	    System.out.println("1)Num of flight \n2)Airplanes company \n3)Hour of flight \n4)Minute of flight"
	    		+ "\n5)Takes off from.. \n6)Landing at...\n7)Day of flight \n8)Month of flight \n9)Year of flight");
	    s.nextLine();
	    this.companyName=s.nextLine();
	    this.flighHour=s.nextInt();
	    this.flighMinutes=s.nextInt();
	    s.nextLine();
	    this.takeOff=s.nextLine();
	    this.landing=s.nextLine();
	    this.day=s.nextInt();
	    this.month=s.nextInt();
	    this.year=s.nextInt();

	    
	}
    public void save (PrintWriter print) throws FileNotFoundException {

    	print.write(numOfFligh+"\n");
    	print.write(companyName+"\n");
    	print.write(flighHour+"\n");
    	print.write(flighMinutes+"\n");
    	print.write(takeOff+"\n");
    	print.write(landing+"\n");
    	print.write(day+"\n");
    	print.write(month+"\n");
    	print.write(year+"\n");
    }

    
	@Override
	public String toString() {
		return "Num of flight: "+numOfFligh +"\nAirplanesCompany: "+companyName+"\nDate of flight: "+ day+"\\"+month+"\\"+year+"\nFlight Hour: "+flighHour+":"+flighMinutes+"\nYou take off from: "
    +takeOff+"\nYou land at: "+landing +"\n***************************************";
	}
	
	
	
	
	
}
