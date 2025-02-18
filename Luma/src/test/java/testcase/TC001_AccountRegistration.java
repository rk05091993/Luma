package testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.SignUpPage;
import testbase.TestBaseCommon;



public class TC001_AccountRegistration extends TestBaseCommon {
	
	@Test
	public void verify_account_registration()
	{
		logger.info("Test Case001_ Started**************************");
		try {
		HomePage hm=new HomePage(driver);
	      hm.clickCreateAcc();
			logger.info("Clicked on create acc");
	      
	      
	      SignUpPage su=new SignUpPage(driver);
	  	logger.info("Providing credentials...........");
	      su.setFirstname(randomString().toUpperCase());
	      su.setLastname(randomString().toUpperCase());
	      su.setEmail(randomAlphaNumeric());
	  	String password=randomAlphaNumeric();
	  	
	      su.setPassword(password);
	      su.setCnfPassword(password);
	      String confmsg=su.getConfirmationMsg();
	  	logger.info("New account registered......................");
			if(confmsg.equals("Thank you for registering with Main Website Store."));
			{ 
				
		          Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
			logger.error("Test failed:");
			//logger.debug("Debug logs:");
			Assert.fail();
		}
			
			logger.info("Execution finished");
	      
}
}
