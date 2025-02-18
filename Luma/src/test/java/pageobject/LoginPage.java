package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_username;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
	WebElement txt_password;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement btn_signin;
	
	public void setEmail(String email)
	{
		txt_username.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	public void clickSignin()
	{
		btn_signin.click();
	}
}
