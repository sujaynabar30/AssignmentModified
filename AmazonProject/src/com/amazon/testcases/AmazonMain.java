package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonMain {
	
	
	@Test
	public void login()
	{
		VerifyAmazonLogin login = new VerifyAmazonLogin();
		login.verifyValidLogin();
		
		
	}
	
	@Test (dependsOnMethods={"login"})
	public void Test3() {
		
		System.out.println("hello test");
	}
	
}
