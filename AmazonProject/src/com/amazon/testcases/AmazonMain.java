package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.BrowserFactory;

public class AmazonMain extends ProductPage {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		 driver = BrowserFactory.startBrowser("chrome", "https://www.amazon.in/");
	}

	@Test
	public void login()
	{
		VerifyAmazonLogin login = new VerifyAmazonLogin(driver);
		login.verifyValidLogin();

	}
	
	@Test(dependsOnMethods={"login"},dataProvider = "SearchProvider", dataProviderClass = DataproviderClass.class)
	public void proudctPage(String key) throws InterruptedException {
		//Thread.sleep(3000);
		testMethod(key,driver);
			
	}
	
	@Test(dependsOnMethods= {"proudctPage"})
	public void productDelete()
	{
		ProductDeleteClass proddelcart = new ProductDeleteClass();
		proddelcart.prodDelete(driver);
	}
	
	@AfterTest()
	public void afterTest()
	{
		driver.quit();
	}
		
}
