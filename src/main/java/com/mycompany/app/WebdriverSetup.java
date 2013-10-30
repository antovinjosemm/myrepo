package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class WebdriverSetup {

	WebDriver driver = null;
	
	@BeforeTest
	@Parameters({"browser", "location"})
	public void setUp(String browserName, String loc){
		if (browserName.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver(); 
		}
		else if (browserName.equalsIgnoreCase("Chrome") && loc != null){
			System.setProperty("webdriver.chrome.driver", loc);
			driver = new ChromeDriver();
		}
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
}
