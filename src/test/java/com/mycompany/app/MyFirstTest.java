package com.mycompany.app;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mycompany.app.WebdriverSetup;
import com.mycompany.app.googlePage;

public class MyFirstTest extends WebdriverSetup{

	@Test
	public void testGoogle() throws InterruptedException{
	
//	public static void main(String args[]) throws InterruptedException{
		////WebDriver driver = new FirefoxDriver();
		
		googlePage googlePg = new googlePage(driver);
		
		driver.get("http://www.google.co.in");
		googlePg.enterSearchString("selenium");
		//String[] searchstring = {"selenium"};
//		WebElement element = driver.findElement(By.id("gbqfq"));
//		String abc[0] = "selenium";
//		element.sendKeys(abc);
//		driver.findElement(By.id("gbqfq")).sendKeys("selenium");
		//driver.findElement(By.name("q")).sendKeys(searchstring);
//		driver.wait(5);
//		gbqfsa
		//driver.findElement(By.id("gbqfb")).click();
		googlePg.clickSearchButton();
		System.out.println("........ search clicked");
		Thread.sleep(5000);
	}
}
