package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterUserHomePage extends WebDriverHelper {
	Utility utility = new Utility();
	By loginVerfy= By.xpath("//u[text()='login']");
    By myAccountInfo =By.xpath("//span[text()='My Account']");
	public void verifyRegisterUserHomePage() {
		String logintxt = utility.getElementText(loginVerfy);
		Assert.assertEquals(logintxt, "login");
	}
	
		public void myAccountInformation(){
			utility.clickOn(myAccountInfo);
		
		}
		
		
		
		
	}
