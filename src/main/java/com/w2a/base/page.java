package com.w2a.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.w2a.listeners.CustomListeners;
import com.w2a.pages.actions.TopNavigation;
import com.w2a.utilities.ExcelReader;

public class page {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public static String browser;
	public static TopNavigation topNav;

	public static void initConfiguration() {

		if (Constants.browser.equals("firefox")) {
			driver = new FirefoxDriver();
			log.debug("Firefox Browser Launched Successfully!!!!");
			
		} else if (Constants.browser.equals("chrome")) {

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			log.debug("Chrome Browser Launched Successfully!!!!");
			
		} else if( Constants.browser.equals("ie")) {

			driver = new InternetExplorerDriver();
			log.debug("IE Browser Launched Successfully!!!!");
			
		}

		driver.get(Constants.testsiteurl);
		log.debug("Navigated to:" + Constants.testsiteurl);
		driver.manage().window().maximize();
		topNav= new TopNavigation(driver);

	}
	
	public static void click(WebElement element) {

		element.click();
		log.debug("clicking on an element:"+element);
		CustomListeners.test.log(Status.INFO, "Clicking on:" + element);
	}
	
	public static void type(WebElement element, String value) {

	    element.sendKeys(value);
		log.debug("Typing in an element: "+element+"  "+"entered value as:"+value);
		CustomListeners.test.log(Status.INFO, "Typing in:" + element + "       " + "entered value as:" + value);
	}
	
	public static void quitBrowser() {
		
		driver.quit();
	}
	
	
}
