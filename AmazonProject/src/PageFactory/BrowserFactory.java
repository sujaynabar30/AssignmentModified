package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String BrowserName, String url)
	{
		if(BrowserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equals("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		
		return driver;
		
	}
}
