package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import POJO.Browser;

public class DashboardHome {
@FindBy(xpath="//input[@type=\"text\"]")private WebElement Search;
@FindBy(xpath="(//button[@type=\"button\"])[1]")private WebElement Buy;
@FindBy(xpath="//label[@for=\"radio-182\"]")private WebElement Intraday;
@FindBy(xpath="(//input[@type=\"number\"])[1]")private WebElement Qty;
@FindBy(xpath="//label[@for=\"radio-183\"]")private WebElement Longterm;
@FindBy(xpath="(//input[@type=\"number\"])[2]")private WebElement Price;
@FindBy(xpath="//label[@for=\"radio-191\"]")private WebElement SL;
@FindBy(xpath="//span[text()='TATACOFFEE']")private WebElement EnterSearch;
@FindBy(xpath="//label[@for=\"radio-188\"]")private WebElement Market;
@FindBy(xpath="//label[@for=\"switch-172\"]")private WebElement Toggle;
public DashboardHome(WebDriver driver)
{  
	PageFactory.initElements(driver,this);
	}
public void SearchFor(String search)
{    Search.click();
	Search.sendKeys(search);
	}
public void EnterSearchAction(WebDriver driver) throws InterruptedException
{
		//Select select=new Select(EnterSearch);
//select.selectByVisibleText("TATAMOTORS");
Actions action=new Actions(driver);
Thread.sleep(3000);
action.moveToElement(EnterSearch).perform();
action.sendKeys(Keys.ENTER);
Thread.sleep(2000);
action.moveToElement(Buy);
action.click();
action.perform();
	}
public void clickonBuy(WebDriver driver)
{   Actions action=new Actions(driver);
    action.moveToElement(Buy);
	action.click();
	action.perform();
	}
public void ClickonIntraday() throws InterruptedException

{    Thread.sleep(2000);
	Intraday.click();
	}
public void ClickonQty()
{
	Qty.click();
	Qty.clear();	
	}
public void EnterValueToQty(String QtyNo)
{Qty.sendKeys(QtyNo);
	}
public void ClickonLongterm()
{Longterm.click();
	}
public void ClickonPrice()
{Price.click();
Price.clear();

	}
public void EnterPrice(String PriceNo)
{
	Price.sendKeys(PriceNo);
	}
public void ClickonMarket()
{Market.click();
//Thread.sleep(2000);
	}
public void ClickonSL()
{SL.click();
SL.clear();
	}
public void EnterValueToSL(String SLNo)
{
	SL.sendKeys(SLNo);
	}

public void clickonToggle(WebDriver driver) throws InterruptedException
{
	Actions action=new Actions(driver);
	Thread.sleep(3000);
	action.moveToElement(Toggle).perform();
	action.click();
	Toggle.click();
}
}

