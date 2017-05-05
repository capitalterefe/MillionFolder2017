package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyAccountInformation extends WebDriverHelper {
	Utility utility = new Utility();
	By myAccountInfo = By.xpath("//h1[text()='My Account Information']");
	By logOff = By.xpath("//span[text()='Log Off']");
  
	public void verifyLogin() {
		String logOffTxt = utility.getElementText(logOff);
		Assert.assertEquals(logOffTxt, "Log Off");
	}

	public void logOff(){
	
	utility.clickOn(logOff);
	}
	}


