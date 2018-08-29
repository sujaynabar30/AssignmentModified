package com.amazon.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleClass {
	
	public void windowHandle(WebDriver driver)
	{
		String MainWindow=driver.getWindowHandle();										//windows handling 
		
		 //To handle all new opened window.				
       Set<String> s1=driver.getWindowHandles();		
       Iterator<String> i1=s1.iterator();
       
       while(i1.hasNext())																//windows handling
       {
       		String ChildWindow=i1.next();		
   		
           if(!MainWindow.equalsIgnoreCase(ChildWindow))			
           {    		
                
                   // Switching to Child window
                   driver.switchTo().window(ChildWindow);                             //switching to child window
                   
                   driver.findElement(By.id("add-to-cart-button")).click();    
                   System.out.println("product added to cart");
                   driver.findElement(By.id("nav-cart")).click();
                   
                   driver.close();
           }
            
       }
       driver.switchTo().window(MainWindow);
       
	}
}

