package TEST;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.DashboardHome;
import POM.ZerodhaPinPage;
import POM.ZerodhaloginPage;
import Utility.Parametrization;

public class DashboardTest {
WebDriver driver;
private WebElement Buy;
private WebElement EnterSearch;
private WebElement SearchFor;
@BeforeMethod
public void launchBrowser()
{
	driver=Browser.OpenBrowser();
	}
@DataProvider(name="NameData")
public Object[][] data()
{
	return new Object[][] {{"Velocity", "Katraj"},{"Katraj","Pune"}};
	}
@Test(dataProvider="NameData")
public void GoToHomePageTest(String value,String pass)
{System.out.println(value+pass);
	}
@Test
public void DashboardHomePageTest() throws IOException, Throwable
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
		
	DashboardHome dashboardHome=new DashboardHome(driver);
	dashboardHome.SearchFor("TATACOFFEE");
	Thread.sleep(2000);
	Actions action=new Actions(driver);
    action.sendKeys(Keys.ENTER);
action.perform();
	dashboardHome.EnterSearchAction(driver);

	//dashboardHome.clickonBuy(driver);
		dashboardHome.ClickonIntraday();
	dashboardHome.ClickonQty();	
	String Qty=Parametrization.getData("Credential", 3, 1);
	dashboardHome.EnterValueToQty(Qty);
	dashboardHome.ClickonLongterm();
	dashboardHome.ClickonMarket();	
	dashboardHome.ClickonSL();
	//dashboardHome.ClickonPrice();
	//String Price=Parametrization.getData("Credential", 4, 1);
	//dashboardHome.EnterPrice(Price);
	//String SL=Parametrization.getData("Credential", 5, 1);
	//dashboardHome.EnterValueToSL(SL);
	
	dashboardHome.clickonToggle(driver);
	dashboardHome.ClickonQty();
	EnterSearch.clear();
	}

}
