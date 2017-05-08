package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyAccountDetails extends WebDriverHelper {
	
	Utility utility = new Utility();
	By clickOnMyaccountAsserton =By.xpath("//h2[text() ='E-Mail Notifications']");
	By viewAccInfo = By.xpath("//a[text()='View or change my account information.']");

	public void myAccountDetailsVerfy(){
		String myAccInfoText= utility.getElementText(clickOnMyaccountAsserton);
		Assert.assertEquals( myAccInfoText, "E-Mail Notifications");
	}
		
		public void viewChangeAccontInfo(){
			utility.clickOn(viewAccInfo);
	}

}
		
		
	
	

