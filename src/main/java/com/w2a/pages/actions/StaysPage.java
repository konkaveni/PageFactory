package com.w2a.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.page;
import com.w2a.pages.locators.StaysPageLocators;

public class StaysPage extends page{
	public StaysPageLocators stays;
	public StaysPage() {
		this.stays= new StaysPageLocators();
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.stays);
		
	}
	
	public void staysPage(String Goingto, String Dates, String Travelers) {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    stays.goingtTo.sendKeys(Goingto);
	    Actions action= new Actions(driver);
	    action.sendKeys(Keys.ENTER).perform();
		type(stays.goingtTo,Dates);
		type(stays.goingtTo,Travelers);	
		click(stays.search);
		
	}

}
