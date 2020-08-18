package tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.Test;

import fligh.LandingFlights;
import fligh.ManagingClass;
import fligh.TakingOfFlights;

class Magmant {

	ManagingClass test=new ManagingClass();
	
	//********************************************************************TakingOfFlights**************************************************************
		TakingOfFlights object1 = new TakingOfFlights("iron maiden", 10, 10, "normandy", 12, 4, 2040);
		TakingOfFlights object2 = new TakingOfFlights("sabaton", 10, 25, "kursk", 10, 9, 2025);
		TakingOfFlights object3 = new TakingOfFlights("black sabbath", 04, 01, "berlin", 1, 12, 2023);
		TakingOfFlights object4 = new TakingOfFlights("pink floyd", 22, 06, "Somme", 12, 1, 2040);
		TakingOfFlights object5 = new TakingOfFlights("led zeppelin", 21, 00, "Verdun", 10, 1, 2040);
	//*************************************************************************************************************************************************
	//********************************************************************TakingOfFlights**************************************************************
		LandingFlights object6 = new LandingFlights("Dire Straits", 10, 10, "Stalingrad", 12, 4, 2040);
		LandingFlights object7 = new LandingFlights("the police", 10, 25, "El Alamein", 10, 9, 2025);
		LandingFlights object8 = new LandingFlights("Queen", 04, 01, "Monte Cassino", 1, 12, 2023);
		LandingFlights object9 = new LandingFlights("rolling stones", 22, 06, "Chinese Farm", 12, 1, 2040);
		LandingFlights object10 = new LandingFlights("guns n roses", 21, 00, "valley of tears", 10, 1, 2040);
	//*************************************************************************************************************************************************
	//flight than no on the list
		LandingFlights teror1 = new LandingFlights("internet explorer", 10, 10, "Stalingrad", 12, 4, 2040);
		TakingOfFlights teror2 = new TakingOfFlights("icq", 04, 01, "berlin", 1, 12, 2023);
		
		
		
	@Test
	void seekForRealFlights() {
		test.addToTakingOfArray(object1);
		test.addToTakingOfArray(object2);
		test.addToTakingOfArray(object3);
		test.addToTakingOfArray(object4);
		test.addToTakingOfArray(object5);
		test.addToLandingArray(object6);
		test.addToLandingArray(object7);
		test.addToLandingArray(object8);
		test.addToLandingArray(object9);
		test.addToLandingArray(object10);
		assertTrue(seekFlightInList(object1,test));
		assertTrue(seekFlightInList(object2,test));
		assertTrue(seekFlightInList(object3,test));
		assertTrue(seekFlightInList(object4,test));
		assertTrue(seekFlightInList(object5,test));
		assertTrue(seekFlightInList(object6,test));
		assertTrue(seekFlightInList(object7,test));
		assertTrue(seekFlightInList(object8,test));
		assertTrue(seekFlightInList(object9,test));
		assertTrue(seekFlightInList(object10,test));
	}
	
	@Test
	void seekForFakeFlight() {
		test.addToTakingOfArray(object1);
		test.addToTakingOfArray(object2);
		test.addToTakingOfArray(object3);
		test.addToTakingOfArray(object4);
		test.addToTakingOfArray(object5);
		test.addToLandingArray(object6);
		test.addToLandingArray(object7);
		test.addToLandingArray(object8);
		test.addToLandingArray(object9);
		test.addToLandingArray(object10);
		assumeFalse(seekFlightInList(teror1,test));
		assumeFalse(seekFlightInList(teror2,test));
	}
	
	
	
	
	
	
	//****************************private metod********************************
	private boolean seekFlightInList(TakingOfFlights test, ManagingClass cheak) {
		for (int i = 0; i < cheak.takingOfFlights.size(); i++) {
		if (cheak.takingOfFlights.get(i).equals(test)) {
			return true;
		}
	 }	
	return false;
	}
	
	private boolean seekFlightInList(LandingFlights test, ManagingClass cheak) {
		for (int i = 0; i < cheak.landingFlights.size(); i++) {
		if (cheak.landingFlights.get(i).equals(test)) {
			return true;
		}
	 }
	return false;
	}

}