package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

	@FindBy(xpath = "//*[@id=\"primary-navigation\"]/div/div/div/div/div[1]/a/div")
	public WebElement stay;
	
	@FindBy(xpath = "//*[@id=\"primary-navigation\"]/div/button/div")
	public WebElement moreTravel;
	
	
}
