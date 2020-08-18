package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import fligh.Flights;
import fligh.LandingFlights;
import fligh.TakingOfFlights;

class FlightsAndSons {
	
	
	//all id's 1-5 is for TakingOfFlights and id's 6-10 is for LandingFlights
	
//********************************************************************TakingOfFlights**************************************************************
	TakingOfFlights test1 = new TakingOfFlights("iron maiden", 10, 10, "normandy", 12, 4, 2040);
	TakingOfFlights test2 = new TakingOfFlights("sabaton", 10, 25, "kursk", 10, 9, 2025);
	TakingOfFlights test3 = new TakingOfFlights("black sabbath", 04, 01, "berlin", 1, 12, 2023);
	TakingOfFlights test4 = new TakingOfFlights("pink floyd", 22, 06, "Somme", 12, 1, 2040);
	TakingOfFlights test5 = new TakingOfFlights("led zeppelin", 21, 00, "Verdun", 10, 1, 2040);
//*************************************************************************************************************************************************
//********************************************************************TakingOfFlights**************************************************************
	LandingFlights test6 = new LandingFlights("Dire Straits", 10, 10, "Stalingrad", 12, 4, 2040);
	LandingFlights test7 = new LandingFlights("the police", 10, 25, "El Alamein", 10, 9, 2025);
	LandingFlights test8 = new LandingFlights("Queen", 04, 01, "Monte Cassino", 1, 12, 2023);
	LandingFlights test9 = new LandingFlights("rolling stones", 22, 06, "Chinese Farm", 12, 1, 2040);
	LandingFlights test10 = new LandingFlights("guns n roses", 21, 00, "valley of tears", 10, 1, 2040);
//*************************************************************************************************************************************************
	
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TakingOfFlights<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	// test input and output of Company name
	@Test
	void testname1() {
		assertTrue(testNameInpotAndOutput(test1, "iron maiden"));
	}

	@Test
	void testname2() {
		assertTrue(testNameInpotAndOutput(test2, "sabaton"));
	}

	@Test
	void testname3() {
		assertTrue(testNameInpotAndOutput(test3, "black sabbath"));
	}

	@Test
	void testname4() {
		assertTrue(testNameInpotAndOutput(test4, "pink floyd"));
	}

	@Test
	void testname5() {
		assertTrue(testNameInpotAndOutput(test5, "led zeppelin"));
	}
	// *************************************************************
	// *************************************************************
	// test input and output of sits
	@Test
	void testsite1() {
		assertTrue(testsiteInpotAndOutput(test1, "normandy"));
	}

	@Test
	void testsite2() {
		assertTrue(testsiteInpotAndOutput(test2, "kursk"));
	}

	@Test
	void testsite3() {
		assertTrue(testsiteInpotAndOutput(test3, "berlin"));
	}

	@Test
	void testsite4() {
		assertTrue(testsiteInpotAndOutput(test4, "Somme"));
	}

	@Test
	void testsite5() {
		assertTrue(testsiteInpotAndOutput(test5, "Verdun"));
	}
	// ********************************************************
	// ********************************************************
	// test input and output of date and time
	@Test
	void testTime1() {
		assertTrue(testDate(test1, 12, 4, 2040, 10, 10));
	}

	@Test
	void testTime2() {
		assertTrue(testDate(test2, 10, 9, 2025, 10, 25));
	}

	@Test
	void testTime3() {
		assertTrue(testDate(test3, 1, 12, 2023, 04, 01));
	}

	@Test
	void testTime4() {
		assertTrue(testDate(test4, 12, 01, 2040, 22, 06));
	}

	@Test
	void testTime5() {
		assertTrue(testDate(test5, 10, 1, 2040, 21, 00));
	}
	
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>LandingFlights<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// test input and output of Company name
	@Test
	void testname6() {
		assertTrue(testNameInpotAndOutput(test6, "Dire Straits"));
	}

	@Test
	void testname7() {
		assertTrue(testNameInpotAndOutput(test7, "the police"));
	}

	@Test
	void testname8() {
		assertTrue(testNameInpotAndOutput(test8, "Queen"));
	}

	@Test
	void testname9() {
		assertTrue(testNameInpotAndOutput(test9, "rolling stones"));
	}

	@Test
	void testname10() {
		assertTrue(testNameInpotAndOutput(test10, "guns n roses"));
	}
	//****************************************************************
	//*****************************************************************
	// test input and output of sits
	void testsite6() {
		assertTrue(testsiteInpotAndOutput(test6, "Stalingrad"));
	}

	@Test
	void testsite7() {
		assertTrue(testsiteInpotAndOutput(test7, "El Alamein"));
	}

	@Test
	void testsite8() {
		assertTrue(testsiteInpotAndOutput(test8, "Monte Cassino"));
	}
	
	@Test
	void testsite9() {
		assertTrue(testsiteInpotAndOutput(test9, "Chinese Farm"));
	}

	@Test
	void testsite10() {
		assertTrue(testsiteInpotAndOutput(test10, "valley of tears"));
	}
	//**************************************************************
	//**************************************************************
	// test input and output of date and time
		@Test
		void testTime6() {
			assertTrue(testDate(test6, 12, 4, 2040, 10, 10));
		}

		@Test
		void testTime7() {
			assertTrue(testDate(test7, 10, 9, 2025, 10, 25));
		}

		@Test
		void testTime8() {
			assertTrue(testDate(test8, 1, 12, 2023, 04, 01));
		}

		@Test
		void testTime9() {
			assertTrue(testDate(test9, 12, 01, 2040, 22, 06));
		}

		@Test
		void testTime10() {
			assertTrue(testDate(test10, 10, 1, 2040, 21, 00));
		}
	
	// **********************************************************************************************************
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>private metod for the cheaking stuff<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// **********************************************************************************************************
	
	
	
	private boolean testsiteInpotAndOutput(LandingFlights test, String sit) {
		if (test.getTakeOff().contentEquals(sit)) {
			return true;
		}
		return false;
	}
	
	private boolean testsiteInpotAndOutput(TakingOfFlights test, String sit) {
		if (test.getLanding().contentEquals(sit)) {
			return true;
		}
		return false;
	}
	
	

	private boolean testNameInpotAndOutput(Flights test, String name) {
		if (test.getCompanyName().contentEquals(name)) {
			return true;
		}
		return false;
	}

	
	   private boolean testDate(Flights test, int day, int month, int year, int h, int m) {
		LocalDateTime test_time = test.getDateTime();
		LocalDateTime timeTocheakTo = LocalDateTime.of(year, month, day, h, m);

		if (test_time.equals(timeTocheakTo))
			return true;
		else {
			return false;
		}
	}

}
