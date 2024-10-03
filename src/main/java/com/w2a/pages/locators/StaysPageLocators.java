package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaysPageLocators {
	
	
	@FindBy(xpath = "//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div/div[2]/div[1]/button")
	public WebElement goingtTo ;
	
	@FindBy(xpath = "//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div/div/div/button")
	public WebElement dates;
	
	
	@FindBy(xpath = "//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[1]/button")
	public WebElement travelers;
	
	@FindBy(id = "search_button")
	public WebElement search;

}
