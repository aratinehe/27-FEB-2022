package POM;





import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
@FindBy(xpath="//input[@id=\'pin\']")private WebElement Pin;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement Submit;
@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement Forgot;
@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement SignUp;

public ZerodhaPinPage(WebDriver driver)
{  
	PageFactory.initElements(driver,this);
	}
public void enterPin(String PinNo,WebDriver driver)
{
	FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(50000));
	wait.pollingEvery(Duration.ofMillis(5000));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOf(Pin));
	
	
	
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));//Explicit Wait
//	wait.until(ExpectedConditions.visibilityOf(Pin));
	Pin.sendKeys(PinNo);
	}
public void enterSubmit()
{
	Submit.click();
	}
public void enterForgot()
{Forgot.click();
	}
public void enterSignUp()
{
	SignUp.click();
	}
}
