package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchResultsPage {

	WebDriver driver;
	
	public searchResultsPage(WebDriver driver){
		this.driver = driver;	
	}
	
	public searchResultsPage enterSearchString(String searchStr){
		driver.findElement(By.name("q")).sendKeys(searchStr);
		return this;
	}
	
	public searchResultsPage clickSearchButton(){
		driver.findElement(By.id("gbqfb")).click();
		return searchResultsPage;
	}
}
