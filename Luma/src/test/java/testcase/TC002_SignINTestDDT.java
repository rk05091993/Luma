package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MyAccountPage;
import pageobject.SignUpPage;
import testbase.TestBaseCommon;
import utility.DataProviders;

public class TC002_SignINTestDDT   extends TestBaseCommon {
	@Test(dataProvider ="TestLogin",dataProviderClass =DataProviders.class)
	public void login(String username,String pass,String res)
	{
		logger.info("Test Case002_ Started**************************");
		
		try {
		HomePage pg=new HomePage(driver);
		pg.clickSignin();
		
		
	 LoginPage lp=new LoginPage(driver);
	 lp.setEmail(username);
	 lp.setPassword(pass);
	 lp.clickSignin();
	 
	 MyAccountPage mc=new MyAccountPage(driver);
	 boolean targetpage = mc.isMyAccountPageExists();
	 
	 if(res.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				mc.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(res.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				mc.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	} 
	catch(Exception e)
	{
		Assert.fail("An exception occurred: " + e.getMessage());   
	}
		
	logger.info("**** Finished TC_002_LoginDDT *****");

		
	}

	}
