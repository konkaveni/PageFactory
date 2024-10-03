package com.w2a.rough;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.page;
import com.w2a.pages.actions.HomePage;

public class FlightSearchTest {

	public static void main(String[] args) {

		page.initConfiguration();
		HomePage home = new HomePage();
		home.gotoFlights().bookAFlight("Boston, MA, United States of America (BOS-Logan Intl.)","Dallas, TX, United States of America (DFW-Dallas-Fort Worth Intl.)","Dec 6 - Dec 21","1 traveler");
		page.quitBrowser();
		
		
		
	}

}
