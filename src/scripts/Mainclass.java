
package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Generic_Test;
import Generic.getdata;
import pom.Validloginlogout;

public class Mainclass extends Generic_Test {

	@Test
	public void mainclass(){


		String uname=getdata.getdata1("Sheet1", 0, 0);

		System.out.println(uname);

		Validloginlogout lp=new Validloginlogout(driver);

		lp.setuname("arunareath@gmail.com");

		lp.setpassword("roomno27");

		lp.signin();

	}

}
