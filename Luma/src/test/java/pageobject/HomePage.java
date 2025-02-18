package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {
	  //Constructors
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
	        WebElement lnk_createaccount;
	
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement lnk_signin;
	
	
	//Actions
	public void clickCreateAcc()
	{
		lnk_createaccount.click();
	}
	
	
	public void clickSignin()
	{
		lnk_signin.click();
	}

}
