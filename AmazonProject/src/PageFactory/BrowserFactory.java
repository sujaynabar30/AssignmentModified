package PageFactory;

import java.util.concurrent.TimeUnit;

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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(BrowserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(BrowserName.equals("IE"))
		{
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		return driver;
		
	}
}
