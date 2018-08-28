package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author sujay_nabar
 * This class will store all the locators and methods of login page
 *
 */

public class LoginPage {
	
	/*WebDriver driver;
	
	By email = By.id("ap_email");
	By pwd = By.id("ap_password");
	By loginButton = By.id("signInSubmit");
	By AmazonCart = By.id("nav-link-yourAccount");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("sujaynabar30@gmail.com");
	}
	
	public void typePassword()
	{
		driver.findElement(pwd).sendKeys("mangirish");
	}
	
	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}
	
	public void clickCart()
	{
		driver.findElement(AmazonCart).click();
	}*/
	
	WebDriver driver;
	
	public LoginPage(WebDriver localdriver) {
		this.driver = localdriver;
	}
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	@FindBy(id="nav-link-yourAccount")
	WebElement AmazonCart;
	
	@FindBy(id="continue")
	WebElement ContinueButton;
	
	public void loginToAmazon(String emailid, String pass)
	{
		AmazonCart.click();
		email.sendKeys(emailid);
		ContinueButton.click();
		password.sendKeys(pass);
		signin.click();
	}
	
	
	
	
}
