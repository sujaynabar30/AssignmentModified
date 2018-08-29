package com.amazon.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageFactory.BrowserFactory;

public class ProductPage {

    
	//WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.amazon.in/");
	
	@Test(dataProvider = "SearchProvider", dataProviderClass = DataproviderClass.class)
	public void testMethod(String searchKey,WebDriver driver) {
		
			System.out.println("dataprovided key is :"+searchKey);
			WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")); // find searchbox
			searchbar.clear();
			searchbar.sendKeys(searchKey);
			driver.findElement(By.className("nav-input")).click(); // click search
			driver.findElement(By.linkText(searchKey)).click();			//finding the product and clicking

			WindowHandleClass window = new WindowHandleClass();
			window.windowHandle(driver);
  
	
	}
}
