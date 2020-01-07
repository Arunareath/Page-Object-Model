package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validloginlogout {

	public WebDriver driver;
	
	@FindBy(xpath="//div[@class='_2zrpKA _1dBPDZ']")
	private WebDriver usernametxt;
	

	@FindBy(xpath="//div[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebDriver passwordtxt;
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebDriver clickbox;
	
	public Validloginlogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setuname(String uname)
	{
		usernametxt.sendKeys(uname);
	}
	
	public void setpassword(String pword)
	{
		passwordtxt.sendKeys(pword);
	}
	
	public void signin()
	{
		clickbox.click();
	}
	

	
}
