package com.amazon.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amazon.pages.LoginPage;

/**
 * 
 * @author sujay_nabar
 *
 */

public class VerifyAmazonLogin {
	
	@Test
	public void verifyValidLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://www.amazon.in/");
		
		LoginPage login = new LoginPage(driver);
		
		/*login.clickCart();
		login.typeEmail();
		driver.findElement(By.id("continue")).click();				//page object model
		login.typePassword();
		login.clickLogin();*/
		
	}

}
