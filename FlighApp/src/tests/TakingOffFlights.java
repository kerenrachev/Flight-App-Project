package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fligh.TakingOfFlights;

class TakingOffFlights {
	
	
	TakingOfFlights test1=new TakingOfFlights("iron maiden",20,20,"normandy",12,4,2040);
	TakingOfFlights test2=new TakingOfFlights("sabaton",20,20,"kursk",12,4,2040);
	TakingOfFlights test3=new TakingOfFlights("black sabbath",20,20,"berlin",12,4,2040);
	TakingOfFlights test4=new TakingOfFlights("pink floyd",20,20,"Somme",12,4,2040);
	TakingOfFlights test5=new TakingOfFlights("led zeppelin",20,20,"Verdun",12,4,2040);
	 
	 

	
   //test input and output of Company name	
	@Test
	void testname1() {
			assertTrue(testNameInpotAndOutput(test1,"iron maiden"));
	}
	@Test
	void testname2() {
			assertTrue(testNameInpotAndOutput(test2,"sabaton"));
	}
	
	@Test	
	void testname3() {
			assertTrue(testNameInpotAndOutput(test3,"black sabbath"));
	}
	
	@Test
	void testname4() {
			assertTrue(testNameInpotAndOutput(test4,"pink floyd"));
	}
	@Test
	void testname5() {
			assertTrue(testNameInpotAndOutput(test5,"led zeppelin"));
	}
	
	
	
	
	
	//****************************************************************
	//****************************************************************
	
	
	
	//test input and output of Company name	
	@Test	
	void testsite1() {
			assertTrue(testsiteInpotAndOutput(test1,"normandy"));
	}
	@Test
	void testsite2() {
			assertTrue(testsiteInpotAndOutput(test2,"kursk"));
	}
	
	@Test	
	void testsite3() {
			assertTrue(testsiteInpotAndOutput(test3,"berlin"));
	}
	
	@Test
	void testsite4() {
			assertTrue(testsiteInpotAndOutput(test4,"Somme"));
	}
	@Test
	void testsite5() {
			assertTrue(testsiteInpotAndOutput(test5,"Verdun"));
	}
	
	//********************************************************
	//********************************************************
	
	
	
	
	
	
	private boolean testsiteInpotAndOutput(TakingOfFlights test,String sit) {
		if(test.getLanding().contentEquals(sit)) {
		   return true;
		}
		return false;
	}

			private boolean testNameInpotAndOutput(TakingOfFlights test,String name) {
		if(test.getCompanyName().contentEquals(name)) {
		   return true;
		}
		return false;
	}
	


}
