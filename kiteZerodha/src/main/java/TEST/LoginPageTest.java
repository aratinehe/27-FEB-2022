package TEST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.ZerodhaloginPage;
import Utility.Parametrization;
import Utility.Report;
@Listeners(TestListeners.class)
public class LoginPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void extentReports()
	{
		reports=Report.createReport();
	}
	@BeforeMethod
	public void browser()
	{
		driver=Browser.OpenBrowser();
	}
	@Test
	public void LoginwithValidCredentialsTest() throws IOException, InterruptedException
	{
		test=reports.createTest("LoginwithValidCredentialsTest");
		ZerodhaloginPage zerodhaloginPage=new ZerodhaloginPage(driver);
		zerodhaloginPage.enterlogin();
		String text=zerodhaloginPage.getErrorText();
		String expectedText="User ID Should be minimum 6";
		//Thread.sleep(3000);
		//Assert.assertEquals(text, expectedText);//Hard Assert
		SoftAssert softAssert=new SoftAssert();
	softAssert.assertEquals(text, expectedText);
		String userName=Parametrization.getData("Credential", 0, 1);
		String password=Parametrization.getData("Credential", 1, 1);
		zerodhaloginPage.enteruserID(userName);
		zerodhaloginPage.enterpassword(password);
		zerodhaloginPage.enterlogin();
		softAssert.assertAll();
	}
	@Test
	public void forgotPasswordLinkTest()
	{
		test=reports.createTest("forgotPasswordLinkTest");
		ZerodhaloginPage zerodhaloginPage=new ZerodhaloginPage(driver);
		zerodhaloginPage.enterforgot();
		
		
	}
	@Test
	public void SignUpLinkTest()
	{
		test=reports.createTest("SignUpLinkTest");
		ZerodhaloginPage zerodhaloginPage=new ZerodhaloginPage(driver);
		zerodhaloginPage.entersignup();
	}
	@Test
	public void CliclonLoginWithoutTestData() throws IOException
	{
		test=reports.createTest("CliclonLoginWithoutTestData");
		ZerodhaloginPage zerodhaloginPage=new ZerodhaloginPage(driver);
		zerodhaloginPage.enterlogin();
	//	String text=zerodhaloginPage.getErrorText();
//	    String expectedText="User ID should be Minimum 6";
	//	Assert.assertEquals(text, expectedText);
		String userName=Parametrization.getData("Credential", 0, 1);
		String password=Parametrization.getData("Credential", 1, 1);
		zerodhaloginPage.enteruserID(userName);
		zerodhaloginPage.enterpassword(password);
		zerodhaloginPage.enterlogin();
	}
	@AfterMethod
	public void closeBrowser(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());		
		} 
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else 
		{
		 test.log(Status.SKIP,result.getName());
		}
	}
	@AfterTest
	public void flushResult()
	{
		reports.flush();
	}
} 
