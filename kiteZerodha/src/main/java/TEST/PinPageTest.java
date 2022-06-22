package TEST;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaPinPage;
import POM.ZerodhaloginPage;
import Utility.Parametrization;

public class PinPageTest {
WebDriver driver;
@BeforeMethod
public void launchBrowser()
{
	driver=Browser.OpenBrowser();
	}
@Test

public void logintoZerodhawithPinTest() throws Exception
{

	ZerodhaloginPage zerodhaloginPage=new ZerodhaloginPage(driver);
	String userName=Parametrization.getData("Credential", 0, 1);
	String password=Parametrization.getData("Credential", 1, 1);
	zerodhaloginPage.enteruserID(userName);
	zerodhaloginPage.enterpassword(password);
	zerodhaloginPage.enterlogin();
	Thread.sleep(2000);
	ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
			String pin=Parametrization.getData("Credential", 2, 1);
		System.out.println(pin);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.enterSubmit();
		
	}

}
