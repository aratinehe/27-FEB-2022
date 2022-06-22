package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaloginPage {
	@FindBy(xpath="//input[@id=\'userid\']")private WebElement userID;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type=\'submit\']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement Error;
	public ZerodhaloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enteruserID(String user)
	{
		userID.sendKeys(user);
	}
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void enterlogin()
	{
		login.click();
	}
    public void enterforgot()
    {
    	forgot.click();
    }
    public void entersignup()
    {
    	signUp.click();
    }
    public String getErrorText()
    {
         String user=Error.getText();
         System.out.println(user);
         return user;
    }
    
}
