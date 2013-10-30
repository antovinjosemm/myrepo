package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.mycompany.app.searchResultsPage;

public class googlePage {

	WebDriver driver;		
	searchResultsPage searchResultsPage;
	
	public googlePage(WebDriver driver){
		this.driver = driver;
	}
	
	public googlePage enterSearchString(String searchStr){
		driver.findElement(By.name("q")).sendKeys(searchStr);
		return this;
	}
	public searchResultsPage clickSearchButton(){
		driver.findElement(By.id("gbqfb")).click();
		return searchResultsPage;
	}
	
}
