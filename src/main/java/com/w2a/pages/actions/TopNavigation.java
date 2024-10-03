package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.page;
import com.w2a.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public static TopNavigationLocators topNavigate;
	
	public TopNavigation(WebDriver driver) {
		
		this.topNavigate= new TopNavigationLocators();
		
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,10); 
		PageFactory.initElements(factory, this.topNavigate);
		
	}
	
	
	public void gotoSignin() {
		
		
		
	}
	
	public void gotoSupport() {
		
		
	}
	
	
	public void gotoTrips() {
		
		
	}
	
	public StaysPage gotoStays() {
		
	page.click(topNavigate.moreTravel);	
	page.click(topNavigate.stay);
	try {
		Thread.sleep(50000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return new StaysPage();
		
	}
	
	public void gotoCars() {
		
		
	}

}
