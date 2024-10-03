package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	
	@FindBy (xpath= "//*[@id=\"multi-product-search-form-1\"]/div/div/div[1]/ul/li[2]/a/span")
	public WebElement flightTab;

	@FindBy (xpath= "//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[1]/div/div/div[2]/div[1]/button")
	public WebElement LeavingCity;
	
	@FindBy (xpath= "//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/button")
	public WebElement GoingCity;
	
	@FindBy (xpath= "//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/div/div/div/button")
	public WebElement Dates;
	
	
	@FindAll({
	@FindBy (xpath= "//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/div[1]/button"),
	@FindBy(css="#FlightSearchForm_ROUND_TRIP > div > div:nth-child(3) > div > div.uitk-field.has-floatedLabel-label.has-icon.has-placeholder > button ")
	})
	public WebElement Travelers;
		
	@FindBy (id= "search_button")
	public WebElement search;
	
	@FindBy (css= "a[role='tab']")
	public List<WebElement> tabCount;
	
	

}
