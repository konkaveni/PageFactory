package com.w2a.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

import com.w2a.base.page;
import com.w2a.pages.locators.HomePageLocators;



public class HomePage extends page {
	
	public HomePageLocators home;
	
	public HomePage() {
		
		this.home= new HomePageLocators();
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,10); 
		PageFactory.initElements(factory, this.home);
		
		
	}
	
	public void gotoStays() {
		
		
	}

	public HomePage gotoFlights() {
		click(home.flightTab);
		
		return this;
	}
	
	public void gotoCars() {
		
		
	}
	
	public void gotoVacationPackages() {
		
		
	}
	
	public void gotoThingsToDo() {
		
		
	}
	
	public void gotoCruises() {
		
		
	}
	public int findTabCount() {
		
		
		return home.tabCount.size();
	}
	
	
	public void bookAFlight(String leavingfrom, String goingto, String Dates, String Travelers)  {
		
		type(home.LeavingCity,leavingfrom);
		Actions action= new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		type(home.GoingCity,goingto);
		action.sendKeys(Keys.ENTER).perform();
		type(home.Dates,Dates);
		type(home.Travelers,Travelers);
		
		click(home.search);
		
		
		
	}
	
}
		



