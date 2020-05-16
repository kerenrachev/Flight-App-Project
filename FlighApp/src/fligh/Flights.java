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
//test
	protected LocalDateTime dateTime;
	protected boolean ifLanding=false;
	protected int numOfFligh;
	protected String companyName;
	protected String takeOff;
	protected String landing;

    public Flights() {
		
		this("NoName",0,0,"none","none",0,0,0);
	}
	public Flights(String name, int hour,int min, String takeOff,String landing, int day, int month,int year) {
        setTime(year, month, day, hour, min);
		this.companyName=name;
		this.takeOff= takeOff;
		this.landing=landing;
		
	}
	
	public Flights(String compony, String from,String to, LocalDateTime dateTime2) {
		this.companyName=compony;
		this.takeOff=from;
		this.landing=to;
		this.dateTime=dateTime2;
	}
	private void setTime(int year, int month, int day, int hour, int min) {
		boolean isOk=true;
		try {
			this.dateTime = dateTime= LocalDateTime.of(year, month, day, hour, min); 
		}catch(Exception e){
			isOk=false;
			System.out.println("Exception has been thrown : "+e.getMessage());
		}
		
	}
    public void save (PrintWriter print) throws FileNotFoundException {

    	print.write(companyName+"\n");
    	print.write(takeOff+"\n");
    	print.write(landing+"\n");
    	String date= dateTime.toString();
    	date.replace('T', ' ');
    	print.write(dateTime+"\n");

    }

    
	@Override
	public String toString() {
		return "Num of flight: "+numOfFligh +"\nAirplanesCompany: "+companyName+"\n"+"Date: "+ dateTime+"\nYou take off from: "
    +takeOff+"\nYou land at: "+landing +"\n***************************************";
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public boolean isIfLanding() {
		return ifLanding;
	}
	public int getNumOfFligh() {
		return numOfFligh;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getTakeOff() {
		return takeOff;
	}
	public String getLanding() {
		return landing;
	}
	
	
}
