package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.page;
import com.w2a.pages.actions.StaysPage;
import com.w2a.utilities.TestUtil;

public class StaysTest {


	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void staysTest(Hashtable<String,String> data) {
		
      if(data.get("runmode").equalsIgnoreCase("n")) {
			
			throw new SkipException("Skipping the test as runmode is No");
		}
		
		
		page.initConfiguration();
		page.topNav.gotoStays();
		StaysPage stay = new StaysPage();
		stay.staysPage(data.get("Goingto"),data.get("Dates"),data.get("Travelers"));

	}

	@AfterMethod
	public void tearDown() {
		if(page.driver!=null)
		page.quitBrowser();

	}

}
