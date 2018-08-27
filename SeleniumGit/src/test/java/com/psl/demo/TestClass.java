package com.psl.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void beforeTest() {
		driver.manage().window().maximize();

		driver.get("https://www.guru99.com/");
	}

	@Test
	public void test() {

		String eTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		String aTitle = "";

		aTitle = driver.getTitle();

		if (aTitle.matches(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
