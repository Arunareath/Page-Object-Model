package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

public class Generic_Test implements Auto_const  {
	
	public WebDriver driver;
	static {
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
	}
	
	@Parameters({"browser"})

	
	@BeforeMethod
	public void openapp(String browser)
	{
		if(browser.contentEquals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.gmail.com");
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
		}
	}
	@AfterMethod
		public void closeapp()
		{
			driver.quit();
		}
}
