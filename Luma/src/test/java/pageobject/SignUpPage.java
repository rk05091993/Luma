package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Basepage {
	
	public SignUpPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//span[@class='base']")
	WebElement headdisplay;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement txt_fname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement txt_lname;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_psw;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement txt_Cnfpsw;
	
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement btn_createacc;
	
	//Action
	
	public String getConfirmationMsg() {
		try {
			return (headdisplay.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}}
		
	  public void setFirstname(String firstname)
		{
			txt_fname.sendKeys(firstname);
		}
	
	  public void setLastname(String lastname)
		{
		  txt_lname.sendKeys(lastname);
		}
	  public void setEmail(String email)
		{
		  txt_email.sendKeys(email);
		}
	
	  public void setPassword(String pwd)
		{
		  txt_psw.sendKeys(pwd);
		}
	  public void setCnfPassword(String pwd)
		{
		  txt_Cnfpsw.sendKeys(pwd);
		}
	  public void clickcreateAcc()
	  {
		  btn_createacc.click();
	  }
	
	
	
}
