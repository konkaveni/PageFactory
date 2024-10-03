package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.page;
import com.w2a.pages.actions.HomePage;
import com.w2a.utilities.TestUtil;

import errorcollectors.ErrorCollector;

public class FlightSearchTest {


	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void flightSearchTest(Hashtable<String,String> data) {
		
		if(data.get("runmode").equalsIgnoreCase("n")) {
			
			throw new SkipException("Skipping the test as runmode is No");
		}
		page.initConfiguration();

		HomePage home = new HomePage();
		// Assert.assertEquals(home.findTabCount(), 6);
		ErrorCollector.verifyEquals(home.findTabCount(), 7);
		home.gotoFlights().bookAFlight(data.get("leavingfrom"),data.get("goingto"), data.get("Dates"), data.get("Travelers"));

	}

	@AfterMethod
	public void tearDown() {
		
		if( page.driver!=null){
		page.quitBrowser();

	}
	}

}
