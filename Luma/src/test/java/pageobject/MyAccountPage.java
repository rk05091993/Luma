package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement msgHeading; 
	
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	WebElement btnsignout;
	
	public boolean isMyAccountPageExists()

	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	public void clicklogout()
	{
		btnsignout.click();
	}
}
