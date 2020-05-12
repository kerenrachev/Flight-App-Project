package fligh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Flights {

	protected LocalDateTime dateTime;
	protected boolean ifLanding=false;
	protected int numOfFligh;
	protected String companyName;
	protected int flighHour;
	protected int flighMinutes;
	protected String takeOff;
	protected String landing;
	protected int day;
	protected int month;
	protected int year;

    public Flights() {
		
		this("NoName",0,0,"none","none",0,0,0);
	}
	public Flights(String name, int hour,int min, String takeOff,String landing, int day, int month,int year) {
        dateTime= LocalDateTime.of(year, month, day, hour, min);
        setTime(year, month, day, hour, min);
		this.companyName=name;
		this.takeOff= takeOff;
		this.landing=landing;
		
	}
	
	private void setTime(int year, int month, int day, int hour, int min) {
		boolean isOk=true;
		try {
			
		}catch(Exception e){
			isOk=false;
			System.out.println("Exception has been thrown : "+e.getMessage());
		}
		
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
		return "Num of flight: "+numOfFligh +"\nAirplanesCompany: "+companyName+"\n"+"Date: "+ dateTime+"\nYou take off from: "
    +takeOff+"\nYou land at: "+landing +"\n***************************************";
	}
	
	
	
	
	
}
