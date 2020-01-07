package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Screenshot {
	public static void getphoto(WebDriver driver)
	{
		String photo_path="./photos";
		 Date d = new Date();
		 String d1=d.toString();
		 String date=d1.replace(":", "-");
		 TakesScreenshot ts=(TakesScreenshot)driver;
	     File src=ts.getScreenshotAs(OutputType.FILE);
		 File dst=new File(photo_path+date+".png");
		 try {
			 FileUtils.copyFile(src,dst);
		 }
		catch(IOException e) {
		Reporter.log("failed to take screenshot",true);
		}
	}

}
