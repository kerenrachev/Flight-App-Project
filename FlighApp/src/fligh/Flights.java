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
	protected String takeOffFrom;
	protected String landingTo;

    public Flights() {
		
		this("NoName",0,0,"none","none",0,0,0);
	}
	public Flights(String companyName, int hour,int min, String takeOffFrom,String landingTo, int day, int month,int year) {
        setTime(year, month, day, hour, min);
		this.companyName=companyName;
		this.takeOffFrom= takeOffFrom;
		this.landingTo=landingTo;
		
	}
	
	public Flights(String companyName, String landingTo,String takeOffFrom, LocalDateTime dateTime) {
		this.companyName=companyName;
		this.takeOffFrom=takeOffFrom;
		this.landingTo=landingTo;
		this.dateTime=dateTime;
	}
	private void setTime(int year, int month, int day, int hour, int min) {
		boolean isOk=true;
		try {
			this.dateTime = LocalDateTime.of(year, month, day, hour, min); 
		}catch(Exception e){
			isOk=false;
			System.out.println("Exception has been thrown : "+e.getMessage());
		}
		
	}
    public void save (PrintWriter print) throws FileNotFoundException {

    	print.write(companyName+"\n");
    	print.write(takeOffFrom+"\n");
    	print.write(landingTo+"\n");
    	String date= dateTime.toString();
    	date.replace('T', ' ');
    	print.write(dateTime+"\n");

    }

    
	@Override
	public String toString() {
		return "Num of flight: "+numOfFligh +"\nAirplanesCompany: "+companyName+"\n"+"Date: "+ dateTime+"\nYou take off from: "
    +takeOffFrom+"\nYou land at: "+landingTo +"\n***************************************";
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
		return takeOffFrom;
	}
	public String getLanding() {
		return landingTo;
	}
	
	
}
