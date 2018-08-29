package com.amazon.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.pages.LoginPage;

import PageFactory.BrowserFactory;

/**
 * 
 * @author sujay_nabar
 * 
 * This is a Test case Class
 */

public class VerifyAmazonLogin {
	
	 WebDriver driver;
	 
	
	public VerifyAmazonLogin(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public void verifyValidLogin()
	{
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://www.amazon.in/");
																								//page object model
		LoginPage login = new LoginPage(driver);
		
		login.clickCart();
		login.typeEmail();
		driver.findElement(By.id("continue")).click();				
		login.typePassword();
		login.clickLogin();*/
		

		//WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.amazon.in/");   //this will launch the browser and specific url
		
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);        //created page object using page factory
		
		login_page.loginToAmazon("sujaynabar30@gmail.com", "mangirish");				//call the method
		
		WebElement verify = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]"));
		String check = verify.getText();
		//System.out.println(check);
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		if(check.equals("Hello, NABAR")) {
			System.out.println("Logged in Sucessfully");
		}
		else {
			System.out.println("Login failed.....Closing Browser");
			driver.close();
		}
	}

}
