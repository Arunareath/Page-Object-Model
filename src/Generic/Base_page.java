package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_page {
	
	public WebDriver driver;
	
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	public void verifytitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("titlematching",true);
		}
		catch(Exception e)
		{
			Reporter.log("title not matching",true);
			Assert.fail();
		}
	}
	public void verifyElement(WebElement element,int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver,sec);
		
		try
		{
					wait.until(ExpectedConditions.visibilityOf(element));
					Reporter.log("element found",true);
		}
		catch(Exception e)
		{
			Reporter.log("element not found",true);
			Assert.fail();
		}
	}
	
	public void moveover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}

}
